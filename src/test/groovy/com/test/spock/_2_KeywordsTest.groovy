package com.test.spock

import spock.lang.Specification
import spock.lang.Unroll

class _2_KeywordsTest extends Specification {

    def "should just work"() {
        expect:
        true
    }

    // Within the 'then' and 'expect' blocks, assertions are implicit
    def "given-when-then test"() {
        given:
        int a = 1
        int b = 2

        when:
        int sum = a + b

        then:
        sum == 3
    }

    def "setup-cleanup test"() {
        setup:
        List<Integer> list = [1, 2, 3]
        and:
        int number = 1

        expect:
        number in list

        cleanup:
        list.clear()
    }

    // Asserting Exceptions
    def "should get an index out of bounds when removing a non-existent item"() {
        given:
        List<Integer> list = [1, 2, 3, 4]

        when:
        list.remove(20)

        then:
        IndexOutOfBoundsException e = thrown(IndexOutOfBoundsException)
        e.message == "Index: 20, Size: 4"
        list.size() == 4
    }

    // Parametrized tests
    def "should return the bigger number"() {
        expect:
        Math.max(a, b) == c

        where:
        a | b  | c
        1 | 0  | 1
        2 | 3  | 3
        6 | 10 | 10
    }

    // Parametrized tests with custom names
    @Unroll
    def "should return the bigger number: a = #a, b = #b"() {
        expect:
        Math.max(a, b) == c

        where:
        a | b  | c
        1 | 0  | 1
        2 | 3  | 3
        6 | 10 | 10
    }
}
