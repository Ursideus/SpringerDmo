package com.ursideus.logging;

import org.springframework.stereotype.Component;

/**
 * Created by dovw on 11/15/15.
 */

@Component("consoleWriterAlternative")
public class ConsoleWriter implements LogWriter {

    @Override
    public void log(String message) {
        System.out.println("ConsoleWriter: " + message);
    }
}
