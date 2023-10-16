

package com.entity;

public class PersonTester {
    public static void main(String[] args) {

        StringBuilder address = new StringBuilder("2234 Maple Ave, Ralphtown, PA, 19000");
        int age = 45;
        String name = "Ralph";

        Person p = new Person(name, address, age);

        address.append("-0005");
        name = "Ralph's Wife";
        age = 40;

        Person p2 = new Person(name, address, age);
        System.out.println(p);
        System.out.println(p2);
    }
}