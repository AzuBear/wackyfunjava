package com.azubear.deftones;

public class Erori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
				
		int a = Integer.parseInt("14a");
		System.out.println(a); 
		
		}
		
		catch (NumberFormatException e) {
			System.out.println("am avut o exceptie: " + e.getMessage());
		}
		catch (Exception b) {
			System.out.println("inca una!");
		}
		
		
	}

}
