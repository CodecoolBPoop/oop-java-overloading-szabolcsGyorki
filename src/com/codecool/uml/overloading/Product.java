package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Product {

    private static int nextId = 1;
    private final int id;
    private String name;
    private float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;
    private static List<Product> productList = new ArrayList<>();

    public Product() {
        this.id = nextId++;
        productList.add(this);
    }

    public Product(String name, float defaultPrice, Currency defaultCurrency) {
        this.id = nextId++;
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
        productList.add(this);
    }

    public int getId() {
        return this.id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public static List<Product> getAllProductsBy(ProductCategory productCategory) {
        List<Product> productsByCategory = new ArrayList<>();
        for (Product product : productList) {
            if (product.getProductCategory().equals(productCategory))
                productsByCategory.add(product);
        }
        return productsByCategory;
    }

    public static List<Product> getAllProductsBy(Supplier supplier) {
        List<Product> productsBySupplier = new ArrayList<>();
        for (Product product : productList) {
            if (product.getSupplier().equals(supplier))
                productsBySupplier.add(product);
        }
        return productsBySupplier;
    }

    @Override
    public String toString() {
        return ("id: " + this.id +
                ", " +
                "name: " + this.name +
                ", " +
                "default price: " + this.defaultPrice +
                ", " +
                "default currency: " + this.defaultCurrency +
                ", " +
                "product's category: " + this.productCategory +
                ", " +
                "supplier: " + this.supplier);
    }
}
