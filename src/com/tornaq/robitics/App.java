package com.tornaq.robitics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dovw on 11/16/15.
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");

        Robot robot = (Robot)appContext.getBean("robot");
        robot.speak();

        ((ClassPathXmlApplicationContext)appContext).close();

    }
}
