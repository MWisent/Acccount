package com.account;

public class Address {
    private String town;
    private String postCode;
    private String street;
    private int houseNumber;

    public Address(String town, String postCode, String street, int houseNumber) {
        this.town = town;
        this.postCode = postCode;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getTown() {
        return town;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "town='" + town + '\'' +
                ", postCode='" + postCode + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
