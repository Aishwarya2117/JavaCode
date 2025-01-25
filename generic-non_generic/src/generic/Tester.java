package generic;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Holder h1=new Holder(1234); //int __> integer (auto-boxing)
		
		int data=(Integer)h1.getRef(); //downcasting - object to number,unboxing-- Integer to int ,
		Holder h2=new Holder("Aishwarya");
		String str= (String)h2.getRef();
		h1=h2;
		data=(Integer)h1.getRef();
		System.out.println(data );
	}

}
