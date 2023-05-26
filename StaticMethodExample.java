class StaticMethodExample {

	public static void main(String[] args) {
		Test.methodA();

		Test t1 = new Test();
		t1.methodB(); 
	}
}

class Test {

	// 1. static variable can be used inside of both static method and non static method
	// 2. instance variable can not be used inside of static method but it can be used inside non static method
	// 3. static method can call or reference from a static or non static method.
	// 4. instance method can not be called or referenced from a static context but it can be used from non static method

	// static variable
	static int i = 0;
	// non static or instance variable
	int j = 0;

	// Class Method or Static Method or Static Context
	static void methodA() {
		System.out.println(i);
		// System.out.println(j);

		methodC();
	}

	// Instance Method or Non Static Context
	void methodB() {
		System.out.println(i);
		System.out.println(j);
	}

	// Class Method or Static Method or Static Context
	static void methodC() {
		// methodB();
		System.out.println("Hello World! I am Static Context");
	}

}