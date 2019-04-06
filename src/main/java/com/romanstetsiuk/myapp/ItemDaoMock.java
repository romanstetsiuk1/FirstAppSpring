package com.romanstetsiuk.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemDaoMock implements ItemDao {

    @Autowired
    Item snickers;

    @Override
    public Item getItemByName(String name) {
        return snickers;
    }
}
