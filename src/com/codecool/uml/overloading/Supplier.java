package com.codecool.uml.overloading;

import java.util.List;

public class Supplier {

    private static int nextId = 1;
    private final int id;
    private String name;
    private String description;

    public Supplier() {
        this.id = nextId++;
    }

    public Supplier(String name, String description) {
        this.id = nextId++;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts() {
        return Product.getAllProductsBy(this);
    }

    @Override
    public String toString() {
        return ("id: " + this.id +
                ", " +
                "name: " + this.name +
                ", " +
                "description: " + this.description);
    }

}
