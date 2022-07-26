
public class Dog {
	
	private String breed;
	 private int age;
	 private String sound;
	 
	 
	 public Dog() {
		 System.out.println("I am a dog!");
	 }
	 
	 public Dog(String breed, int age) {
		 this.breed = breed;
		 this.age = age;
	 }
	 
	 public Dog(String breed, int age, String sound) {
		 this.breed = breed;
		 this.age = age;
		 this.sound = sound;
	 }

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	 
	 public boolean isPlayful() {
		 return true;
	 }
	 
	 public String Explore(String dig) {
		 return dig;
	 }


}
