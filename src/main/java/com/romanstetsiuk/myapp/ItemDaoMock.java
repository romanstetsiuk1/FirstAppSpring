package com.romanstetsiuk.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile("mock")
@Primary        // alternativ way like Profile, but Profile is better
public class ItemDaoMock implements ItemDao {

    @Autowired
    Item snickers;

    @Override
    public Item getItemByName(String name) {
        return snickers;
    }
}
