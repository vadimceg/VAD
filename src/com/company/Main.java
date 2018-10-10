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

        //P3
        double price = 29.99;
        int quantity = 2;
        double tax = 1.04;
        double total;

        message = "- " +custName +" wants to purchase " +quantity +" " +itemDesc;

        total = quantity * price * tax;
        System.out.println("Total cost with tax: "+total);
        System.out.println(" ");

        //P4
        if (quantity > 1){
            message = message +"s";
        }

        boolean outOfStock = false;
        if (outOfStock){
            System.out.println(itemDesc +" is out of stock.");
        }

        else {
            System.out.println(message);
            System.out.println("Total cost with tax: "+total);
            System.out.println(" ");
        }

        //P5
        String[] items = {"Shirt", "Socks", "Scarf", "Belt"};

        message = "- " +custName +" wants to choose from " + items.length +" items.";
        System.out.println(message);

        System.out.println("(" +items[0] +")"); // если в массиве вставить номер [4] - то программа выдаст ошибку.
        System.out.println(" ");

        //P6
        String[] items2 = new String[4];
        items2[0] = "Shirt";
        items2[1] = "Belt";
        items2[2] = "Scarf";
        items2[3] = "Skirt";

        message = "- " +custName +" wants to purchase " +items2.length +" items.";
        System.out.println(message);

        System.out.println("Items purchased: ");
        for (String item : items2) {
            System.out.println(item + ". ");
        }

        

        }

    }
