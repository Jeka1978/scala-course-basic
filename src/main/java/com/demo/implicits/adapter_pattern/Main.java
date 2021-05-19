package com.demo.implicits.adapter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();

        List<Costable> costables = new ArrayList<>();
        costables.add(factory.createProduct());
        costables.add(factory.createProduct());
        costables.add(factory.createProduct());

        Calculator calculator = new Calculator();
//        calculator.total(costables);//todo fix it
    }
}
