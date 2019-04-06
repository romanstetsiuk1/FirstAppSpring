package com.romanstetsiuk.myapp;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository("mysql")
//@Profile("mysql")
public class ItemDaoImplMysql implements ItemDao {


    @Override
    public Item getItemByName(String name) {
        return null;
    }
}
