package var_args;

public class Test {
    
	// here String[] args or String args[] can right both
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing no-args");
  displayNames();
  System.out.println("Testing  with animal[]");
  Animal[] pet= {new Cat("Kammi"),new Dog("Ruby"),new Horse("Raja")};
  displayNames(pet);
  System.out.println("Comma seperated list");
  displayNames(new Cat("chii"),new Horse("Heera"),new Dog("Shero") );
}
	
	// here Animal...animals this only allowed not Animal animals... 
	//ellipses must be written after data type
	
	private static void displayNames(Animal...animals) {
		for(Animal a:animals) {
			System.out.println(a.getName());
		}
	}

}
