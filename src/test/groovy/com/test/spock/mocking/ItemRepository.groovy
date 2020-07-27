package com.test.spock.mocking

interface ItemRepository {

    Item save(Item item)

    List<Item> saveAll(List<Item> items)
}
