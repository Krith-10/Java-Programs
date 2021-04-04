package ObjectCopy;

public class shallowCopy {
	public static void main(String[] args) {
		Demo d1 = new Demo("Aa", 1);
		d1.getName();
		d1.getId();
		
		Demo shallowObj = new Demo();
		shallowObj = d1;
		shallowObj.getName();
		shallowObj.getId();
	}
}