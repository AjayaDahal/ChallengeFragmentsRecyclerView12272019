package com.example.challengefragmentsrecyclerview12272019;

public class Person {
    private String name;
    private String model;
    private String make;
    private String phone;



    public Person(String name, String model, String make, String phone) {
        this.name = name;
        this.model = model;
        this.make = make;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }
}
