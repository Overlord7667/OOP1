package com.company;

public class Main {

    public static void main(String[] args) {
        Person vitya = new Person();
        vitya.height = 120;
        vitya.say("George");
        System.out.println(vitya.height);
        Person vlad = new Person();
        System.out.print(vlad.height);
    }
}
