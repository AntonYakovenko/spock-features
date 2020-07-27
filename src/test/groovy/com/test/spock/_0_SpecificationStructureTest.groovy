package com.test.spock


import spock.lang.Specification

class _0_SpecificationStructureTest extends Specification {

    // fixture methods: setupSpec(), setup(), cleanup(), cleanupSpec()
    def setupSpec() {
        println("setupSpec()")
    }

    def setup() {
        println("setup()")
    }

    def cleanup() {
        println("cleanup()")
    }

    def cleanupSpec() {
        println("cleanupSpec()")
    }

    def "first feature method"() {
        String testName =  specificationContext.currentFeature.name
        println("Execution of $testName")

        expect:
        true
    }

    def "second feature method"() {
        String testName =  specificationContext.currentFeature.name
        println("Execution of $testName")

        expect:
        true
    }
}
