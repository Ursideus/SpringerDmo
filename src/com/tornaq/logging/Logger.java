package com.tornaq.logging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by dovw on 11/15/15.
 */
public class Logger {

    private FileWriter fileWriter;

    private ConsoleWriter consoleWriter;

    public Logger() {}

    public Logger(FileWriter fileWriter, ConsoleWriter consoleWriter) {
        this.fileWriter = fileWriter;
        this.consoleWriter = consoleWriter;
    }

    public FileWriter getFileWriter() {
        return fileWriter;
    }
    @Autowired
    @Qualifier("defaultFileWriter")
    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public ConsoleWriter getConsoleWriter() {
        return consoleWriter;
    }
    @Autowired
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    public void log(String message) {
        fileWriter.log(message);
        consoleWriter.log(message);
    }
}
