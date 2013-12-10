package com.azubear.finetti;

import com.azubear.finetti.ClasaExterioara.ClasaInterioaraStatica;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//urmeaza un upcast
	Abstractic om = new Copilabstractic();
	//om.hahaha(4);
	//urmeaza un downcast
	Copilabstractic p = (Copilabstractic)om;
	p.hahaha("aici trebuie string");
	}
	

}
