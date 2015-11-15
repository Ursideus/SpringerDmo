package com.tornaq.person;

/**
 * Created by dovw on 11/15/15.
 */
public class Address {

    private String street;
    private String postalCode;
    private String country;

    public Address() {
        System.out.println("running default Address bean constructor: " + this);
    }

    public Address(String street, String postalCode, String country) {
        this.street = street;
        this.postalCode = postalCode;
        this.country = country;
        System.out.println("running Address bean constructor: " + this);
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCountry(String country) {
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

    public void init() {
        System.out.println("Address bean created: " + this);
    }
}
