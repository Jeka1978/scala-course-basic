package com.demo.implicits.adapter_pattern;

/**
 * @author Evgeny Borisov
 */
public class Chair implements Costable {
    @Override
    public int cost() {
        return 10;
    }
}
