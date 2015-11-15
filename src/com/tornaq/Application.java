package com.tornaq;

import com.tornaq.logging.Logger;
import com.tornaq.person.Address;
import com.tornaq.person.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
        //ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //Person person = new Person();
        //Person person = appContext.getBean(Person.class);
        /*
        Person person = (Person) appContext.getBean("person");
        person.speak();
        System.out.println("Person's info: " + person.toString());

        Person factoryperson = (Person)appContext.getBean("factoryperson");
        factoryperson.speak();
        System.out.println("Person's info: " + factoryperson.toString());

        Address propertyAddress = (Address)appContext.getBean("property_address");
        System.out.println("Property address info: " + propertyAddress.toString());

        Address constructorAddress = (Address)appContext.getBean("constructor_address");
        System.out.println("Property address info: " + constructorAddress.toString());
        */
        Logger logger = (Logger)appContext.getBean("logger");
        logger.log("New app event");


        /// close app context before exit
                ((ClassPathXmlApplicationContext) appContext).close();

    }



//    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
//        MessagePrinter printer = context.getBean(MessagePrinter.class);
//        printer.printMessage();
//    }

}
