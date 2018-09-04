package javaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare an array
		String[] aArray = new String[5];
		String[] bArray = {"a","b","c", "d", "e"};
		String[] cArray = new String[]{"a","b","c","d","e"};
		int[] intArray = { 1, 2, 3, 4, 5 };
		
		//1. Print an array in Java
		
		// print directly will print reference value
		System.out.println("print directly will print reference value ---------------------------------->");
		
		System.out.println(intArray);
		System.out.println(aArray);
		System.out.println(bArray);
		System.out.println(cArray);
		
		//Prints the values 
		System.out.println("print the array values ---------------------------------->");
		System.out.println("aArray " + Arrays.toString(intArray));
		System.out.println("aArray " + Arrays.toString(aArray));
		System.out.println("bArray " + Arrays.toString(bArray));
		System.out.println("cArray " + Arrays.toString(cArray));
		
		//2. Check if an array contains a certain value
		
		System.out.println("Check if an array contains a certain value ---------------------------------->");		
		boolean b = Arrays.asList(bArray).contains("f");
		System.out.println(b);
		
		//3. Concatenate two arrays
		
		System.out.println("concatenate two arrays ---------------------------------->");				
		int[] intArray2 = { 6, 7, 8, 9, 10 };
		int[] combinedArray = ArrayUtils.addAll(intArray, intArray2);
		System.out.println(Arrays.toString(combinedArray));
		
			
		//5. Declare an array inline
		method(new String[]{"a", "b", "c", "d", "e"});
		
		System.out.println("Joins the elements of the provided array into a single String ----------------->");					
		//6. Joins the elements of the provided array into a single String
		String j = StringUtils.join(new String[] { "a", "b", "c" }, ", ");
		System.out.println(j);
		
		//7. Convert an Array to arrayList 

		System.out.println("Convert an Array to arrayList  ---------------------------------->");		
		String[] stringArray = { "a", "b", "c", "d", "e" };
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
		System.out.println(arrayList);
		
		//8. Convert an arrayList to an Array
		System.out.println("Convert an arrayList to Array and using for loop to print----------------------------->");			
		String[] stringArr = new String[arrayList.size()];
		arrayList.toArray(stringArr);
		for (String s : stringArr)
			System.out.println(s);
		
		//8. Convert an array to a set
		System.out.println("Convert an Array to Set  ---------------------------------->");			
		Set<String> set = new HashSet<String>(Arrays.asList(stringArray));
		System.out.println(set);
		//[d, e, b, c, a]
		
		//9. Reverse an array
		System.out.println("Reverse element of an array  ---------------------------------->");			
		ArrayUtils.reverse(intArray);
		System.out.println(Arrays.toString(intArray));
		
		//10. Remove element of an array
		System.out.println("Remove element of an array  ---------------------------------->");			
		int[] removed = ArrayUtils.removeElement(intArray, 3);//create a new array
		System.out.println(Arrays.toString(removed));
		
		System.out.println("Done");
		
		//11. sort an array
		System.out.println("Sorting an integer array  ---------------------------------->");		
		int[] unsortedArray = {2,6,5,3,1,0,-1};
		Arrays.sort(unsortedArray);
		for (int i: unsortedArray )
			System.out.println(i);
		
		//12. Sorting an String array
		System.out.println("Sorting an String array  ---------------------------------->");		
		String[] unsortedStringArray = {"dheeraj","kumar","Gupta"};
		Arrays.sort(unsortedStringArray);
		for (String s: unsortedStringArray )
			System.out.println(s);
	
	}

	private static void method(String[] strings) {
		// TODO Auto-generated method stub
		System.out.println("Inline Method  ---------------------------------->");	
		System.out.println(Arrays.toString(strings));
	}

}
