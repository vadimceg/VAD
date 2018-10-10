package com.company;

public class Main {

    public static void main(String[] args) {

        //P1
        System.out.println("Welcome to the Shopping Cart");
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println(" ");

        //P2
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message;

        message = "- " +custName +" wants to purchase a " +itemDesc;

        System.out.println(message);
        System.out.println(" ");

        //P3
        double price = 29.99;
        int quantity = 2;
        double tax = 1.04;
        double total;

        message = custName +" wants to purchase " +quantity +" " +itemDesc;

        total = quantity * price * tax;
        System.out.println("Total cost with tax: "+total);
        }

    }
