public class Polymorphism {
	public static void main(String[] args) {
		ClassB cB1 = new ClassB();
		cB1.methodA();

		ClassA cB2 = new ClassB();
		cB2.methodA();
	}
}

class ClassA {

	ClassA() {
		System.out.println("Default Constructor of ClassA");
	}

	ClassA(int a) {
		System.out.println("Parameterized Constructor of ClassA");
	}

	ClassA(int a, int b) {
		System.out.println("Parameterized Constructor of ClassA");
	}

	void methodA() {
		System.out.println("Calling methodA() from ClassA");
	}

	void methodA(int a) {
		System.out.println("Calling methodA(int a) from ClassA");
	}

	/*int methodA(int a) {
		System.out.println("Calling methodA(int a) from ClassA");
	}*/

	int methodA(int a, int b) {
		System.out.println("Calling methodA(int a, int b) from ClassA");
		return 0;
	}

	int methodA(int a, float b) {
		System.out.println("Calling methodA(int a, float b) from ClassA");
		return 0;
	}

	int methodA(float a, int b) {
		System.out.println("Calling methodA(float a, int b) from ClassA");
		return 0;
	}
}

class ClassB extends ClassA {

	ClassB() {
		System.out.println("Default Constructor of ClassA");
	}

	ClassB(int a) {
		System.out.println("Parameterized Constructor of ClassA");
	}

	ClassB(int a, int b) {
		System.out.println("Parameterized Constructor of ClassA");
	}

	void methodA() {
		System.out.println("Calling methodA() from ClassB");
	}
	
	void methodB() {
		System.out.println("Calling methodB() from ClassB");
	}

	void methodB(int a) {
		System.out.println("Calling methodB(int a) from ClassB");
	}

	/*int methodB(int a) {
		System.out.println("Calling methodB(int a) from ClassB");
	}*/

	int methodB(int a, int b) {
		System.out.println("Calling methodB(int a, int b) from ClassB");
		return 0;
	}

	int methodB(int a, float b) {
		System.out.println("Calling methodB(int a, float b) from ClassB");
		return 0;
	}

	int methodB(float a, int b) {
		System.out.println("Calling methodB(float a, int b) from ClassB");
		return 0;
	}
}