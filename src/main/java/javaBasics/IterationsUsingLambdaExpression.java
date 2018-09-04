package javaBasics;

public class IterationsUsingLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
				//	listNames.forEach(name -> System.out.println(name));
				
				/*This code looks even more compact and more readable than the enhanced for loop version. 
				As we can read the above line like this: for each element in the listNames, print the name to the console.
				Since Java 8, each collection has a forEach() method that implements the iteration internally. 
				Note that this method takes a Lambda expression or in other words, 
				the programmers can pass their code - or function - into this method. 
				As shown in the above example, the code to print each element is passed into the method.*/
				
				
				/*class StudentHelper {
				    public static void process(String name) {
				        System.out.println("processing the student " + name);
				    }
				}
				listNames.forEach(StudentHelper::process);*/
				
				//forEach method to iterate over the Set
				//numbers.forEach(System.out::println);
				
				// code to iterate over the Map above using the forEach method:
				//mapAscii.forEach((key, value) -> System.out.println(key + " -> " + value));
	}

}
