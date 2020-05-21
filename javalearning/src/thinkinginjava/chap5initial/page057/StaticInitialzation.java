package thinkinginjava.chap5initial.page057;

class Bowl{
	public Bowl(int marker) {
		// TODO Auto-generated constructor stub
		System.out.println("Bowl("+marker+")");
	}
	
	void f(int marker) {
		System.out.println("f1("+marker+")");
	}
}

public class StaticInitialzation {
	static Bowl bow2 = new Bowl(2);
	
	 //Bowl bow1 = new Bowl(1);
     public static void main(String args[]) {
     	Bowl bow1 = new Bowl(1);
    	 System.out.println("hello world");
    	//bow2.f(22);
    //	bow1.f(11);
     }
     public  static void dotest() {
    	 Bowl bow3 = new Bowl(3);
     }
}
