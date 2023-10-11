package org.example.Controller;

import org.example.Data.Customer;
import org.example.Data.Toy;
import org.example.Service.CustomerList;
import org.example.Service.MyGet;
import org.example.Service.Myput;
import org.example.Service.Save;

import java.util.List;
import java.util.PriorityQueue;

public class Controller {
    List<Toy> myToyList = Myput.putToy();
    MyGet myGet = new MyGet(myToyList.get(0),
            myToyList.get(1),
            myToyList.get(2));
    PriorityQueue<Customer> priorityQueue = new PriorityQueue<>();
    CustomerList customerList = new CustomerList();
    Save save = new Save();
    public void start(){
        priorityQueue =customerList.CustomerDraw();
        System.out.println(priorityQueue);
        System.out.println(myToyList);
        int queueLength = priorityQueue.size();
        for (int i = 0; i < queueLength; i++) {
            Customer customerWinner = priorityQueue.poll();
            System.out.println("customerWinner = " + customerWinner);
            save.SaveToFile(myGet.Get(customerWinner));
        }
    }
}
