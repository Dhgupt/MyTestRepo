/*
 * 
 * primitive data types		: int, double, char, boolean
 * conditional operators	: > < >= <= == != 
 * If Else					:
 * Switch Case Break		:
 * Increment and Decrement 	:
 * Loops					: While loop, For Loop
 * Break and continue		: 
 * 
 * */
package com.javaBasics;

public class AbolutesBasics {
	
public static void main(String[] args) {

		//1. while:
		int i = 1; //Initialization
		while(i<=10){ //conditional 
			System.out.println(i);
			i++; //incremental/decremental
		}
		
		
		//2. for:
		for(int j=1; j<=10; j++){
			System.out.println(j);
		}
		
		//3. increment and decrement
		 int a = 1;
		 int b = a++; //post increment
		
		System.out.println(a);//2
		System.out.println(b);//1
		
		int m = 1;
		int n = ++m; //pre increment
		
		System.out.println(m);//2
		System.out.println(n); //2
				
		
		int p = 2;
		int q = p--; //post decrement
		
		System.out.println(p);//1
		System.out.println(q);//2
		
		int x = 2;
		int y = --x; //pre decrement
		
		System.out.println(x);//1
		System.out.println(y);//1
		
		
		int g = -1;
		int h = g++;
		System.out.println(g);//0
		System.out.println(h);//-1
		
		
		int k = -5;
		int l = k--;
		System.out.println(k);//-6
		System.out.println(l);//-5
		
		
		int c = -5;
		int d = --c;
		System.out.println(c);//-6
		System.out.println(d);//-6
	}
}
