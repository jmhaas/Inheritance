package com.haasjustin.com.haasjustin.superhero;

/**
 * Created by justinhaas on 5/3/17.
 */


class Human {

    private String name;
    private int age;
    private String gender;
    private String occupation;
    private String address;

    public Human() {
    }

    public Human(String name, int age, String gender, String occupation, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public String getOccupation() {
        return this.occupation;
    }

    public String getAddress() {
        return this.address;
    }

}
