package com.test.spock

class Publisher {
    private List<Subscriber> subscribers

    void send(String message) {
        throw new RuntimeException("method send() not implemented!")
    }
}
