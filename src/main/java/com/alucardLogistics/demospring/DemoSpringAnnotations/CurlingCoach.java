package com.alucardLogistics.demospring.DemoSpringAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("CurlingForLife")
public class CurlingCoach implements Coach {
	
	private FortuneService fortuneService;
	
//	constructor injection
//	@Autowired
//	public CurlingCoach(FortuneService theFortuneService) {
//		this.fortuneService = theFortuneService;		
//	}
	
	//default constructor
	public CurlingCoach() {
		System.out.println(">> CurlingCoach default constructor <<");
		System.out.println(">> CurlingCoach Life Cycle Demo <<");
	}
	
//	setter injection
	@Autowired
	@Qualifier("randomFortuneService")
	public void setCurlingMove(FortuneService theFortuneService) {
		System.out.println("CurlingCoach: @Autowired setCurlingMove() << will look for any class that implements FortuneService interface");
		fortuneService = theFortuneService;
	}
	
	//define init method
	@PostConstruct
	public void doTheInitStuff() {
		System.out.println("********* CurlingCoach: doTheInitStuff");
	}
	
	//define destroy method
	@PreDestroy
	public void doTheDestroyStuff() {
		System.out.println("********* CurlingCoach: doTheDestroyStuff");
	}

	@Override
	public String getDailyWorkout() {
		return "Curl like you never curled before!.. for 15 min.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
