package thinkinginjava.chap11holdingObject.page116;
/*
 * ������ Iterator
 * Iterator���ع��ĵײ�ṹ����������С����ֻ�ܵ����ƶ�
 */

import java.util.List;
import java.net.NetPermission;
import java.util.ArrayList;
import java.util.Iterator;

public class SimpleIteration {
	public static void main(String args[]) {
		List<Pet> pets = new ArrayList<Pet>(); 
		pets.add(new Cat("hellkity"));
		pets.add(new Dog("snupy"));
		pets.add(new Cattle("tony"));
		pets.add(new Sheep("happy"));
		
		Iterator<Pet> iterator = pets.iterator();
		while (iterator.hasNext()) {
			Pet pet = iterator.next();
			pet.say();
		}
		System.out.println("--------------");
		for (Pet pet:pets) {
			pet.say();
		}
		System.out.println("----------------");
		iterator = pets.iterator();
		int size = pets.size();
		for (int i = 0; i < size; i++) {
			iterator.next();
			iterator.remove();
		}
		System.out.println(pets.size());
	}
	
    
    
    
}
