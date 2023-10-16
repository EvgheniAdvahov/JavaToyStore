package org.example.Service;

import org.example.Data.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Myput {
    public static List<Toy> putToy() {
        Scanner scanner = new Scanner(System.in);
        Integer chance;
        String name;
        List<Toy> myToyList = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            Toy toy = new Toy();
            toy.setId(i);
            System.out.println("Введите шанс игрушке Nr" + i);
            toy.setChance(chance = scanner.nextInt());
            System.out.println("Введите имя игрушке Nr" + i);
            scanner.nextLine();
            name = scanner.nextLine();
            if(name.matches(".*\\d.*")){
                throw new RuntimeException("Имя не может содержать цифры!");
            }
            toy.setName(name);
            myToyList.add(toy);
        }
        return myToyList;
    }
}
