package com.alucardLogistics.demospring.DemoSpringAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml"); 
		//retrieve bean from spring container
		Coach soccerCoach = context.getBean("soccerCoach", Coach.class);
		
		Coach otherSoccerCoach = context.getBean("soccerCoach", Coach.class);
		
		
		
		//check if they are the same
		boolean result = (soccerCoach == otherSoccerCoach);
		
		//print result
		System.out.println("SoccerCoach class has now a @Scope of type prototype!");
		System.out.println("soccerCoach and otherSoccerCoach are the same? " + result);
		System.out.println("soccerCoach memory location: " + soccerCoach);
		System.out.println("otherSoccerCoach memory location: " + otherSoccerCoach);
		
		//close context
		context.close();

	}

}
