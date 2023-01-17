package com.serenitydojo;

public class Dog {
    private String name = "";
    private String favoriteToy = "";
    private int age = 0;


    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = 5;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }
}
