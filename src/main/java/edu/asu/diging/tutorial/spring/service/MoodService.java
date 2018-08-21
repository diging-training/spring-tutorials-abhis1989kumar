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
}