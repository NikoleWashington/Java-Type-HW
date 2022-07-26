import java.util.HashMap;
import java.util.Scanner;

public class Map {

	public static void main(String[] args) {
		HashMap<String, String> cars = new HashMap<>();
		
		cars.put("Civic", "Honda");
		cars.put("EV6", "Kia");
		cars.put("Mixima", "Nissan");
		
		Scanner input = new Scanner(System.in);
		System.out.println("What kind of car are you looking for?");
		String car = input.nextLine();
		
//		
//		for(String key: cars.keySet()) {
//			System.out.println(key);
//		}
//		
		System.out.println(cars.keySet());
		
	
		for(HashMap.Entry<String, String> c: cars.entrySet()){
			System.out.println(c);
		}
		System.out.println(cars.get(car));
		if(cars.containsKey(car)) {
			System.out.print("Here are the Hondas we have: " + cars.get(car));
			
		}
	
		
		

	}

	private static String getValue(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
