package com.example.sodaadvisor;

import java.util.ArrayList;
import java.util.List;

// метод, который является package-private и возвращает коллекцию строк(набор строк)
public class SodaExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>(); // здесь просто объявили нашу коллекцию(коллекция хранит набор каких-то значений)

        if (color.equals("Black")) { // метод equals, который можно вызвать у любой строки, просто сравнивает то, что передаётся ему в аргумент
            brands.add("Coca-Cola");
            brands.add("Lipton Black");
            brands.add("Everlast Cola");
        } else {
            brands.add("Mirinda");
            brands.add("Lipton Green");
            brands.add("Sprite");
        }

        return brands;
    }
}
