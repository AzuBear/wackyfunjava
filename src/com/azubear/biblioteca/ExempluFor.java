package com.azubear.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class ExempluFor {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int numar = 5;
		Integer oareesir = 7;
		Integer n2 = new Integer(7);
		
		Integer[] a = new Integer[10];
		
		Tank[] t  = new Tank[7];
		System.out.println(t);
		Tank   tt = new Tank();
		System.out.println(tt);
		
		List<Tank> list = new ArrayList<Tank>();
		list.add(new Tank());
		System.out.println("list size " + list.size());
		
		for (int i=1; i<11; i++){
			System.out.println(i);
		}
		
		t[2] = new Tank();
	
		for (int i=0; i<7; i++){
			System.out.println(t[i]);
		}
		System.out.println();
		
		for (Tank tIntern : t) {
			System.out.println(tIntern);
		}
	}

}
