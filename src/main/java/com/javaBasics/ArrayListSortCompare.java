/*-----------------------------------Arraylist ---------------------------------------
 * Arraylist <type> al = new Arraylist<type>();
 * add
 * remove
 * size
 * iterator
 * while (iterator.hasNext())
 * collections.sort(ArrayList);
 * collections.sort(ArrayList, ReverseOrder);
 * boolean resultcompList = listOne.equals(listTwo);
 * -----------------------------------------------------------------------------------*/

package com.javaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSortCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arrays.sort() vs Collections.sort();
		// Arrays.sort works for arrays which can be of primitive data type
		// also.
		// Collections.sort() works for objects Collections like ArrayList,
		// LinkedList, etc

		// Create a list of strings
		ArrayList<String> al = new ArrayList<String>();
		al.add("Geeks For Geeks");
		al.add("Friends");
		al.add("Dear");
		al.add("Is");
		al.add("Superb");
		al.add("Dheeraj");
		al.add("Kumar");
		al.add("Gupta");

		/*
		 * Collections.sort method is sorting the elements of ArrayList in
		 * ascending order.
		 */
		Collections.sort(al);

		// Let us print the sorted list
		System.out.println("List after the use of" + " Collection.sort() :\n" + al);

		Collections.sort(al, Collections.reverseOrder());

		// Let us print the sorted list
		System.out.println("List after the use of" + " Collection.sort() - Reverse order:\n" + al);

		List<String> listOne = new ArrayList<String>();
		List<String> listTwo = new ArrayList<String>();

		listOne.add("overflow");
		listOne.add("stack");
		listOne.remove(1);
	
		listTwo.add("stack");
		listTwo.add("overflow");

		Collections.sort(listOne);
	    Collections.sort(listTwo);
	    boolean resultcompList = listOne.equals(listTwo);
		System.out.println("resultcompList: " + resultcompList);
		
		boolean resultcompArray = Arrays.equals(listOne.toArray(), listTwo.toArray());
		System.out.println("resultcompArray: " + resultcompArray);
	}

}
