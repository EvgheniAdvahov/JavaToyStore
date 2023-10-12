package org.example.Service;
import org.example.Data.Customer;
import org.example.Data.Toy;
import java.util.Random;

public class MyGet {
    private int n1;
    private int n2;
    private int n3;
    private Toy toy1, toy2, toy3;


    public MyGet(Toy toyA, Toy toyB, Toy toyC) {
        toy1 = toyA;
        toy2 = toyB;
        toy3 = toyC;
        this.n1 = toyA.getChance();
        this.n2 = toyB.getChance();
        this.n3 = toyC.getChance();
    }

    public String Get(Customer customer){
        int sum = n1 + n2 + n3;
        System.out.println("n1=" + n1 + " n2=" + n2+" n3="+ n3 + " Sum = "+ sum);
        Random rand = new Random();
        int chance = rand.nextInt(100);
        if (chance < ((n1 * 100)/sum) ) {
            System.out.println((n1 * 100)/sum + "%");
            return customer.getName() + " win: id=" + Integer.toString(toy1.getId()) + " " + toy1.getName();
        } else if (chance < (((n2 * 100)/sum)+ ((n2 * 100)/sum))) {
            System.out.println((n2 * 100)/sum + "%");
            return customer.getName() + " win: id=" + Integer.toString(toy2.getId()) + " " + toy2.getName();
        }else{
            System.out.println((n3 * 100)/sum + "%");
            return customer.getName() + " win: id=" + Integer.toString(toy3.getId()) + " " + toy3.getName();
        }
    }
}
