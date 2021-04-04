package ObjectCopy;

public class Cloning {
	public static void main(String[] args) {
		Demo d1 = new Demo("Cc",3);
		d1.getName();
		d1.getId();
		
		Demo cloneObj = new Demo();
		try {
			cloneObj = d1.clone();
			cloneObj.getName();
			cloneObj.getId();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}