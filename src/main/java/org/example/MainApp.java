package org.example;

import org.example.Controller.Controller;
import org.example.Data.Customer;
import org.example.Service.MyGet;

import java.time.temporal.ChronoUnit;
import java.util.PriorityQueue;

public class MainApp {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.start();
        
    }
}
