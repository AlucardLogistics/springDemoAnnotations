package com.alucardLogistics.demospring.DemoSpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//in @Component the default bean ID will be class name with lower case 'soccerCoach'
@Component
@Scope("prototype")
public class SoccerCoach implements Coach {
	
//	field injection
	@Autowired
	@Qualifier("RESTFortuneService") //for multiple implementations of fortuneService interface give the one implementation class desired to use
	private FortuneService fortuneService;
	
	//define a default constructor
	public SoccerCoach() {
		System.out.println(">> SoccerCoach: default constructor prototype <<");
		System.out.println("NOtE: SoccerCoach: if prototype scope, it will not call @PreDestroy annotation <<");
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
