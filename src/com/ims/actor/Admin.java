package com.ims.actor;
// class <className>
class Admin {
    //DataType nameofattribute;
    int id;
    String  name;
    Address address;

    Admin() {
        System.out.println("Admin constructed !!");
    }

    Admin(String n, Address address) {
        name=n;
        this.address = address;
    }

    // returnType methodName(){ //method definition -> return statement}
    void checkProfileDashboard() {
        System.out.println("Please selection an option : ");
        System.out.println("Press 1 for Viewing Profile Details");
    }

    String getName() {
      return name;
    }
}
