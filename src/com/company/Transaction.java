package com.company;

import java.util.ArrayList;

enum paymentType {cash, credit, check}

public class Transaction {
    //Class Level Variables - Protect the data
    private int transactionId;
    private Order order;
    private paymentType pType;

    public Transaction(paymentType pType) {
        this.pType = pType;
    }

    //Constructor Method
    public Transaction(int _transactionId, Order _order, paymentType _pType){
        this.transactionId = _transactionId;
        this.order = _order;
        this.pType = _pType;
    }


    //Setters and Getters
    public int getTransactionId() { return transactionId; }
    public void setTransactionId(int _transactionId) { this.transactionId = _transactionId; }

    public Order getOrder() { return order; }
    public void setOrder(Order _order) { this.order = _order; }

    public paymentType getpaymentType() { return pType; }
    public void setpaymentType(paymentType _pType) { this.pType = _pType; }

    public static void listTransaction(ArrayList<Transaction> tList) {
        for (Transaction trans: tList){
            System.out.println("Transaction ID: " + trans.getTransactionId());
            //System.out.println("Order:" + trans.getOrder());  //TODO: Print order
            System.out.println("Payment Type: " + trans.getpaymentType());
        }

        /*
        for (Transaction trans1: tList){
            System.out.println("Transaction ID: 1");
            System.out.println("Order: Super veg");
            System.out.println("Payment Type: check");
        }

        for (Transaction trans2: tList){
            System.out.println("Transaction ID: 2");
            System.out.println("Order: Double cheese");
            System.out.println("Payment Type: cash");
        }

        for (Transaction trans3: tList){
            System.out.println("Transaction ID: 3");
            System.out.println("Order: Pacific veg");
            System.out.println("Payment Type: check");
        }

        for (Transaction trans4: tList){
            System.out.println("Transaction ID: 4");
            System.out.println("Order: Extra meat");
            System.out.println("Payment Type: cash");
        }
        */
    }
}



