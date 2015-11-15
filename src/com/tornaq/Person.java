package com.tornaq;

import org.springframework.stereotype.Component;

/**
 * Created by dovw on 11/15/15.
 */

@Component
public class Person {

    private int id;
    private String name;
    private int taxId;
    private Address address;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /// basic factory method
    public static Person getInstance(int id, String name) {
        System.out.println("Running person's factory method");
        return new Person(id, name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taxId=" + taxId +
                ", address=" + address +
                '}';
    }

    public void speak() {
        System.out.println("I am a person");
    }

    public void onCreate() {
        System.out.println("Person bean created: " + this);
    }

    public void onDestroyed() {
        System.out.println("Person bean destructed: " + this);
    }
}
