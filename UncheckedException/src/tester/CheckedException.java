package tester;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			System.out.println("in main");
			int a = 100 / 10;
			System.out.println("result:" + a);// AEx
			String s = "123";
			System.out.println("parsed int value" + Integer.parseInt(s));
			s = null;
			System.out.println(s.charAt(0));
			int[] arr = { 1, 2, 3, 4, 5 };
			System.out.println(arr[5]);
			System.out.println("end of try");
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		}

		catch (Exception e) {
			System.out.println("In Catch all");

			// System.out.println(e);
			// System.out.println(e.getMessage());
			e.printStackTrace();

		}
		System.out.println("main over...");
// try
// {
// Thread.sleep(200);
// }
// catch(InterruptedException e)
// {
//	 System.out.println("Err occured...");
// }
//  System.out.println("After");
//	
	}

}
