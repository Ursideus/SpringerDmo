package com.tornaq.robitics;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

        System.out.println("Got Offer by id: " + offerDao.getOffer(10));

        offerDao.delete(15);
        offerDao.delete(21);
        offerDao.delete(22);

        String currentTime = new SimpleDateFormat("h:mm a").format(new Date());

        offerDao.updateOffer(11, "Extremely unbelievable offer: " + currentTime);

        offerDao.create(new Offer(15, "Mr. No", "mr.no@email.com", "Simple offer text"));

        List<Offer> newOffers = new ArrayList<Offer>();
        newOffers.add(new Offer(21, "Mr. Batch1", "mr.batch1@email.com", "Offer to Mr. Batch1"));
        newOffers.add(new Offer(22, "Mr. Batch2", "mr.batch2@email.com", "Offer to Mr. Batch2"));

        offerDao.create(newOffers);

        List<Offer> offers = offerDao.getOffers();

        for (Offer offer: offers) {
            System.out.println(offer);
        }

        ((ClassPathXmlApplicationContext) appContext).close();

    }
}
