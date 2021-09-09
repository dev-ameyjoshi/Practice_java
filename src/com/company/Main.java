package com.company;

public class Main {
    int id = 8;
    String name ="Amey";
    // Why do we have to create main as the static?
    public static void main(String[] args) {
        Main s = new Main();
        System.out.println(s.id);
        System.out.println(s.name);
    }
}
