
package edu.asu.diging.tutorial.spring.domain;
 
public class Mood {
 
    private String feeling;
 
  public Mood(int num) {
        
    	switch (num) {
		case 1:
			feeling="sad";
			break;
		case 2:
			feeling = "happy";
			break;
		case 3:
			feeling = "tired";
			break;
			
		default:feeling = "confused";
		}
    }
 
    public String getFeeling() {
        return feeling;
    }
 
    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }
}