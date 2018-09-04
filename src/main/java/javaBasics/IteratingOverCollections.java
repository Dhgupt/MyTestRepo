package javaBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IteratingOverCollections {

	public static void main(String[] args) {
		// TODO The-4-methods-for-iterating-collections-in-java

		List<String> listNames = new ArrayList();
		listNames.add("Tom");
		listNames.add("Mary");
		listNames.add("Peter");
		listNames.add("John");
		listNames.add("Kim");

		System.out.println(listNames);
		// 1. The Classic For Loop -- 
		// collection must store elements and provide a method to access its elements in form of index-based
		// we must know the collection’s size beforehand.
		// index based retreival is not supported by all collections e.g. Set. Hence classic don't works for set collection. 
		
		System.out.println("Using The classic For Loop --------------------->");
		for (int i = 0; i < listNames.size(); i++) {
			String aName = listNames.get(i);
			System.out.println(aName);
		}

		// 2. The Iterator Method: 
		// the Iterator method is created to allow us to iterate all kinds of collections
		// Thus the Collection interface defines that every collection must implement the iterator() method
		// The hasNext() method returns true if the collection has more elements to traverse, otherwise return false.
		//The next() method returns the current element. Note that we don’t have to cast the returned object as we use generics.
		
		// Iterate over a list
		System.out.println("Using The Iterator Method over a list--------------------->");
		Iterator<String> iterator = listNames.iterator();
		while (iterator.hasNext()) {
			String aName = iterator.next();
			System.out.println(aName);
		}

		// Iterate over a Set
		 
		System.out.println("Using The Iterator Method over set --------------------->");
		 Set<Integer> numbers = new HashSet();
		 numbers.add(100);
		 numbers.add(35); 
		 numbers.add(89); 
		 numbers.add(71); 
		 Iterator<Integer> iterator2 = numbers.iterator(); 
		 while (iterator2.hasNext()) {
			 Integer aNumber = iterator2.next();
			 System.out.println(aNumber);
		 }
		 
		// Iterate over a HashMap
		 // Because the map stores elements in form of key=value pairs, first we need to get the iterator of the keys (a Set collection), 
		 // then use this iterator to get each key, and retrieve the value corresponds to that key

		 System.out.println("Using The Iterator Method over a HashMap--------------------->");		 
		 Map<Integer, String> mapAscii = new HashMap();
		 mapAscii.put(65, "A");
		 mapAscii.put(66, "B");
		 mapAscii.put(67, "C");
		 mapAscii.put(68, "D");
		
		 Iterator<Integer> keyIterator = mapAscii.keySet().iterator();
		
		 while (keyIterator.hasNext()) {
			 Integer key = keyIterator.next();
			 String value = mapAscii.get(key);
			 System.out.println(key + " -> " + value);
		 }

		// 3. The Enhanced For Loop:
		// The enhanced for loop actually uses an iterator behind the scenes.
		// That means the Java compiler will convert the enhanced for loop
		// syntax to iterator construct when compiling.

		System.out.println("Using The Enhanced For Loop for a List --------------------->");
		
		for (String aName : listNames) {
			System.out.println(aName);
		}

		System.out.println("Using The Enhanced For Loop for a Set --------------------->");
		
		for (Integer aNumber : numbers) {
				System.out.println(aNumber);
			}
		
		System.out.println("Using The Enhanced For Loop for a HashMap --------------------->");
		
		for (Integer key : mapAscii.keySet()) {
		    String value = mapAscii.get(key);
		    System.out.println(key + " -> " + value);
		}
		
		//4. The forEach Method with Lambda Expressions:
		
		/*	Java 8 with Lambda expressions, introduces a totally new way for iterating over collections - it’s the forEach method.
			What’s the biggest difference between the forEach method and the previous ones?
			Well, in the previous methods (classic for loop, iterator and enhanced for loop), 
			the programmers control how the collection is iterated. 
			The iteration code is not part of the collection itself - it’s written by programmers - 
			hence the term external iteration.
			In contrast, the new method encapsulates the iteration code in the collection itself, 
			thus the programmers do not have to write code for iterating collections. 
			Instead, the programmers specify what-to-do in each iteration - this is the big difference! 
			Hence the term internal iteration: 
			the collections handle the iteration itself, 
			whereas the programmers pass the action - what needs to do in each iteration.*/
		
		System.out.println("Using Lambda expression --------------------->");		
//		listNames.forEach(name -> System.out.println(name));
	}

}
