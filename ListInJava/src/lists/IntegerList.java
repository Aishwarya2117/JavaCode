package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerList {

	public static void main(String arg[]) {
		try(Scanner sc= new Scanner(System.in)){
	//create empty list 
	ArrayList<Integer> list = new ArrayList<>();
	//add number
	 for(int i=1;i<6;i++) {
		 list.add(i*10);
		
	 }System.out.println(list);
	 
	 System.out.println("Enter ele to search");
	 System.out.println(list.contains(sc.nextInt()));
	 
	}}
}

