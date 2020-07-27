package com.test.spock

import spock.lang.Shared
import spock.lang.Specification

class _1_SharedFieldsTest extends Specification {

    private Object uniqueObject = new Object()
    @Shared
    private Object sharedObject = new Object()

    def "should transform message to lowercase"() {
        println("first feature method")
        println("unique object: " + uniqueObject)
        println("shared object: " + sharedObject)

        expect:
        true
    }

    def "second feature method"() {
        println("second feature method")
        println("unique object: " + uniqueObject)
        println("shared object: " + sharedObject)

        expect:
        true
    }
}
