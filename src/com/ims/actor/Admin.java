package com.ims.actor;
// class <className>
class Admin extends SystemUser {
    //DataType nameofattribute;

    Supplier[] suppliers = new Supplier[1000];

    Admin() {
        System.out.println("Admin constructed !!");
    }

    Admin(String n, Address address) {
        setName(n);
        setAddress(address);
    }

    // returnType methodName(){ //method definition -> return statement}
    void checkProfileDashboard() {
        System.out.println("Please selection an option : ");
        System.out.println("Press 1 for Viewing Profile Details");
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
}
