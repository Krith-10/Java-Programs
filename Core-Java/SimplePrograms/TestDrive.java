package SimplePrograms;

abstract class Animal{
  int sleepHrs;
  int noOfLimbs;
  String food;
  public void display() {
	  System.out.println("I am an animal");
  }
  
  public void sleepTime() {
	  
  }
  
  public abstract void iAmCat();
  
  public void makeSound(){
    System.out.println("Sound is made");
  }
}

class Cat extends Animal {
	  int sleepHrs = 7;
	  public void sleepTime(){
	  	System.out.println("This sleeps for "+this.sleepHrs);
	  }
	  
	  public void iAmCat() {
		  System.out.println("I am the cat");
	  }
	}


class Dog extends Animal {
  int sleepHrs = 7;
  
  public void sleepTime(){
  	System.out.println("This sleeps for "+this.sleepHrs);
  }
  
  public void iAmCat() {
	  System.out.println("I am not a Cat");
  }
}



public class TestDrive {
  public static void main(String[] args) {
  
   Animal d = new Dog();
  d.sleepTime();
  d.makeSound();
  d.display();
  Animal c = new Cat();
  c.iAmCat();
  }
}
