package com.tornaq;

/**
 * Created by dovw on 11/15/15.
 */
public class PersonFactory {

    /// method should not be static
    public Person createPerson(int id, String name) {
        System.out.println("Running factory class");
        return new Person(id, name);
    }
}
