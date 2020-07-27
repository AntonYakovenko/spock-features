package com.test.spock

class Subscriber {
    void receive(String message) {
        throw new RuntimeException("method receive not implemented")
    }
}