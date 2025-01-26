package generic;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Holder <Integer>intHolder=new Holder<>(1234);//autoboxing
		//integer -->int
		int data =  intHolder.getRef();// auto -unboxing  INteger to int
		//here first disadvante gone as we dont need to do explicit downcasting
	    Holder<String>strHolder= new Holder<>("Aishwarya");
	     //no implicit conversion as we are passing string
	    
	    String s=strHolder.getRef();
	   // intHolder=strHolder;
	    //Holder holding integer is not same as holder holding Str
	
	}

}
