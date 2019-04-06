package com.romanstetsiuk.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
    ItemDao itemDao;

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

        Item item = itemDao.getItemByName("asddsaasd");
        System.out.println(item);
    }
}
