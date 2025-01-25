package innerClass;

public class A {
   private int i;
   private static int j;
    static {
    	j=100;
    }

     public A(int i) {
    	 this.i=i;
     }
     
     public static void show() {
    	 System.out.println("In static method j:"+j);
     }
     
     public void display() {
    	 System.out.println("In Non-Static method i:"+i+" ,j:"+j);
    	 
     }
     
     class B{
    	 
    	 // can't add static member without final
    	// private static int k; 
    	 
    	 private static final int k=1980;
    	 private int l;
    	 
    	 public B(int l) {
    		 this.l=l;
    	 }
    	 
    	 public void innerShow() {
    		  System.out.println("Inner class show:"+i+",j:"+j+",k:"+k);
    	 }
     }

}
