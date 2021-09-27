package com.company;

public class Main
{
    private static int counter;
    private int registrationId;
    private String name;
    private long contactNumber;
    private String branch;
    private String reg="D";


    static
    {
        counter = 1001;

    }

    public Main(String name,long contactNumber, String branch)
    {
        this.name=name;
        this.contactNumber=contactNumber;
        this.branch=branch;
        this.registrationId=+counter;
        counter++;

    }

    public String getRegistrationId()

    {
        return reg+registrationId;
    }

    public String getName()
    {
        return name;
    }

    public long getContactNumber()
    {
        return contactNumber;
    }

    public String getBranch()
    {
        return branch;
    }


    public static void main(String[] args)
    {
        Main Student01 = new Main("Raghav",867482885,"Computer Science");
        Main Student02 = new Main("Jadhav",958275882,"Computer Science");
        Main Student03 = new Main("Pankaj",169386883,"Mechanical");
        Main Student04 = new Main("Thanos",988464646,"AIDS");
        Main Student05 = new Main("Loki",846464646,"Computer Science");
        Main Student06 = new Main("Loki",604699396,"Computer Science");
        Main Student07 = new Main("Loki",506933859,"Computer Science");

        System.out.println("Hi "+Student01.getName()+", your registration ID is "+Student01.getRegistrationId());
        System.out.println("\n");

        System.out.println("Hi "+Student02.getName()+", your registration ID is "+Student02.getRegistrationId());
        System.out.println("\n");

        System.out.println("Hi "+Student03.getName()+", your registration ID is "+Student03.getRegistrationId());
        System.out.println("\n");

        System.out.println("Hi "+Student04.getName()+", your registration ID is "+Student04.getRegistrationId());
        System.out.println("\n");

        System.out.println("Hi "+Student05.getName()+", your registration ID is "+Student05.getRegistrationId());
        System.out.println("\n");

        System.out.println("Hi "+Student06.getName()+", your registration ID is "+Student06.getRegistrationId());
        System.out.println("\n");

        System.out.println("Hi "+Student07.getName()+", your registration ID is "+Student07.getRegistrationId());
        System.out.println("\n");




    }
}
