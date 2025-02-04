 package lists;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] ints= {10,20,30,-10,30,40};
  //create empty AL n populate it with array data
  ArrayList<Integer> list=new ArrayList<>();
  for(int i:ints) {
	  list.add(i);
  } 
	System.out.println("Displying list:"+list);	
	System.out.println("Displying list using forEach");
	for(int i:list)
		System.out.println(i);
	System.out.println("Doubling the values");
 for(int i=0;i<list.size();i++) {
	 if(list.get(i)>20)
		 list.set(i,list.get(i)*2);
	
} System.out.println(list);
Collections.sort(list );
System.out.println("Sorted list:"+list  );

	}
	

}
