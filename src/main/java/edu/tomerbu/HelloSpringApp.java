package edu.tomerbu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        //load the spring configuration file:
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve the bean from spring container:
        Coach theCoach = context.getBean("cricketCoach", Coach.class);
        Coach protoCoach = context.getBean("cricketCoach", Coach.class);



        //call methods on the bean:
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());


        //Hash Comparison for identity:
        System.out.println("\n\nFirst coach:");
        System.out.println(Integer.toHexString(System.identityHashCode(theCoach)));
        System.out.println(theCoach);

        System.out.println("\n\nOther coach:");
        //Hash Comparison for identity:
        System.out.println(Integer.toHexString(System.identityHashCode(protoCoach)));
        System.out.println(protoCoach);


        //cleanup:
        context.close();


    }

}