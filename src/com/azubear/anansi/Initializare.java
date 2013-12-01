package com.azubear.anansi;

import sun.security.util.Length;

public class Initializare {
	Mesaj mesaj2 = new Mesaj("unu");
	Mesaj mesaj1 = new Mesaj("doi");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initializare t = new Initializare(); 
		
		
		
		
		
		
		
		Initializare[] t1  = new Initializare[5]; // aici am declart t1 care este tot de tipul Initializare dar si se si initializeaza
		
		
		
		
		
		t1[4] = new Initializare(); // am creat un Obiect in sir pe locul 10;
		for (int i=0; i<t1.length; i++){
			System.out.println(t1[i]);
		}
		
	}

}
