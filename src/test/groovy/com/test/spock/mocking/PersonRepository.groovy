package com.test.spock.mocking

interface PersonRepository {

    Person save(Person person)

    List<Person> saveAll(List<Person> personList)
}
