package com.demo.implicits.adapter_pattern;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class ProductFactory {
    public Costable createProduct() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return new Chair();
        } else {
            return new Table();
        }
    }
}
