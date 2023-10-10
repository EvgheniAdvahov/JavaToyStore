package org.example;

import org.example.Controller.Controller;
import org.example.Data.Customer;
import org.example.Service.MyGet;

import java.time.temporal.ChronoUnit;
import java.util.PriorityQueue;

public class MainApp {
    public static void main(String[] args) {
//        Controller controller = new Controller();
        Customer customer1 = new Customer("customer1");
        Customer customer2 = new Customer("customer2");
        Customer customer3 = new Customer("customer3");
        Customer customer4 = new Customer("customer4");
        PriorityQueue<Customer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(customer3);
        priorityQueue.add(customer2);
        priorityQueue.add(customer1);
        priorityQueue.add(customer4);
        System.out.println(priorityQueue);
        priorityQueue.remove();
        System.out.println(priorityQueue);
//        controller.start();
        
    }
}
