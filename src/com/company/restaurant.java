package com.company;

public class restaurant {
   static  String restaurantName;
   static String restaurantContact;
   static  String restaurantAddress;
   static String rating;

    public restaurant(String restaurantName, String restaurantContact , String restaurantAddress, String  rating ){
        this.restaurantName = restaurantName;
        this.restaurantContact = restaurantContact;
        this.restaurantAddress = restaurantAddress;
        this.rating = rating;
    }

    public static String getRestaurantName() {
        return restaurantName;
    }

    public static String getRestaurantContact() {
        return restaurantContact;
    }

    public static String getRestaurantAddress() {
        return restaurantAddress;
    }

    public static String getRating() {
        return rating;
    }

    public static void main(String[] args) {

         restaurant s1 = new restaurant("McDonald’s ","1234567890","SG101,KP,Pune","4.1");
        System.out.println("Restaurant Name : " + restaurant.getRestaurantName());
        System.out.println("Restaurant Contact : " + restaurant.getRestaurantContact());
        System.out.println("Restaurant Address : " + restaurant.getRestaurantAddress());
        System.out.println("Restaurant Rating : " + restaurant.getRating());

    }
}
