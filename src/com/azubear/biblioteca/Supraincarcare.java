package com.azubear.biblioteca;

public class Supraincarcare {

	
	public int suma(int a, int b){
		return a+b;
	}
	
	public int suma(int a, int b, int c){
		return a+b+c;
	}
	
	public int suma(String a, int b) {
		return a.length() + b - 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supraincarcare t = new Supraincarcare();
		System.out.println(t.suma(3,4));
		System.out.println(t.suma("noua",4));
	}

}
