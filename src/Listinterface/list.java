package Listinterface;

import java.util.*;


// List : Interface---->java.util(import)
//list types------->1.ArrayList---->insertion order--->search easy[insertion/deletion is difficult]
//                  2.LinkedList--->insertion order--->[insertion/deletion---search-->difficult]
//                  3.Vector------>insertion order[its not mandatory]outdated	

// List---->list is index based one --->allows duplicate---->supports both normal loop & foreach loop
//methods in list
//                   li.add();                           li.set(index,value);
//                   li.size();                          li.indexof(value);
//                   li.get(index);                      li.lastindexof(value);              
//                   li.add(index,value);                li.contains(value);
//                   li.remove(index);                   li.addAll();
//                   li.retainAll();                     li.removeAll();
                   
public class list {
	public static void main(String[] args) {
		List li = new ArrayList();
		//Generic form
		
		//to insert values in the list
		li.add(10);
		li.add(20);
		li.add("John");
		li.add(55.5f);
		//System.out.println(li);
	
		List<Float> li1 = new ArrayList<Float>();
		
		li1.add(100.00f);
		li1.add(200.00f);
		li1.add(300.00f);
		li1.add(400.00f);
		li1.add(55.00f);
	//	li1.add(1000);
		
	//	System.out.println(li1);
		
		
		
		
		List<Long> lil1 = new LinkedList<Long>();
		
		lil1.add(10000255984l);
		lil1.add(20023657896l);
		lil1.add(3003369875256l);
		//li1.add(400.00f);
		//li1.add(55.00f);
		
	//	System.out.println(lil1);
	
		
		
		li.addAll(li1);
		System.out.println(li);
		li.addAll(lil1);
		System.out.println(li);
		li.add(2,30);
		System.out.println(li);
		int size = li.size();
		System.out.println(size);
		Object object = li.get(3);
		System.out.println(object);
		li.add(3, 40);
		System.out.println(li);
	    li.remove(4);
		System.out.println(li);
		li.retainAll(li1);
		System.out.println(li);
		li.set(3, 90);
		System.out.println(li);
		int indexOf = li.indexOf(90);
		System.out.println(indexOf);
		int lastIndexOf = li.lastIndexOf(55.0f);
		System.out.println(lastIndexOf);
		boolean contains = li.contains(90);
		System.out.println(contains);
		li.removeAll(li1);
		System.out.println(li);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
