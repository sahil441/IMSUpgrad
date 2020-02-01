package com.ims.actor;

public class Supplier {

    int id;
    String  name;
    Address address;

    public Supplier() {
        System.out.println("Supplier Constructed!");
    }

    public Supplier(String name, Address address) {
        this();
        this.name = name;
        this.address = address;
        System.out.println("Assignments Done");
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
