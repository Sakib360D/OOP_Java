public class Interface {
	public static void main(String[] args) {
		// error: IInterfaceA is abstract; cannot be in
		// IInterfaceA iA = new IInterfaceA();

		System.out.println(IInterfaceA.x1);
		System.out.println(IInterfaceA.x2);

		IInterfaceA.showA3();

		ClassC cC1 = new ClassC();
		cC1.showB2();
	}
}

interface IInterfaceA {

	// variable
	// variables are by default public, static, final

	int x1 = 10;
	public static final int x2 = 20;

	/*IInterfaceA() {
		System.out.println("Default Constructor of IInterfaceA");
	}*/

	// methods
	// all the methods are by default public abstract

	void showA1();

	public abstract void showA2();

	static void showA3() {
		System.out.println("Calling method from IInterfaceA");
	}
}

interface IInterfaceB {	
	
	void showB1();
}

class ClassA implements IInterfaceA, IInterfaceB {

	ClassA() {
		System.out.println("Default Constructor of ClassA");
	}

	public void showA1() {
		System.out.println("Calling method showA1 from ClassA");
	}

	public void showA2() {
		System.out.println("Calling method showA2 from ClassA");
	}

	public void showB1() {
		System.out.println("Calling method showB1 from ClassA");
	}
}

abstract class ClassB implements IInterfaceA, IInterfaceB {

	ClassB() {
		System.out.println("Default Constructor of ClassB");
	}

	abstract void showB2();
}

interface IInterfaceC {}

class ClassC extends ClassB implements IInterfaceC {

	ClassC() {
		System.out.println("Default Constructor of ClassC");
	}

	public void showA1() {
		System.out.println("Calling method showA1 from ClassC");
	}

	public void showA2() {
		System.out.println("Calling method showA2 from ClassC");
	}

	public void showB1() {
		System.out.println("Calling method showB1 from ClassC");
	}

	public void showB2() {
		System.out.println("Calling method showB2 from ClassC");
	}
}