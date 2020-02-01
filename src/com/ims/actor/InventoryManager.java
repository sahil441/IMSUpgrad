package com.ims.actor;

class InventoryManager extends SystemUser {

    InventoryManager() {
        super(null,null);
        System.out.println("Inventory Manager Constructed");
    }

    InventoryManager(String name, Address address) {
        super(name,address);
        setName(name);
        setAddress(address);
        System.out.println("Assignments Done");
    }

    // returnType methodName(){ //method definition -> return statement}
    void checkProfileDashboard() {
        System.out.println("Please selection an option : ");
        System.out.println("Press 1 for Viewing Profile Details");
    }
}
