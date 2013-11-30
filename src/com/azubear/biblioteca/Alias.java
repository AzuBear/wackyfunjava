package com.azubear.biblioteca;

public class Alias {
	
	private static final int MAX = 20;
	
	private static int paramStatic;
	
	private int parametru;

	public void metodaObiect() {
		parametru = 14;
	}
	
	public static void metodaClasa() {
		paramStatic = 14;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alias.metodaClasa();
		
		Alias a1 = new Alias();
		a1.metodaObiect();
		a1.metodaClasa();
	}

}
