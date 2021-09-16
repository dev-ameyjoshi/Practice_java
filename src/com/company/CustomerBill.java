package com.company;
//getter and setter method.
//accessing and assigning values to private methods.
//You have to display information of the student that is age roll number

public class CustomerBill {
    private int customerId;
    private double billAmount;
    private static int counter;

    static {
        counter = 101;
    }

    public CustomerBill(double billAmount){
        this.customerId = CustomerBill.counter;
        this.billAmount = billAmount;
        CustomerBill.counter++;

    }

    public int getCustomerId(){
        return customerId;
    }
    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        CustomerBill.counter = counter;
    }

    public static void main(String[]args){
        CustomerBill cb = new CustomerBill(2500.0);
        CustomerBill cb1 = new CustomerBill(4500.0);
        System.out.println("Id : "+ cb.getCustomerId());
        System.out.println("Bill : " +cb.getBillAmount());

        System.out.println("Id : "+ cb1.getCustomerId());
        System.out.println("Bill : " +cb1.getBillAmount());
    }
}
