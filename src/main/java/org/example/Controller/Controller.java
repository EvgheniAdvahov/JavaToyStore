package org.example.Controller;

import org.example.Data.Customer;
import org.example.Data.Toy;
import org.example.Service.MyGet;
import org.example.Service.Myput;
import org.example.Service.Save;

import java.util.List;
import java.util.PriorityQueue;

public class Controller {
    List<Toy> myToyList = Myput.putToy();
    MyGet myGet = new MyGet(myToyList.get(0).getChance(),
            myToyList.get(1).getChance(),
            myToyList.get(2).getChance());
    PriorityQueue<Customer> priorityQueue = new PriorityQueue<>();
    Save save = new Save();
    public void start(){
        System.out.println(myToyList);
        System.out.println(myGet.Get());
        for (int i = 0; i < 10; i++) {
            priorityQueue.add(new Customer("customer"+i));
            save.SaveToFile(myGet.Get());
        }

    }
}
