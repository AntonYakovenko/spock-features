package com.test.spock.mocking

import spock.lang.Specification

class MockingTest extends Specification {

    private ItemService processor
    private ItemRepository repository

    def setup() {
        repository = Mock(ItemRepository)
        processor = new ItemService(repository)
    }

    def "should save processed items"() {
        given:
        List<Item> items = [new Item(1L), new Item(2L), new Item(3L)]

        when:
        processor.saveAll(items)

        then:
        3 * repository.save(_)
    }
}
