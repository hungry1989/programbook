package working;
/*
 */
public class Question3 {
	  private Question3(){
		  
	  }
	  private static  Question3 question3 = null; 
	  private int t = 0;
	  public static Question3 getInstance() {
		  if(question3==null) {
			  question3 = new Question3();
		  }
		  return question3;
	  }	
}
