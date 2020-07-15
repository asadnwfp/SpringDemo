package com.kister.springdemo.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//@SpringBootApplication
public class SpringdemoApplication {

    public static void main(String[] args) {


//        SpringApplication.run(SpringdemoApplication.class, args);
        ApplicationContext context = new FileSystemXmlApplicationContext("src\\main\\java\\com\\kister\\springdemo\\beans\\Person.xml");
        Person person = (Person)context.getBean("person");
        person.speak();

        Address address = (Address)context.getBean("address");
        System.out.println(address.toString());
        System.out.println(person.toString());

        ((FileSystemXmlApplicationContext)context).close();


    }

}
