class Wrapper {
	public static void main(String[] args) {
		// We did not need to create object for primitive Data Type
		int i1 = 10;
		int i2 = 20;

		if(i1 > i2) {
			System.out.println(i1 + " is greater");
		}
		else {
			System.out.println(i2 + " is greater");
		}

		// We need to create object for Wrapper class or Non primitive Data Type
		Integer i3 = new Integer(48);
		Integer i4 = new Integer(50);

		// int to Integer (primitive to Wrapper class)
		Integer i5 = new Integer(i1);
		Integer i6 = new Integer(i2);

		/* if i5 == i6 result will be 0, 
		   if i5 > i6 result will be positive value 
		   if i5 < i6 result will be negative value*/
		int result = Integer.compare(i6, i5);
		System.out.println(result);

		/* Integer to int (Wrapper to primitive) */
		int i7 = i5.intValue();
		int i8 = i6.intValue();

		System.out.println(i7);
		System.out.println(i8);


		/* String example */
		String st1 = new String("8");
		String st2 = new String("10");
		// It will not give me a result of 18
		System.out.println(st1 + st2);

		// Converting to int
		int i9 = Integer.parseInt(st1);
		int i10 = Integer.parseInt(st2);
		System.out.println(i9 + i10);

		//Converting to Double/Float
		String st3 = new String("8.5");
		String st4 = new String("10.2");
		double d1 = Double.parseDouble(st3);
		double d2 = Double.parseDouble(st4);
		System.out.println(d1 + d2);

		// Converting int to String
		Integer i11 = new Integer(20);
		String st5 = i11.toString();
		System.out.println(st5);
		// To check it is really converterd to String, add a int value.
		System.out.println(st5 + 9);
	}
}