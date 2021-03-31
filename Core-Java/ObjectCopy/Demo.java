package ObjectCopy;

public class Demo implements Cloneable {
	
	String name;
	int id;
	
	public Demo() {
		
	}
	
	public Demo(String n, int i) {
		name = n;
		id = i;
	}
	
	public void getName() {
		System.out.println("The name is "+ name);
	}
	
	public void getId() {
		System.out.println("The id is "+ id);
	}
	
	@Override 
	public Demo clone() throws CloneNotSupportedException {
		return (Demo) super.clone();
	}
}