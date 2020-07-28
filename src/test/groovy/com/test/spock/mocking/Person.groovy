package com.test.spock.mocking

class Person {

    private Long id
    private String name

    Person(Long id, String name) {
        this.id = id
        this.name = name
    }

    Long getId() {
        return id
    }

    String getName() {
        return name
    }

    boolean equals(o) {
        if (this.is(o)) return true
        if (getClass() != o.class) return false

        Person item = (Person) o

        if (id != item.id) return false
        if (name != item.name) return false

        return true
    }

    int hashCode() {
        int result
        result = (id != null ? id.hashCode() : 0)
        result = 31 * result + (name != null ? name.hashCode() : 0)
        return result
    }
}
