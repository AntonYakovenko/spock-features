package com.test.spock

import spock.lang.Specification

class KeywordsTest extends Specification {

    def "should just work"() {
        expect:
        true
    }

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
}
