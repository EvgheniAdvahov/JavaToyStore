package org.example.Service;

import org.example.Data.Customer;

import java.util.PriorityQueue;
import java.util.Scanner;

public class CreateCustomerList {
    PriorityQueue<Customer> priorityQueue = new PriorityQueue<>();

    public void CustomerDraw(){
        Scanner scanner = new Scanner(System.in);
        Integer numberCustomer = scanner.nextInt();
        for (int i = 0; i < numberCustomer; i++) {
            priorityQueue.add(new Customer("customer" + i));
        }
    }
}
