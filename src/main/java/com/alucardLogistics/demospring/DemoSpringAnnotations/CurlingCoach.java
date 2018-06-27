package com.alucardLogistics.demospring.DemoSpringAnnotations;

import org.springframework.stereotype.Component;

@Component("CurlingForLife")
public class CurlingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Curl like you never curled before!.. for 15 min.";
	}

}
