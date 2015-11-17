package com.tornaq.robitics;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by dovw on 11/16/15.
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");

        //Robot robot = (Robot)appContext.getBean("robot");
        //robot.speak();

        //BasicDataSource dataSource = (BasicDataSource)appContext.getBean("dataSource");

        OfferDao offerDao = (OfferDao)appContext.getBean("offerDao");
        List<Offer> offers = offerDao.getOffers();

        for (Offer offer: offers) {
            System.out.println(offer);
        }

        ((ClassPathXmlApplicationContext) appContext).close();

    }
}
