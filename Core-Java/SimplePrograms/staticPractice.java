package SimplePrograms;

class Dog1 {
	static int count=1;
	int decibal;
	public Dog1(int d) {
		decibal = d;
	}	
	public void bark() {
		System.out.println("Can bark at sound of "+decibal);
	}
}

class staticPractice{
	public static void main(String[] args) {
	if (Dog1.count <= 1) {
		Dog1 d1 = new Dog1(7);
		d1.bark();
	}
	}
}