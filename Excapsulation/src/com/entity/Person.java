
 
package com.entity;
 
// Person 'Bean'
public class Person {
    private String name;
    private StringBuilder address;
    private int age;
 
    public Person(String name, StringBuilder address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public StringBuilder getAddress() {
        return address;
    }
 
    public void setAddress(StringBuilder address) {
        this.address = address;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", age=" + age +
                '}';
    }
}