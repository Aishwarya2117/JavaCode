package com.app.tester;

import java.util.Scanner;

import com.app.core.Apple;
import com.app.core.Fruit;
import com.app.core.Mango;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of fruits");
		Fruit[] fruitBasket = new Fruit[sc.nextInt()];
		int cnt = 0;

		boolean exit = false;

		System.out.println("Option: /n 1.Add Mango 2.Add Apple 3.Display all Fruits");
		while (!exit) {
			System.out.println("Enter ur choice");
			switch (sc.nextInt()) {

			case 1:System.out.println("Adding Mango to basket ");
				if(cnt>=0 && cnt<fruitBasket.length) {
				fruitBasket[cnt++]=new Mango(sc.next(),sc.nextFloat());
				System.out.println("Added mango to basket");
			}
				else
					System.out.println("Basket is full");
				break;
			case 2:System.out.println("Adding Apple to basket ");
			if(cnt>=0 && cnt<fruitBasket.length) {
			fruitBasket[cnt++]=new Apple(sc.next(),sc.nextFloat());
			System.out.println("Added Apple to basket");
		}
			else
				System.out.println("Basket is full");
             break;
	
			case 3:
				for (Fruit f:fruitBasket) 
					if(f!=null) {
						if(f instanceof Mango) {
							System.out.println(f);
							System.out.println(f.taste());
							((Mango)f).pulp();
						}
						else if(f instanceof Apple) {
							System.out.println(f);
							System.out.println(f.taste());
							((Apple)f).jam();
						}
					}
				break;
					
				

			}

		}

	}

}
