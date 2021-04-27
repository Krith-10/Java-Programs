package SimplePrograms;

interface SomeThing {
	public int iMethod();
}

abstract class A implements SomeThing {
	public int iMethod() {
		return 7;
	}
}

class B extends A{
	
}

class C extends A {
	public int iMethod() {
		return 5;
	}
}

class InterfaceTry extends B {
	public static void main(String [] args) {
		SomeThing[] myList = new SomeThing[3];
		myList[0] = new C();
		myList[1] = new B();
		myList[2] = new InterfaceTry();
		for(int i=0; i<3; i++) {
			System.out.println(myList[i].iMethod()+" "+myList[i].getClass());
		}
	}
}