package thinkinginjava.chap4controlflow.page047;
/*
 * 1.����ǩ��break���жϱ�ǩ��ָ��ѭ��
 * 2.����ǩ��continue�ᵽ���ǩ��λ�ã������½�������ű�ǩ��ѭ��
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
