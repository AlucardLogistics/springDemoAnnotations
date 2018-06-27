package com.alucardLogistics.demospring.DemoSpringAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp 
{
    public static void main( String[] args ) {
        
    	//read spring config file
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
    	
    	//get the bean from spring container
    	Coach theCoach = context.getBean("soccerCoach", SoccerCoach.class);
    	//curlingCoach @Component has a custom ID
    	Coach curlingCoach = context.getBean("CurlingForLife", CurlingCoach.class);
    	
    	//call a method on the bean
    	System.out.println("Scanned the class components trough the package.");
    	System.out.println("theCoach: " + theCoach.getDailyWorkout());
    	System.out.println("curlingCoach: " + curlingCoach.getDailyWorkout());
    	
    	
    	//close the contexts
    	context.close();
    }
}
