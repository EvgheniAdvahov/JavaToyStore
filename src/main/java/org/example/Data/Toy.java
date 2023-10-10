package org.example.Data;

public class Toy {
    Integer id;
    Integer chance;
    String name;

    public Toy() {
    }

    public Toy(Integer id, Integer chance, String name) {
        this.id = id;
        this.chance = chance;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChance() {
        return chance;
    }

    public void setChance(Integer chance) {
        this.chance = chance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", chance=" + chance +
                ", name='" + name + '\'' +
                '}';
    }
}
