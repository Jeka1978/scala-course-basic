package com.demo.traits;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Zoo {
    private static List<Animal> animals = new ArrayList<>();
    public static void addAnimal(Animal animal){


        animals.add(animal);
    }

    public static void makeNoise(){
        animals.forEach(Animal::makeVoice);
    }
}
