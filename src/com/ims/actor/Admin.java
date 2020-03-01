package com.ims.actor;

// class <className>
public class Admin extends SystemUser {
    //DataType nameofattribute;

    Supplier[] suppliers = new Supplier[1000];

    public Admin() {
        super(null, null);
        System.out.println("Admin constructed !!");
    }

    public Admin(String n, Address address) {
        super(n, address);
    }

    // returnType methodName(){ //method definition -> return statement}
    public void checkProfileDashboard() {
        System.out.println("Please press: ");
        System.out.println("4 for logout");
        System.out.println("7 adding a inventory Manager");
        System.out.println("8 checking inventory managers");
        System.out.println("9 adding a supplier");
        System.out.println("10 for checking supplier");
    }


    public void addSupplier(Supplier supplier) {
        // Store the supplier
        int id = storeSupplier(supplier);
        supplier.setId(id);
        mapSupplier(supplier);
        // Mapping of the supplier to the administrator
    }

    // Storing a supplier
    private int storeSupplier(Supplier supplier) {
        // Store supplier
        return -1;
    }

    // Mapping a supplier with Admin
    private void mapSupplier(Supplier supplier) {

    }

    @Override
    public boolean login(String userName, String password) {
        if("admin".equalsIgnoreCase(userName) && "admin".equalsIgnoreCase(password)) {
            loggedIn=true;
            return true;
        }
        loggedIn=false;
        return false;
    }
}
