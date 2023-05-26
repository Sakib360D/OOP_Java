class ClassAndObject {

	ClassAndObject() {}

	public static void main(String[] args) {

		// i = variable/identifier
		// int i = 10; 

		// Type variable/identifier = memory-allocation constructor() 
		/*ClassAndObject c1 = new ClassAndObject();
		System.out.println("c1 working fine.");
		System.out.println(c1);*/

		// No memory occupied
		// ClassAndObject c2;
		// System.out.println(c2);

		Test t1 = new Test();
		t1.id = 1;
		t1.name = "abc";

		Test t2 = new Test();
		t2.id = 2;
		t2.name = "def";

		t1.greetings();

		t2.greetings();

		Test t3 = new Test(3);
		t3.greetings();

		// identifier less object or anonymous object.
		// new Test();

		// System.out.println(new Test().greetingsWithReturnType());

	}
}