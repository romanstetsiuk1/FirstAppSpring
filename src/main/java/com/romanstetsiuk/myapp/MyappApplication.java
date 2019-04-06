package com.romanstetsiuk.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

import java.util.List;

@SpringBootApplication
public class MyappApplication implements CommandLineRunner {

    final
    String applicationName;

    final
    Double version;

    @Autowired
    public MyappApplication(String applicationName, Double version) {
        this.applicationName = applicationName;
        this.version = version;
    }

    @Autowired
    Store store;

    @Autowired
    @Qualifier("mysql")
    ItemDao itemDao;

    @Autowired
    MyListStrings mylist;

    @Autowired
    StringEffect apply;

    public static void main(String[] args) {
        SpringApplication.run(MyappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("Hello word!");
//
//        System.out.println(applicationName);
//
//        System.out.println(version);
//
//        System.out.println(store);

//        Item item = itemDao.getItemByName("asddsaasd");
//        System.out.println(item);

//        System.out.println(mylist);
        String s = "ala ma kota";

        System.out.println(apply.apply(s));

    }
}
