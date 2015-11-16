package com.tornaq.robitics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by dovw on 11/16/15.
 */

@Component
public class Robot {

    private String id = "DefaultID";
    private String words = "hello";

    public void setId(@Value("${jdbc.username}") String id) {
        this.id = id;
    }

    public void setWords(@Value("${jdbc.password}") String words) {
        this.words = words;
    }

    public void speak() {
        System.out.println(id + ": " + words);
    }
}

