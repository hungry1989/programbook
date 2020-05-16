package thinkinginjava.chap10innerclass.page101;
/*
 * create inner class
 */
public class Parcel1 {
     class Contents {
    	 
    	 private int i =11;
    	 public int value() {
    		 return i;
    	 }
     }
     
     class Destinaton{
    	 private String label;
    	 Destinaton(String whereTo) {
            label = whereTo;
    	 }
    	 String readLabel() {
    		 return label;
    	 }
     }
     
     public void ship(String dest) {
    	 Contents contents  = new Contents();
    	 Destinaton destinaton = new Destinaton(dest);
    	 System.out.println(destinaton.readLabel());
    	 System.out.println(contents.value());
     }
     
     public static void main(String args[]) {
    	 Parcel1 parcel1 = new Parcel1();
    	 parcel1.ship("Tasmania");
     }
}
