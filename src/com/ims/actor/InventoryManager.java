package com.ims.actor;

class InventoryManager {
    int id;
    String  name;
    Address address;

    InventoryManager() {
        System.out.println("Inventory Manager Constructed");
    }

    InventoryManager(String name, Address address) {
        this();
        this.name = name;
        this.address = address;
        System.out.println("Assignments Done");
    }

    // returnType methodName(){ //method definition -> return statement}
    void checkProfileDashboard() {
        System.out.println("Please selection an option : ");
        System.out.println("Press 1 for Viewing Profile Details");
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
