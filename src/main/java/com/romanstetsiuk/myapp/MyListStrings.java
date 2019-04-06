package com.romanstetsiuk.myapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;


public class MyListStrings {
    List<String> lista;

    public void setLista(List<String> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "MyListStrings{" +
                "lista=" + lista +
                '}';
    }
}
