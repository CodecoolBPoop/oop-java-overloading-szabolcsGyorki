package com.codecool.uml.overloading;

import java.util.*;

public class Webshop {

    public static void main(String[] args) {
        Date startDate = new GregorianCalendar(2018, Calendar.JUNE, 2).getTime();
        Date endDate = new GregorianCalendar(2018, Calendar.JUNE, 11).getTime();

        List<Product> productList = new ArrayList<>();

        Currency usd = Currency.getInstance("USD");
        Currency euro= Currency.getInstance("EUR");

        Supplier anonim = new Supplier();
        anonim.setName("anonim");
        Supplier apple = new Supplier("Apple", "Apple Inc");
        Supplier nokia = new Supplier("Nokia", "Nokia Corp.");

        ProductCategory watches = new ProductCategory("Watches", "Wearable", "Mechanical and smart watches");
        ProductCategory smartphones = new ProductCategory("Smartphones", "Mobile", "Mobiles with OS");
        FeaturedProductCategory tablets = new FeaturedProductCategory();

        tablets.setName("Tablets");
        tablets.setDepartment("Mobile");
        tablets.schedule(startDate, endDate);

        Product appleWatch = new Product("Apple Watch", 299, usd);
        appleWatch.setProductCategory(watches);
        appleWatch.setSupplier(apple);

        Product fitbit = new Product("Fitbit Sport", 39, usd);
        fitbit.setProductCategory(watches);
        fitbit.setSupplier(anonim);

        Product nokia8 = new Product("Nokia 8", 499, euro);
        nokia8.setProductCategory(smartphones);
        nokia8.setSupplier(nokia);

        Product galaxys9 = new Product("Samsung Galaxy S9", 699, usd);
        galaxys9.setProductCategory(smartphones);
        galaxys9.setSupplier(anonim);

        Product nokiaSirocco = new Product();
        nokiaSirocco.setName("Nokia Sirocco 2018");
        nokiaSirocco.setProductCategory(smartphones);
        nokiaSirocco.setDefaultCurrency(euro);
        nokiaSirocco.setDefaultPrice(699);
        nokiaSirocco.setSupplier(nokia);

        Product surface = new Product("MS Surface Pro", 1299, usd);
        surface.setSupplier(anonim);
        surface.setProductCategory(tablets);


        productList.add(appleWatch);
        productList.add(fitbit);
        productList.add(nokia8);
        productList.add(galaxys9);
        productList.add(nokiaSirocco);
        productList.add(surface);

        for (Product product : productList) {
            System.out.println(product.getId());
            System.out.println(product.getName());
            System.out.println(product.getProductCategory().getName());
            System.out.println(product.getSupplier());
            System.out.println(product.getDefaultPrice());
            System.out.println(product.getDefaultCurrency());
        }

        System.out.println("WATCHES");
        for (Product product : watches.getProducts()) {
            System.out.println(product.toString());
        }

        System.out.println();
        System.out.println("SMARTPHONES");
        for (Product product : smartphones.getProducts()) {
            System.out.println(product.toString());
        }

        System.out.println(tablets.getStartDate() + "  " + tablets.getEndDate());
    }
}
