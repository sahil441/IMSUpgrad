package com.ims.actor;

class IMS {
    public static void main(String[] args) {
        Admin admin = new Admin("Sahil","1171","GT Road","Delhi",110007);

        System.out.println(admin.name);
        System.out.println(admin.buildingNumber);
        System.out.println(admin.streetName);
        System.out.println(admin.pincode);

        Admin admin2 = new Admin();
    }
}
