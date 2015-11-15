package com.tornaq.logging;

/**
 * Created by dovw on 11/15/15.
 */
public class FileWriter implements LogWriter {

    @Override
    public void log(String message) {
        System.out.println("FileWriter: " + message);
    }
}
