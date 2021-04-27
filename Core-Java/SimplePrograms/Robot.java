package SimplePrograms;

class Robot {
	String name;
	String type;
	int age;
	void selfIntroduce() {
		System.out.println("Hey there!! I am "+ this.name + " of type "+ this.type);
	}
}

class RobotTestDrive {
	public static void main(String[] args) {
		Robot r1 = new Robot();
		Robot r2 = new Robot();
		
		r1.name = "Elliot";
		r1.type = "Friendly";
		r1.age = 3;
		
		r2.name = "Tom";
		r2.type = "Formal";
		r2.age = 5;
		
		r1.selfIntroduce();
		r2.selfIntroduce();
	}
}