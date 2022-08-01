import java.util.Scanner;

public class AsciiChars {
	

	
	public static void printNumbers()
	  {
	    for(int i=48; i<=57; i++) {
	    	System.out.println((char)i);
	    }
	  }

	  public static void printLowerCase()
	  {
		  for(int i=97; i<=122; i++) {
		    	System.out.println((char)i);
		    }
	  }

	  public static void printUpperCase()
	  {
		  for(int i=65; i<=90; i++) {
		    	System.out.println((char)i);
		    }
	  }

	public static void main(String[] args) {
		
		AsciiChars.printNumbers();
		AsciiChars.printUpperCase();
		AsciiChars.printLowerCase();
		
		
		System.out.println();
		System.out.println();
		
		
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name.");
		String name = input.nextLine();
		System.out.println("Would you like to continue to the interactive"
				+ " portion of the game, " + name + "?" + " Please say yes or no.");
		String answer = input.nextLine();
		if(answer.contains("no")){ System.out.println("Thank you for your time.");}
		
		while (answer.equals("yes")) {
			
				System.out.println("Do you have a red car?" + "(yes or no)");
				String car = input.nextLine();
		
		System.out.println("What's your favorite pet?");
				 String pet = input.nextLine();
				 
			System.out.println("How old is your pet?");
			int age = input.nextInt();
			input.nextLine();
			
			System.out.println("What is your lucky number?");
			int luckyNum = input.nextInt();
			input.nextLine();
			
			System.out.println("Do you have a favorite quarterback?");
		    String qB = input.nextLine();
			
			int magicBall;
			if(qB.equals("yes")) {
				
			System.out.println("What is their jersey number?");
			int jNum = input.nextInt();
			input.nextLine();
			 magicBall = jNum;}
			
			

			 System.out.println("What is two-digit model year of your car?");
			 int modelYear = input.nextInt();
			 input.nextLine();
			 
			 System.out.println("What is the first name of your favorite actor/actress?");
			 String actorName = input.nextLine();
			 
			 System.out.println("Enter a random number between 1 and 50");
			 int randoNum = input.nextInt();
			 input.nextLine();
			
			 int[] randomNumbers = new int[5];
			 for (int i=0; i<randomNumbers.length; ++i) {
				 randomNumbers[i] = (int)Math.floor(Math.random() * 65)+1;
			 }
		
			 int[] balls = new int[5];
			 
//			 magicBall = luckyNum * randomNumbers[0];
//			 
			
			 balls[0] = pet.charAt(2);
			 balls[1] = modelYear + luckyNum;
			 balls[2] = randoNum - randomNumbers[1];
			 balls[3] = actorName.charAt(0);
			 balls[4] = age + modelYear;
			 
			 System.out.print("Lottery numbers: ");
			 for(int i=0; i<balls.length-1; ++i) {
				 System.out.print(balls[i]);
			 }
			 
			 System.out.print(balls[balls.length-1]);
			 System.out.println(" Magic ball:" );
			
			}
		
		}
		
	}

