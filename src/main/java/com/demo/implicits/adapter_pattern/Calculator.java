package com.demo.implicits.adapter_pattern;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Calculator {

    public int total(List<Pricable> pricables) {
       return pricables.stream().mapToInt(Pricable::price).sum();
    }
}
