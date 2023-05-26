class DataType {

	public static void main(String[] args) {

		// primitive data type

		boolean b = false; // either true or false
		char ch = 'A'; // char should be in single quotation
		byte by = 126;
		short s = 150;
		int i = 1222;
		long l = 5l;
		float f = 0.5f;
		double d = 10.5d;

		System.out.println("short is: " + s);

		// non primitive data type

		String st = new String("abc");

		System.out.println("String is: " + st);


		// Wrapper class

		// parsing

		String number = "20";
		int i2 = Integer.parseInt(number);
		System.out.println("After parse int is: " + i2);

		// Type Casting

		short s2 = 100;
		int i4 = s2;

		System.out.println("Implicit conversion is ok. And value is: " + i4);

		int i3 = 200;
		// error: incompatible types: possible lossy conversion from int to byte
		// byte b2 = i3; 
		byte b3 = (byte) i3;

		System.out.println("Explicit conversion is ok. And value is: " + b3);
	}
}