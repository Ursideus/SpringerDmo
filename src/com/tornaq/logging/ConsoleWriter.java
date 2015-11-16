package com.tornaq.logging;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by dovw on 11/15/15.
 */

@Component
public class ConsoleWriter implements LogWriter {

    @Override
    public void log(String message) {
        System.out.println("ConsoleWriter: " + message);
    }
}
