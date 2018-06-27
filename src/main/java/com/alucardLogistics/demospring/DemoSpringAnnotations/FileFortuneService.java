package com.alucardLogistics.demospring.DemoSpringAnnotations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
	private String fileName = "D:/Programming/Spring Apps/springDemoAnnotations/src/main/java/fortune-data.txt";
	private List<String> theFortunes;
	
	private Random random = new Random();
	
	public FileFortuneService() {
		
		File theFile = new File(fileName);
		
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		//initialize the array List
		theFortunes = new ArrayList<String>();
		
		//read fortunes from file
		try(BufferedReader br = new BufferedReader(
						new FileReader(theFile))) {
			String tempLine;
			
			while((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getFortune() {
		int index = random.nextInt(theFortunes.size());
		return theFortunes.get(index);
	}

}
