package com.azubear.anansi;

class Stele{
	public Stele(int i){
	System.out.println("multe stele, ");	
	}
}

class Galaxii extends Stele{
	public Galaxii(){
		super(2);
		System.out.println("dece???");
	};
	public Galaxii(int p){
		super(p);
		System.out.println("aha!");
	};
}

public class Spatiu extends Galaxii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spatiu x = new Spatiu();
		Galaxii z = new Galaxii(6);
	}

}
