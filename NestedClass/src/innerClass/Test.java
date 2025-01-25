package innerClass;

import innerClass.A.B;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		 A a=new A(20);
		 a.show();
		 a.display();
		 A.B b1=new A(10).new B(20);
		 
		b1.innerShow();
		
		 
	}

}
