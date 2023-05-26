class TypeCasting {
	public static void main(String[] args) {

		// Implicit Type Casting
		// (Default)
		short s1 = 130;
		int i1 = s1;
		System.out.println(s1 + "--" + i1);

		// We can also provide type casting systax for implicit casting
		short s2 = 140;
		int i2 = (int) s2;
		System.out.println(s2 + "--" + i2);


		//Explicit Type Casting

		/*
		TypeCasting.java:19: error: incompatible types: possible lossy conversion from int to short
                short s3 = i3;
                           ^
		1 error 
		*/
		// As I did not use type casting syntax. Which is mandatory for explicit casting
		/*int i3 = 32909;
		short s3 = i3;
		System.out.println(s3 + "--" + i3); */

  		// (Default)
  		// We will loose value or the value will be modified
		int i4 = 32909;
		short s4 = (short) i4;
		System.out.println(s4 + "--" + i4);

  		// We will not loose value or the value will not be modified
  		// as short can hold from -32768 to 32767
		int i5 = 32101;
		short s5 = (short) i5;
		System.out.println(s5 + "--" + i5);

		// More example

		// char to int
		char a1 = 'a';
		int i6 = (int) a1;
		System.out.println(i6 + "--" + a1);

		// int to char
		int i7 = 98;
		char a2 = (char) i7;
		System.out.println(i7 + "--" + a2);


		// Exceptional Case
		// float (4B) to long(8B)

		/*
		TypeCasting.java:55: error: incompatible types: possible lossy conversion from float to long
                long l1 = f1;
                          ^
		1 error 
		*/
		float f1 = 68.6f;
		long l1 = (long) f1;
		System.out.println(l1 + "--" + f1);
	}
}