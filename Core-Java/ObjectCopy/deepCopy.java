package ObjectCopy;

public class deepCopy {
	public static void main(String[] args) {
		Demo d1 = new Demo("Bb", 2);
		d1.getName();
		d1.getId();
		
		Demo deepObj = new Demo();
		deepObj.name = d1.name;
		deepObj.id = d1.id;
		deepObj.getName();
		deepObj.getId();
	}
}