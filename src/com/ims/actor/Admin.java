package com.ims.actor;
// class <className>
class Admin {
    //DataType nameofattribute;
    private int id;
    private String  name;
    Address address;
    Supplier[] suppliers = new Supplier[1000];

    Admin() {
        System.out.println("Admin constructed !!");
    }

    Admin(String n, Address address) {
        setName(n);
        this.address = address;
    }

    // returnType methodName(){ //method definition -> return statement}
    void checkProfileDashboard() {
        System.out.println("Please selection an option : ");
        System.out.println("Press 1 for Viewing Profile Details");
    }

    public void addSupplier(Supplier supplier) {
        // Store the supplier
        int id = storeSupplier(supplier);
        supplier.id=id;
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

    public String getName() {
      return name;
    }

    public void setName(String name) {
        if(name == null || name == "") {
            // Generate an alarm
        }
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
