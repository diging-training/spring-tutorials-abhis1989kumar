package edu.asu.diging.tutorial.spring.service;
 
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;
 
import edu.asu.diging.tutorial.spring.domain.Mood;



 
@Service
public class MoodService {
 
public static int counter=0;

	public Mood getCurrentMood() {
		
		
		int randomNum=0;
		
		while(randomNum ==counter)
		{
			randomNum = ThreadLocalRandom.current().nextInt(0, 4);
		}
		System.out.println(randomNum);
        counter=randomNum;
		return new Mood(randomNum);
    }
	
	
	public String getExplanation(String mood) {
		
		String output="";
		switch (mood) {
		case "sad":
			output="I had a very long day!!!";
			break;
		case "happy":
		
			output="Boss asked me take a leave tomorrow";
			break;
			
		case "tired":
			
			output="slept late at night";
			break;
			
		case "confused":
		output="i dont know what is life all about ..unicorns maybe!!!";
		}
		
		return output;
	
	}
}