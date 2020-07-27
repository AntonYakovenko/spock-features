package com.test.spock

import spock.lang.Specification

class MockingTest extends Specification {

    private Publisher publisher = Mock()

    private Subscriber firstSubscriber = Mock()
    private Subscriber secondSubscriber = Mock()


}
