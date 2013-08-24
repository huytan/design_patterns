package com.tonyx.lab.liskov.utils;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: 7-dic-2006
 * Time: 16.37.37
 * To change this template use File | Settings | File Templates.
 */
public abstract class InstanceGenerator {
    protected Random random = null;

    public abstract Object getAnInstance();
    
    public void reproducibleRandomReset() {
        if (random == null) {
            random = new Random();
            random.setSeed(0);
        } else
            random.setSeed(0);
    }

    public void reproducibleRandomReset(long seed) {
        if (random == null) {
            random = new Random();
            random.setSeed(seed);
        } else
            random.setSeed(seed);
    }

    public void randomRandomReset() {
        if (random == null)
            random = new Random(System.currentTimeMillis());
        else
            random.setSeed(System.currentTimeMillis());
    }
}
