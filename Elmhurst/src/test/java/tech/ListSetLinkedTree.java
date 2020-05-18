package tech;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListSetLinkedTree {
	
	public static void main(String[] args) {
		
		List <Integer> myList = new ArrayList <Integer>();
		
		myList.add(10);
		myList.add(10);
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(null);
		myList.add(null);
		
		System.out.println(myList);
		
		Set <Integer> mySet = new HashSet <Integer>();
		
		mySet.add(20);
		mySet.add(20);
		mySet.add(30);
		mySet.add(40);
		mySet.add(50);
		mySet.add(null);
		mySet.add(null);
		
		System.out.println(mySet);
		
		Set <Integer> myLink = new LinkedHashSet <Integer>();
		//insersion order. come first print first and one null
		
		myLink.add(10);
		myLink.add(10);
		myLink.add(40);
		myLink.add(50);
		myLink.add(null);
		myLink.add(null);
		
		System.out.println(myLink);
		
		Set <Integer> myTree = new TreeSet <Integer>();
        //Tree doesn't allow null and it is assending order
		
		myTree.add(7);
		myTree.add(5);
		myTree.add(10);
		myTree.add(20);
		myTree.add(30);
		myTree.add(1);
		
		System.out.println(myTree);
	}

}
