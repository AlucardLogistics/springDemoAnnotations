package com.alucardLogistics.demospring.DemoSpringAnnotations;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {
	
	//in @Component the default bean ID will be class name with lower case 'soccerCoach'

	@Override
	public String getDailyWorkout() {
		return "Score two goals when Practice!";
	}

}
