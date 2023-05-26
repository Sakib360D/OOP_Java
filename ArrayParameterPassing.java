public class ArrayParameterPassing {

	public static void main(String[] args) {


		// Pass The Array
		int arr1[] = new int[3];
		arr1[0] = 2;
		arr1[1] = 3;
		arr1[2] = 5;

		System.out.println("Before passing the array: ");
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		} 

		Test t = new Test();
		t.passTheArray(arr1);

		System.out.println("After passing the array: ");
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		} 

		// Return the array

		System.out.println("Return the array: ");

		int[] arr4 = t.returnTheArray();

		for(int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
	}
}

class Test {

	void passTheArray(int[] a) {
		System.out.println("Inside the method: ");
		System.out.println("Length of the array is: " + a.length);

		a[0] = 50;

		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		} 
	}

	int[] returnTheArray() {

		int[] arr2 = new int[2];
		arr2[0] = 10;
		arr2[1] = 20;

		return arr2;
	}
}

