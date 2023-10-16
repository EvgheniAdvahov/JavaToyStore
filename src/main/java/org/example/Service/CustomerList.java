package org.example.Service;
import org.example.Data.Customer;
import java.util.PriorityQueue;
import java.util.Scanner;

public class CustomerList {
    PriorityQueue<Customer> priorityQueue = new PriorityQueue<>();
    public PriorityQueue<Customer> CustomerDraw(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во покупателей");
        Integer numberCustomer = scanner.nextInt();
        for (int i = 1; i <= numberCustomer; i++) {
            priorityQueue.add(new Customer("customer" + i));
        }
        return priorityQueue;
    }
}
