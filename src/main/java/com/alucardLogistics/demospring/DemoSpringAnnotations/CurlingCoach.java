package com.alucardLogistics.demospring.DemoSpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
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
	}
	
//	setter injection
	@Autowired
	public void setCurlingMove(FortuneService theFortuneService) {
		System.out.println(">> CurlingCoach: @Autowired setCurlingMove() << will look for any class that implements FortuneService interface");
		fortuneService = theFortuneService;
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
