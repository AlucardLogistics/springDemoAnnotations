package com.alucardLogistics.demospring.DemoSpringAnnotations;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "RESTFortuneService: Today is a lucky day!";
	}

}
