package com.ims.actor;

public class InventoryManager extends SystemUser {

    public InventoryManager() {
        super(null, null);
        System.out.println("Inventory Manager Constructed");
    }

    public InventoryManager(String name, Address address) {
        super(name, address);
        System.out.println("Assignments Done");
    }

    // returnType methodName(){ //method definition -> return statement}
    public void checkProfileDashboard() {
        if(loggedIn == false) {
            System.out.println("Please login first!");
        }
        System.out.println("Please selection an option : ");
        System.out.println("Press 1 for Viewing Profile Details");
    }

    public boolean login(String userName, String password) {
        if("inventoryManager".equalsIgnoreCase(userName) && "inventoryManager".equalsIgnoreCase(password)) {
            loggedIn=true;
            return true;
        }
        loggedIn=false;
        return false;
    }
}
