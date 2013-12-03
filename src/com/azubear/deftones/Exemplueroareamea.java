package com.azubear.deftones;

public class Exemplueroareamea {
	public boolean test(String x) throws Eroareamea{
		if (x.startsWith("a")) {
			return true;
		}
		if (x.startsWith("x")) {
			throw new Eroareamea();
		}
	
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exemplueroareamea p = new Exemplueroareamea();
		try {
			p.test("xarca");
			} 
		catch (Eroareamea l) {
			System.out.println("S-a intamplat ceva rau");
			
			}
		p.test("xarca");
	}

}
