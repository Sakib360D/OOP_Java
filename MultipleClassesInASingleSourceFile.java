public class MultipleClassesInASingleSourceFile {

	public static void main(String[] args) {

		ClassA cA1 = new ClassA();

		ClassB cB1 = new ClassB();

		ClassC cC1 = new ClassC();

	}
}

class ClassA {
	int i;

	ClassA() {
		System.out.println("Default Constructor of ClassA");
	}
}

class ClassB {
	int j;

	ClassB() {
		System.out.println("Default Constructor of ClassB");
	}
}

class ClassC {
	int k;

	ClassC() {
		System.out.println("Default Constructor of ClassC");
	}
}