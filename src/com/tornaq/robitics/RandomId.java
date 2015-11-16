package com.tornaq.robitics;

import java.util.Random;

/**
 * Created by dovw on 11/16/15.
 */
public class RandomId {

    public int getId() {
        Random random = new Random();
        return random.nextInt(1000);
    }
}
