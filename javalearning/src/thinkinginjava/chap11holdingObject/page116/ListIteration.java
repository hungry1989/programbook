package thinkinginjava.chap11holdingObject.page116;
/*
 * 迭代器 Iterator
 * Iterator不必关心底层结构，创建代价小，但只能单向移动
 */

import java.util.List;
import java.util.ListIterator;

import javax.swing.text.IconView;

import java.net.NetPermission;
import java.util.ArrayList;
import java.util.Iterator;

public class ListIteration {
	public static void main(String args[]) {
		List<Pet> pets = new ArrayList<Pet>();
		pets.add(new Cat("hellkity"));
		pets.add(new Dog("snupy"));
		pets.add(new Cattle("tony"));
		pets.add(new Sheep("happy"));

		ListIterator<Pet> iterator = pets.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next()+"."+iterator.nextIndex()
			+"."+iterator.previousIndex()+";");
		}
		System.out.println("--------------");
	   
		while(iterator.hasPrevious()) {
			iterator.previous().say();
		}
		System.out.println("--------------");
		iterator = pets.listIterator(2);
		while(iterator.hasNext()) {
			iterator.next().say();
			
		}
		System.out.println("--------------");
		iterator.set(iterator.previous());
		System.out.println("--------------");
	}
	
    
    
    
}
