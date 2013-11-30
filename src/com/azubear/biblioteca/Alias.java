package com.azubear.biblioteca;

public class Alias {
	
	static int param = 14;
	
	public static void stomac(Tank t)
	{
		t.level = 15;
		
	}
	
	public static void overflow() {
		overflow();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank masinoca = new Tank();
		masinoca.level = 29;
		System.out.println(masinoca.level);
		masinoca.listeaza();
		stomac(masinoca);
		System.out.println(masinoca.level);
		//overflow();
	}

}
