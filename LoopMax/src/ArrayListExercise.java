import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 5 numbers");
		
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		while (numbers.size() < 5) {
			numbers.add(Integer.parseInt(input.nextLine()));
		}
		System.out.println("Here are your numbers: " + numbers);
		
		Integer sum = 0;
		for(int i = 0; i < numbers.size(); ++i) {
			sum += numbers.get(i);
		}
		System.out.println("Here is the sum of your numbers: " + sum);
		
		Integer product = 1;
		for(int i = 0; i < numbers.size(); ++i) {
			product *= numbers.get(i);
		}
		System.out.println("Here is the product of your numbers: " + product);
		
		int largestNum = Collections.max(numbers);
		System.out.println("Here is the largest of your numbers: " + largestNum);
		
		int smallestNum = Collections.min(numbers);
		System.out.println("Here is the smallest of your numbers: " + smallestNum);
		
		
		input.close();
	

	}

}


