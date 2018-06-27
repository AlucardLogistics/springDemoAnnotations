package com.alucardLogistics.demospring.DemoSpringAnnotations;

import org.springframework.stereotype.Component;

@Component("theSoccerCoach")
public class SoccerCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Score two goals when Practice!";
	}

}
