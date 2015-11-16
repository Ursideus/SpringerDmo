package com.tornaq.robitics;

import org.springframework.stereotype.Component;

/**
 * Created by dovw on 11/16/15.
 */

@Component
public class Robot {

    private String id = "DefaultID";
    private String words = "hello";

    public void setId(String id) {
        this.id = id;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public void speak() {
        System.out.println(id + ": " + words);
    }
}

