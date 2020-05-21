package thinkinginjava.chap11holdingObject.page116;
/*
 * 迭代器 Iterator
 * Iterator不必关心底层结构，创建代价小，但只能单向移动
 */

import java.util.List;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class CrossContainerIteration {
	public static void main(String args[]) {
		
		ArrayList<Pet> pets = new ArrayList<Pet>(); 
		pets.add(new Cat("hellkity"));
		pets.add(new Dog("snupy"));
		pets.add(new Cattle("tony"));
		pets.add(new Sheep("happyday1"));
		
		LinkedList<Pet> petsLL = new LinkedList<Pet>(pets);
		HashSet<Pet> petsHS = new HashSet<>(pets);
		TreeSet<Pet> petsTS = new TreeSet<>(pets);
		
		display(pets.iterator());
		System.out.println("-----------");
		display(petsLL.iterator());
		System.out.println("-----------");
		display(petsHS.iterator());
		System.out.println("-----------");
		display(petsTS.iterator());
	}
	
	public static void display(Iterator<Pet> iterator) {
		while(iterator.hasNext()) {
			Pet pet = iterator.next();
			pet.say();
		}
	}
    
    
    
}
