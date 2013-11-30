package com.azubear.biblioteca;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		
		t1.level = 13;
		t2.level = 14;
		
		System.out.println(t1.level + " " + t2.level);
		System.out.println(t1 + " " + t2);
		
		t1 = t2;
		
		System.out.println(t1.level + " " + t2.level);
		System.out.println(t1 + " " + t2);
		
		t1.level = 20;
		
		System.out.println(t1.level + " " + t2.level);
		System.out.println(t1 + " " + t2);
	}

}
