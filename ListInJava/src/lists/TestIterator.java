package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int []data= {10,20,54,35,0,70,40,80,90,60,100};
		
		//create empty array list n populate it with array data
	ArrayList<Integer> list= new ArrayList<>();
	for(int i:data) //no conversion
		list.add(i);  //converting data(i)int to interger(List) Auto boxing
		System.out.println(list);
	
	 //can attach for-each to arraylist 
		//for-each  is implicit iterator 
		System.out.println("Using for each");
		for(int i :list) //Integer to int (Auto unboxing
			System.out.println(i);
		//Explicit iterator attaching
		System.out.println("Using iterator");
		Iterator<Integer> itr=list.iterator();//place before first element
		while(itr.hasNext()) {
			 System.out.println(itr.next());//retirn next element 
		}
		
		Collections.sort(list);
	
		System.out.println("list after sort"+list);
		
	}

}
