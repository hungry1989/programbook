package thinkinginjava.chap4controlflow.page047;
/*
 * 1.带标签的break会中断标签所指的循环
 * 2.带标签的continue会到达标签的位置，并重新进入紧接着标签的循环
 */

public class LabeldWhile {
    public static void main(String args[]) {
    	int i=0;
    	outer:
    		for(int k = 0;k<10;k++){
    			
    			while (true) {
    				   System.out.println("Outer while loop");
    					i++;
    				System.out.println("i= " +i);
    				if(i == 1) {
    					System.out.println("continue");
    					continue;
    				}
    				
    				if(i == 3){
    					k++;
    					System.out.println("continue outer");
    					continue outer;
    				}
    				
    				if(i == 5) {
    					System.out.println("break");
    					break;
    				}
    				
    				if(i == 7){
    					System.out.println("break outer");
    					break outer;
    				}
    				System.out.println("k = "+k);
    				}
    		}
    		
    		
    }
}
