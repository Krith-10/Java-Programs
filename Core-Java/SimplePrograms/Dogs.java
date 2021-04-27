package SimplePrograms;
public class Dogs {
	String name;
	public void bark() {
		System.out.println("I am "+this.name);
	}
	public static void main(String[] args) {
		Dogs d = new Dogs();
		d.name = "Fingo";
		d.bark();
		
		Dogs[] dogList = new Dogs[2];
		
		dogList[0] = new Dogs();
		dogList[1] = d;
		
		dogList[0].name = "Tiger";
		dogList[1].name = "Bren";
		int x = 0;
		while(x < dogList.length) {
			dogList[x].bark();
			x++;
		}
	}
}