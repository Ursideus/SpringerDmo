package com.tornaq.logging;

import org.springframework.stereotype.Component;

/**
 * Created by dovw on 11/15/15.
 */

@Component("fileWriterNew")
public class FileWriter implements LogWriter {

    @Override
    public void log(String message) {
        System.out.println("FileWriter: " + message);
    }
}
