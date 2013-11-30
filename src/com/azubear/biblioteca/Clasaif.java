package com.azubear.biblioteca;

public class Clasaif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 50;
		if (x == 1) {
			System.out.println("unu");
		} else if (x == 2) {
			System.out.println("doi");
		} else {
			System.out.println("nustiu");
		}

		switch (x) {
		case 1: {
			System.out.println("unu");
			break;
		}
		case 10: {
			System.out.println("zece");
			break;
		}
		case 20: {
			System.out.println("doizece");
			break;
		}
		default: {
			System.out.println("nimic!");
		}
		}

		int i = 0;
		while (i <= 10) {
			if (i == 7)
				break;
			System.out.println(i);
			i++;

		}

	}

}
