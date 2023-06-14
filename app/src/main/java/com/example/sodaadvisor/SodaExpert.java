package com.example.sodaadvisor;

import java.util.ArrayList;
import java.util.List;

// метод, который является package-private и возвращает коллекцию строк(набор строк)
public class SodaExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>(); // здесь просто объявили нашу коллекцию(коллекция хранит набор каких-то значений)

        if (color.equals("Green")) { // метод equals, который можно вызвать у любой строки, просто сравнивает то, что передаётся ему в аргумент
            brands.add("Green Cola");
            brands.add("GreenMe");
            brands.add("Mountain Dew");
        } else if (color.equals("Black")){
            brands.add("Coca-Cola");
            brands.add("Lipton Black");
            brands.add("Everlast Cola");
        } else if (color.equals("White")) {
            brands.add("Sprite");
            brands.add("Bitter Lemon");
            brands.add("Mohito");
        } else {
            brands.add("Mirinda");
            brands.add("Epsa");
            brands.add("Fentimans Rose Lemonade");
        }

        return brands;
    }
}
