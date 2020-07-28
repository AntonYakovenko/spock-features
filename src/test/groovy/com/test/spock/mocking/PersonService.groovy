package com.test.spock.mocking

class PersonService {

    private final PersonRepository personRepository

    PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository
    }

    List<Person> saveAll(List<Person> personList) {
        return personList.forEach({ person -> save(person) })
    }

    Person save(Person person) {
        return personRepository.save(person)
    }
}
