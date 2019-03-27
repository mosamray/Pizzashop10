package com.company;

import java.util.ArrayList;

public class Customer {
    //Class Level Variables - Protect the data
    private int customerId;
    private String CustomerName;
    private String CustomerPhoneNumber;

    //Constructor Method
    public Customer(int _customerId) {
        this. customerId = _customerId;  //Increments the ID count
    }

    //Setters and Getters
    public int getCustomerId() { return customerId; }
    public void setCustomerId(int _customerId) { this.customerId = _customerId; }

    public String getCustomerName() { return CustomerName; }
    public void setCustomerName(String _customerName) { this.CustomerName = _customerName; }

    public String getCustomerPhoneNumber() { return CustomerPhoneNumber; }
    public void setCustomerPhoneNumber(String _customerPhoneNumber) { this.CustomerPhoneNumber = _customerPhoneNumber; }

    public static void printCustomer(ArrayList<Customer> cList){
        for (Customer cust: cList){
            System.out.println("Customer Id:" + cust.getCustomerId());
            System.out.println("Customer Name:" + cust.getCustomerName());
            System.out.println("Customer Phone:" + cust.getCustomerPhoneNumber());
        }
        /*
        for (Customer cust1: cList){
            System.out.println("Customer Id: 1");
            System.out.println("Customer Name: Mary Smith");
            System.out.println("Customer phone: 215-965-8965");
        }

        for (Customer cust2: cList){
            System.out.println("Customer Id: 2");
            System.out.println("Customer Name: Teddy Jones");
            System.out.println("Customer phone: 215-862-7415");
        }

        for (Customer cust3: cList){
            System.out.println("Customer Id: 3");
            System.out.println("Customer Name: Jenny Jones");
            System.out.println("Customer phone: 215-658-8735");
        }

        for (Customer cust4: cList){
            System.out.println("Customer Id: 4");
            System.out.println("Customer Name: Sam Smith");
            System.out.println("Customer phone: 215-955-8921");
        }
        */
    }

   }


