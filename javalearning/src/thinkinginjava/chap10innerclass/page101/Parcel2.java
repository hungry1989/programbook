package thinkinginjava.chap10innerclass.page101;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/*
 * return a reference to an inner class
 */
public class Parcel2 {
    
	 class Contents{
		 private int i =11;
		 public int value() {
			return i;
		}
	 }
	 
	 class Destination{
		 private String label;
		 public Destination(String whereTo) {
             label = whereTo;
		 }
		 String readLabel() {
			 return label;
		 }
	 }
	 
	 public Destination to(String s) {
		 return new Destination(s);
	 }
	 
	 public Contents contents() {
		 return new Contents();
	 }
	 
	 public void ship(String dest) {
		 Contents contents = contents();
		 Destination destination = to(dest);
		 System.out.println(destination.readLabel());
		 System.out.println(contents.value());
	 }
	 
	 public static void main(String args[]) {
		  Parcel2 parcel2 = new Parcel2();
		  parcel2.ship("Tasmania");
		  Parcel2 qParcel2 = new Parcel2();
		  Parcel2.Contents contents = qParcel2.contents();
		  Parcel2.Destination destination = qParcel2.to("Borneo");
	 }
}
