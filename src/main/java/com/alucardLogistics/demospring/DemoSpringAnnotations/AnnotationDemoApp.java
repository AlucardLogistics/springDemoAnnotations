package com.alucardLogistics.demospring.DemoSpringAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp 
{
    public static void main( String[] args ) {
        
    	//read spring config file
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
    	
    	//get the bean from spring container
    	Coach theCoach = context.getBean("soccerCoach", Coach.class);
    	//curlingCoach @Component has a custom ID
    	Coach curlingCoach = context.getBean("CurlingForLife", CurlingCoach.class);
    	Coach pingPongCoach = context.getBean("pingPongCoach", PingPongCoach.class);
    	
    	PingPongCoach pipoCoach = context.getBean("pingPongCoach", PingPongCoach.class);
    	
    	//call a method on the bean
    	System.out.println("AnnotationDemoApp: Scanned the class components trough the package.");
    	System.out.println("SoccerCoach: theCoach: " + theCoach.getDailyWorkout());
    	System.out.println("CurlingCoach: curlingCoach: " + curlingCoach.getDailyWorkout());
    	
    	//call method to get the daily fortune
    	System.out.println("SoccerCoach: theCoach fortune service autowired -> " + theCoach.getDailyFortune());
    	System.out.println("CurlingCoach: curlingCoach fortune service autowired -> " + curlingCoach.getDailyFortune());
    	System.out.println("pingPongCoach: " + pingPongCoach.getDailyFortune());
    	
    	//use @Value annotation
    	System.out.println("pipoCoach email: " + pipoCoach.getEmail());
    	System.out.println("pipoCoach team: " + pipoCoach.getTeam());
    	
    	
    	//close the contexts
    	context.close();
    }
}
