package com.alucardLogistics.demospring.DemoSpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//in @Component the default bean ID will be class name with lower case 'soccerCoach'
@Component
public class SoccerCoach implements Coach {
	
//	field injection
	@Autowired
	private FortuneService fortuneService;
	
	//define a default constructor
	public SoccerCoach() {
		System.out.println(">> SoccerCoach: default constructor <<");
	}

//	NOTE
//	As of Spring Framework 4.3, an @Autowired annotation on such a constructor is no longer necessary 
//	if the target bean only defines one constructor to begin with. However, if several constructors are available, 
//	at least one must be annotated to teach the container which one to use.
	
//	constructor injection
//	@Autowired
//	public SoccerCoach(FortuneService theFortuneService) {
//		this.fortuneService = theFortuneService;		
//	}
	
//	setter injection
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println(">> SoccerCoach: @Autowired setFortuneService() << will look for any class that implements FortuneService interface");
//		this.fortuneService = theFortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Score two goals when Practice!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
