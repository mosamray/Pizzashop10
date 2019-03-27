package com.company;

/*
Project: Lab 10
Purpose Details: Refactor Pizza shop
Course: IST 242
Author: Mosam Ray
Date Developed: 3/21/19
Last Date Changed: 3/20/19
Rev: 2
 */

import java.util.ArrayList;
import java.util.Scanner;

        public class Main {
            int cCount = 1;
            public static void main(String[] args) {

                Main main = new Main();

                final char EXIT_CODE = 'E';
                final char CUST_CODE = 'C';
                final char MENU_CODE = 'M';
                final char ORDE_CODE = 'O';
                final char TRAN_CODE = 'T';
                final char CUST_PRNT = 'P';
                final char HELP_CODE = '?';
                char userAction;
                final String PROMPT_ACTION = "Add 'C'ustomer, List 'M'enu, Add 'O'rder, List 'T'ransaction or 'E'xit: ";
                ArrayList<Customer> cList = new ArrayList<>();
                ArrayList<Menu> mList = new ArrayList<>();
                ArrayList<Order> oList = new ArrayList<>();
                ArrayList<Transaction> tList = new ArrayList<>();

                /*
                Customer cust1 = new Customer(1, "Mary Smith", "215-965-8965");
                Customer cust2 = new Customer(2, "Teddy Jones", "215-862-7415");
                Customer cust3 = new Customer(3, "Jenny Jones", "215-658-8735");
                Customer cust4 = new Customer(4, "Sam Smith", "215-955-8921");
                Order order1 = new Order(1);
                Transaction trans1 = new Transaction(1,"Check");
                */


                Menu menu1;
                menu1 = new Menu(1, "Double cheese", 12.99f);
                Menu menu2;
                menu2 = new Menu(2, "Pacific veg", 13.00f);
                Menu menu3;
                menu3 = new Menu(3, "Extra meat",14.75f);
                Menu menu4;
                menu4 = new Menu(4, "Super Veg",15.00f);

                mList.add(menu1);
                mList.add(menu2);
                mList.add(menu3);
                mList.add(menu4);

                /*
                oList.add(order1);
                tList.add(trans1);
                */

                userAction = getAction(PROMPT_ACTION);

                while (userAction != EXIT_CODE) {
                    switch(userAction) {
                        case CUST_CODE : cList.add(main.addCustomer());
                            break;
                        case CUST_PRNT : Customer.printCustomer(cList);
                            break;
                        case MENU_CODE : Menu.listMenu(mList);
                            break;
                        case ORDE_CODE : //Order.listOrder(oList);
                            break;
                        case TRAN_CODE : Transaction.listTransaction(tList);
                            break;
                    }

                    userAction = getAction(PROMPT_ACTION);
                }
            }


            public static char getAction(String prompt) {
                Scanner scnr = new Scanner(System.in);
                String answer = "";
                System.out.println(prompt);
                answer = scnr.nextLine().toUpperCase() + " ";
                char firstChar = answer.charAt(0);
                return firstChar;
            }

            public Customer addCustomer(){
                Customer cust = new Customer(cCount++);
                Scanner scnr = new Scanner(System.in);
                System.out.println("Please Enter your Name: ");
                cust.setCustomerName(scnr.nextLine());
                System.out.println("Please Enter your Phone: ");
                cust.setCustomerPhoneNumber(scnr.nextLine());
                return cust;
            }



        }





