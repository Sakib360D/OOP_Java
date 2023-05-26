class Test {

	// instance variable
	int id;
	String name;

	// Default Constructor 
	// No arg constructor
	Test() {
		System.out.println("Default Constructor of Test");
	}

	// Parameterized Constructor
	Test(int i, String n) {
		id = i;
		name = n;
		System.out.println("Parameterized Constructor of Test");
	}

	// instance method
	void greetings() {
		System.out.println("Hello: " + id + " " + name);
	}

	String greetingsWithReturnType() {
		return "Hello: " + id + " " + name;
	}

	void greetingsWithParameter(String param) {
		System.out.println("Hello: " + param);
	}
}