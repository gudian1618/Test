package com.github.gudian1618.Java_2;

import java.util.Comparator;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-05-04 11:21
 * @description
 */

public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getAge()-o2.getAge();
    }
}
