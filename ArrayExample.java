class ArrayExample {

	public static void main(String[] args) {

		// 1st Approch
		System.out.println("1st Approch");

		// declaration and initialization
		int arr1[] = new int[5];
		// int[] arr1 = new int[5];

		// Accessing array elements
		for(int i = 0; i < 5; i++) {
			System.out.println(i + " " + arr1[i]);
		}

		// Assign values
		arr1[0] = 6;
		arr1[3] = 8;

		System.out.println();
		// Checking the assigned values
		for(int i = 0; i < 5; i++) {
			System.out.println(i + " " + arr1[i]);
		}

		//2nd Approch
		System.out.println();
		System.out.println("2nd Approch");

		// just declared
		int arr2[];
		int size = arr1[3]/2; // 8/2 = 4
		arr2 = new int[size];

		for(int i = 0; i < size; i++) {
			System.out.println(i + " " + arr2[i]);
		}

		arr2[0] = 100;
		arr2[3] = 200;
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
		// arr2[4] = 500;

		System.out.println(); 

		for(int i = 0; i < size; i++) {
			System.out.println(i + " " + arr2[i]);
		}

		// 3rd Approch
		System.out.println();
		System.out.println("3rd Approch");

		int arr3[] = new int[]{10, 20, 30, 40, 50, 60, 70};

		System.out.println("length of Array is: " + arr3.length);

		for(int i = 0; i < arr3.length; i++) {
			System.out.println(i + " " + arr3[i]);
		}

		arr3[0] = 110;
		arr3[3] = 210;

		System.out.println(); 

		for(int i = 0; i < arr3.length; i++) {
			System.out.println(i + " " + arr3[i]);
		}

		// 2D array

		// 1st and 2nd approch is self study

		System.out.println();
		System.out.println("2-D Array 3rd Approch");

		int arr4[][] = new int[][]{{10, 20}, {30, 40}, {50, 60, 70}};

		System.out.println("length of the array is: " + arr4.length);

		for(int i = 0; i < arr4.length; i++) {
			// self study to find the column length dynamically
			for(int j = 0; j < 2; j++) {
				System.out.println("row: " + i + " column::" + j + " " + arr4[i][j]);
			}
		}
	}
}