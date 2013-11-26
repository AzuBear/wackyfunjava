package com.azubear.biblioteca;

public class Carte extends Object{
	
	String titlu;
	int an;

	Carte() {
		
	}
	Carte(String titlu) {
		this.titlu = titlu;
	}
	Carte(String titlu, int an){
		this.titlu = titlu;
		this.an = an;
	}
	
	
	
	@Override
	public String toString() {
		return titlu + " " + an;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Object();
		System.out.println(new Carte("dsadas", 15));
		System.out.println(new Carte("dsadas"));
		System.out.println(new Carte());
		Carte crt1 = new Carte("Titlu roz", 2013);
		Carte crt2 = new Carte("fdsfs");
		String crt3 = crt1.titlu;
		System.out.println(crt3);
		
	}

}
