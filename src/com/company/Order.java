package com.company;

import java.util.*;

public class Order {
    //Class Level Variables - Protect the data
    private int orderId;
    private Customer cust;
    private ArrayList<Menu> menuItem;


    //Constructor Method
    public Order(int _orderId) { this.orderId = _orderId; }


    //Setters and Getters
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int _orderId){this.orderId = _orderId;}


    /*
    public static void listOrder(ArrayList<Order> oList) {
        for (Order order1: oList){
            System.out.println("order ID: 1");
            System.out.println("Order Name: Super veg");
            System.out.println("Order Price: 15.00f");
            System.out.println("Customer Name: Mary Smith");
            System.out.println("Customer phoneNumber: 215-965-8965");
            System.out.println("payment type: cash");
        }

        for (Order order2: oList){
            System.out.println("order ID: 2");
            System.out.println("Order Name: Double cheese");
            System.out.println("Order Price: 12.99f");
            System.out.println("Customer Name: Teddy Jones");
            System.out.println("Customer phoneNumber: 215-862-7415");
            System.out.println("payment type: check");
        }

        for (Order order3: oList){
            System.out.println("order ID: 3");
            System.out.println("Order Name: Pacific veg");
            System.out.println("Order Price: 13.00f");
            System.out.println("Customer Name: Jenny Jones");
            System.out.println("Customer phoneNumber: 215-658-8735");
            System.out.println("payment type: cash");
        }

        for (Order order4: oList){
            System.out.println("order ID: 4");
            System.out.println("Order Name: Extra meat");
            System.out.println("Order Price: 14.75f");
            System.out.println("Customer Name: Sam Smith");
            System.out.println("Customer phoneNumber: 215-955-8921");
            System.out.println("payment type: check");
        }
        */
    }













