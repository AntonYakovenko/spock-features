package com.test.spock.mocking

import spock.lang.Specification

class MockingTest extends Specification {

    private PersonService service
    private PersonRepository repository

    def setup() {
        repository = Mock(PersonRepository)
        service = new PersonService(repository)
    }

    // strict mocking
    def "should save person"() {
        given:
        Person person = new Person(1L, "John")

        when:
        Person savedPerson = service.save(person)

        then:
        1 * repository.save(new Person(1L, "John")) >> new Person(1L, "John")
        savedPerson == new Person(1L, "John")
    }

    // non strict mocking
    def "should save processed person with conditional mock"() {
        given:
        Person johnDoe = new Person(1L, "John Doe")
        Person johnBrown = new Person(2L, "John Brown")

        when:
        Person savedJohnDoe = service.save(johnDoe)
        and:
        Person savedJohnBrown = service.save(johnBrown)

        then:
        2 * repository.save({ Person person -> person.name.startsWith("John") }) >> new Person(1L, "John")
        savedJohnDoe.name == "John"
        savedJohnBrown.name == "John"
    }

    // mocking with wildcard
    def "should save people"() {
        given:
        List<Person> persons = [new Person(1L, "John"), new Person(2L, "Ann"), new Person(3L, "Chris")]

        when:
        service.saveAll(persons)

        then:
        3 * repository.save(_)
    }
}
