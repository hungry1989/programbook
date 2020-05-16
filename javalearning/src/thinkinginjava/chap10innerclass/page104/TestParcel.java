package thinkinginjava.chap10innerclass.page104;

public class TestParcel {
   
	 public static void main(String args[]) {
		 Parcel4 parcel4 = new Parcel4();
		 Contents contents = parcel4.contents();
		 Destination destination =  parcel4.destination("Tasmania");
		 
	 }
	
}
