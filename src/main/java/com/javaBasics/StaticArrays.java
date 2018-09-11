/*
 * 01. Declare and initialize 1D Array				-- int a [] = new int[4];
 * 02. Declare and initialize 2D Array				-- int b [][] = new int [3][4];
 * 03. Print an array reference in Java 			-- 
 * 04. Print an array value  in Java  				-- Arrays.toString(intArray);
 * 05. Check if an array contains a certain value 	-- Arrays.asList(bArray).contains("f");
 * 06. Concatenate two arrays 						-- int[] combinedArray = ArrayUtils.addAll(intArray, intArray2);
 * 07. Convert an Array to ArrayList				-- Arrays.asList(stringArray)
 * 08. Convert an Array to a Set 					-- Set<String> set = new HashSet<String>(Arrays.asList(stringArray));
 * 09. Convert an ArrayList to an Array 			-- arrayList.toArray(stringArr)
 * 10. Reverse an array 							-- ArrayUtils.reverse(intArray)
 * 11. Remove Element from an Array 				-- ArrayUtils.removeElement(intArray, 3);
 * 12. Sort an integer Array 						-- Arrays.sort(unsortedArray);
 * 13. Sort an String Array							-- Arrays.sort(unsortedArray);
 * 
 * */

package com.javaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class StaticArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Declare and initialize 1D array
		String aArray [] = new String[5];
		String bArray [] = {"a","b","c", "d", "e"};
		String cArray [] = new String[]{"a","b","c","d","e"};
		int intArray []  = { 1, 2, 3, 4, 5 };
		
		//2. Declare and initialize 2D array - Also called matrix / table
		
		int Arr2 [][] = {{1,2,3,4,-1},
						 {5,6,7,8,-2},
						 {9,10,11,12,-3}};
		
		for (int i =0; i<3; i++){
			for (int j =0 ; j< 5 ; j++){
				System.out.println(Arr2[i][j]); 
			}
		}
		
		//Print an array in Java
		
		//3. print directly will print reference value
		System.out.println("print directly will print reference value ---------------------------------->");
		
		System.out.println(intArray);
		System.out.println(intArray[1]);
		System.out.println(bArray);
		System.out.println(cArray);
		
		//4. Prints the values 
		System.out.println("print the array values ---------------------------------->");
		System.out.println("intArray " + Arrays.toString(intArray));
		System.out.println("aArray " + Arrays.toString(aArray));
		System.out.println("bArray " + Arrays.toString(bArray));
		System.out.println("cArray " + Arrays.toString(cArray));
		
		//5. Check if an array contains a certain value
		
		System.out.println("Check if an array contains a certain value ---------------------------------->");		
		boolean b = Arrays.asList(bArray).contains("f");
		System.out.println(b);
		
		//6. Concatenate two arrays
		
		System.out.println("concatenate two arrays ---------------------------------->");				
		int[] intArray2 = { 6, 7, 8, 9, 10 };
		int[] combinedArray = ArrayUtils.addAll(intArray, intArray2);
		System.out.println(Arrays.toString(combinedArray));
		
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
		
		//9. Convert an array to a set
		System.out.println("Convert an Array to Set  ---------------------------------->");			
		Set<String> set = new HashSet<String>(Arrays.asList(stringArray));
		System.out.println(set);
		//[d, e, b, c, a]
		
		//10. Reverse an array
		System.out.println("Reverse element of an array  ---------------------------------->");			
		ArrayUtils.reverse(intArray);
		System.out.println(Arrays.toString(intArray));
		
		//11. Remove element of an array
		System.out.println("Remove element of an array  ---------------------------------->");			
		int[] removed = ArrayUtils.removeElement(intArray, 3);//create a new array
		System.out.println(Arrays.toString(removed));
		
		System.out.println("Done");
		
		//12. sort an integer array
		System.out.println("Sorting an integer array  ---------------------------------->");		
		int[] unsortedArray = {2,6,5,3,1,0,-1};
		Arrays.sort(unsortedArray);
		for (int i: unsortedArray )
			System.out.println(i);
		
		//13. Sorting an String array
		System.out.println("Sorting an String array  ---------------------------------->");		
		String[] unsortedStringArray = {"dheeraj","kumar","Gupta"};
		Arrays.sort(unsortedStringArray);
		for (String s: unsortedStringArray )
			System.out.println(s);
		
		//14. Declare an array inline
		method(new String[]{"a", "b", "c", "d", "e"});
		
		System.out.println("Joins the elements of the provided array into a single String ----------------->");					
		
		//15. Joins the elements of the provided array into a single String
		String j = StringUtils.join(new String[] { "a", "b", "c" }, ", ");
		System.out.println(j);

	
	}

	private static void method(String[] strings) {
		// TODO Auto-generated method stub
		System.out.println("Inline Method  ---------------------------------->");	
		System.out.println(Arrays.toString(strings));
	}

}
