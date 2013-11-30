package com.azubear.biblioteca;

public class Fibonacci {

	public int fibonacci(int index){
		int x1 = 0;
		int x2 = 1;
		int p = 0;
		if (index == 1) return x1;
		else if (index == 2) return x2;
		else {
		for (int i = 3; i<=index; i++){
			p = x1 + x2;
 			x1 = x2;
 			x2 = p;
		}
		}
		return p;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci t = new Fibonacci();
		System.out.println(t.fibonacci(1));
		System.out.println(t.fibonacci(2));
		System.out.println(t.fibonacci(3));
		System.out.println(t.fibonacci(4));
		System.out.println(t.fibonacci(5));
		System.out.println(t.fibonacci(6));
	}

}
