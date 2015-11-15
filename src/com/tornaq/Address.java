package com.tornaq;

/**
 * Created by dovw on 11/15/15.
 */
public class Address {

    private String street;
    private String postalCode;
    private String country;

    public Address(String street, String postalCode, String country) {
        this.street = street;
        this.postalCode = postalCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
