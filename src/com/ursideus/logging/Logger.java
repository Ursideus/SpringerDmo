package com.ursideus.logging;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

/**
 * Created by dovw on 11/15/15.
 */

@Component
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

    @Inject
    //@Named(value = "fileWriterNew")
    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public ConsoleWriter getConsoleWriter() {
        return consoleWriter;
    }

    @Inject
    //@Named(value = "consoleWriterAlternative")
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    public void log(String message) {
        fileWriter.log(message);
        consoleWriter.log(message);
    }

    @PostConstruct
    public void init() {
        System.out.println("Running init()");
    }

    @PreDestroy
    // @PreDestroy, not applicable to spring prototype scope !!!
    public void destroy() {
        System.out.println("Running destroy()");
    }
}
