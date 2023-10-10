package org.example.Service;

import org.example.Data.Customer;

import java.util.Random;

public class MyGet {
    private int n1;
    private int n2;
    private int n3;

    public MyGet(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public Integer Get(Customer customer){
        int sum = n1 + n2 + n3;
        System.out.println("n1=" + n1 + " n2=" + n2+" n3="+ n3 + " Sum = "+ sum);
        Random rand = new Random();
        int chance = rand.nextInt(100);
        if (chance < ((n1 * 100)/sum) ) {
            System.out.println((n1 * 100)/sum + "%");
            return n1;
        } else if (chance < ((n2 * 100)/sum)) {
            System.out.println((n2 * 100)/sum + "%");
            return n2;
        }else{
            System.out.println((n3 * 100)/sum + "%");
            return n3;
        }
    }
}
