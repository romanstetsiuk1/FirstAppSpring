package com.romanstetsiuk.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanConfiguration {

    @Bean
    String applicationName() {
        return "my application";
    }

    @Bean
    Double version() {
        return 1.0;
    }

    @Bean
    Item snickers() {
        Item item = new Item();
        item.setName("Snickers");
        item.setDescription("chokolate");
        item.setPrice(1.2);
        return item;
    }

    @Bean
    Item cola() {
        Item item = new Item();
        item.setName("Cola");
        item.setDescription("cherry");
        item.setPrice(2.1);
        return item;
    }

    @Bean
    Store store() {
        Store store = new Store();
        List<Item> items = new ArrayList();
        items.add(snickers());
        items.add(cola());
        store.setItems(items);
        return store;
    }


}
