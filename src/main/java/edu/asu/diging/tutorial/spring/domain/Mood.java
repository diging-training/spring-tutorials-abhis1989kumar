
package edu.asu.diging.tutorial.spring.domain;
 
public class Mood {
 
    private String feeling;
    private String explanation;
 
 

public Mood(int num) {
        
    	switch (num) {
		case 1:
			feeling="sad";
			setExplanation("I had a very long day!!!");
			break;
		case 2:
			feeling = "happy";
			setExplanation("Boss asked me take a leave tomorrow");
			break;
		case 3:
			feeling = "tired";
			setExplanation("slept late at night");
			break;
			
		default:feeling = "confused";
		setExplanation("i dont know what is life all about ..unicorns maybe!!!");
		}
    }
 
    public String getFeeling() {
        return feeling;
    }
 
    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }
    
    public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
}