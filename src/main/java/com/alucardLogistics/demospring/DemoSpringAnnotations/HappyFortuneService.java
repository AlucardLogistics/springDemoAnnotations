package com.alucardLogistics.demospring.DemoSpringAnnotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "HappyFortuneService: Today is a lucky day!";
	}

}
