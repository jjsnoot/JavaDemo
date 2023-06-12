package com;

public class OperatorDemo {

	public static void main(String[] args) {
		int a=10, b=3;
		int add, sub, mul, div, mod;
		add = a+b;
		sub = a-b;
		mul = a*b;
		div = a/b;
		mod = a % b;
		System.out.println("Arithmatic Operation");
		System.out.println("Sub is " + sub);
		System.out.println("Mul is " + mul);
		System.out.println("Div is " + div);
		System.out.println("Mod is " + mod);
		System.out.println("Add is " + add);
		
				
		boolean res1, res2, res3;
		res1 = a>b;
		res2 = a<b;
		res3 = a!=b;
		
		System.out.println("Result 1 "+res1);
		System.out.println("Result 2 "+res2);
		System.out.println("Result 3 "+res3);
		
		int n=10;
		System.out.println("Value of n is "+n);
		n=n+1;
		System.out.println("Value of n is "+n);
		n++;
		System.out.println("Value of n is "+n);
	}

}
