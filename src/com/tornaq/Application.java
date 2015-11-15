package com.tornaq;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
        //ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //Person person = new Person();
        //Person person = appContext.getBean(Person.class);
        Person person = (Person) appContext.getBean("person");
        person.speak();
        System.out.println("Person's info: " + person.toString());

        /// close app context before exit
        ((ClassPathXmlApplicationContext)appContext).close();

    }



//    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
//        MessagePrinter printer = context.getBean(MessagePrinter.class);
//        printer.printMessage();
//    }

}
