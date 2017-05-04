package com.haasjustin.com.haasjustin.superhero;

import java.util.Scanner;

/**
 * Created by justinhaas on 5/3/17.
 */
public class Superhuman extends Human {

    private String alliance;
    private String power;

    public Superhuman(String superName, String theirAlliance, String theirPower) {
        super();
        setName(superName);
        alliance = theirAlliance;
        power = theirPower;
    }

    public void setAlliance(String theirAlliance) {
        alliance = theirAlliance;
    }

    public void setPower(String theirPower) {
        power = theirPower;
    }

    public String getAlliance() {
        return alliance;
    }

    public String getPower() {
        return power;
    }


    public static void main(String[] args) {


        Superhuman batman = new Superhuman("Batman", "Justice League", "Literally the best");
        batman.setAge(30);
        batman.setAddress("Gotham City");
        batman.setOccupation("Millionaire");
        batman.setGender("Male");
        batman.setAlliance("Justice League");
        batman.setPower("Literally the best");
        Scanner scn = new Scanner(System.in);
        System.out.println(scn.next("Name: " + " " + batman.getName()));

        System.out.println(scn.next("Age: " + " " + batman.getAge()));

        System.out.println(scn.next("Gender: " + " " + batman.getGender()));

        System.out.println(scn.next("Address: " + " " + batman.getAddress()));

        System.out.println(scn.next("Occupation: " + " " + batman.getOccupation()));

        System.out.println(scn.next("Alliance: " + " " + batman.getAlliance()));

        System.out.println(scn.next("Power: " + " " + batman.getPower()));
        scn.close();
    }
}

