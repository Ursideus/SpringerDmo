package com.tornaq.logging;

import org.springframework.beans.factory.annotation.Autowired;

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
    @Autowired(required = true)
    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public ConsoleWriter getConsoleWriter() {
        return consoleWriter;
    }
    @Autowired(required = false)
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    public void log(String message) {
        fileWriter.log(message);
        consoleWriter.log(message);
    }
}
