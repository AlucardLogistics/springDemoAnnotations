package com.alucardLogistics.demospring.DemoSpringAnnotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] randomFortune = {"RandomFortuneService: Great curlings coming your way!", 
			"RandomFortuneService: You and the curling sport are one!", 
			"RandomFortuneService: Your life is Curling!.. get it?... CURLING!"};
	Random rand = new Random();
	int index = rand.nextInt(randomFortune.length);

	@Override
	public String getFortune() {
		return randomFortune[index];
	}

}
