
public class Calculator {
	
	  static int add(int num1, int num2) {
			return num1 + num2;
		}
	 
	 static int subtract(int num1, int num2) {
		 return num1-num2;
	 }
	 
	  static int multiplication(int num1, int num2) {
		 return num1* num2;
	 }
	 
	 static int division(int num1, int num2) {
		 return num1/num2;
	 }
	 
	 static int square(int num) {
		 return num * num;
	 }

	public static void main(String[] args) {
		
		System.out.println(add(34, 10));
		System.out.println(subtract(70, 50));
		System.out.println(multiplication (6, 7));
		System.out.println(division(20, 5));
		System.out.println(square(6));
		
		 

	}

}
