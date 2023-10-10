package org.example.Data;

public class Customer implements Comparable<Customer> {

    String name;
    Integer id;
    static int count = 1;

    public Customer(String name) {
        this.name = name;
        this.id = count;
        count++;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public int compareTo(Customer other) {
        return this.id-other.id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

