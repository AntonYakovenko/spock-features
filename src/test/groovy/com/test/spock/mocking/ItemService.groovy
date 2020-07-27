package com.test.spock.mocking

class ItemService {

    private final ItemRepository itemRepository

    ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository
    }

    void saveAll(List<Item> items) {
        items.forEach({ item -> save(item) })
    }

    void save(Item item) {
        itemRepository.save(item)
    }
}
