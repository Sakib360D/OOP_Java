class Loop {
	public static void main(String[] args) {

		System.out.print("From For Loop: ");
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		int i = 1;

		System.out.print("From While Loop: ");
		while(i <= 10) {
			System.out.print(i + " ");
			i = i + 1; // i++;
		}

		System.out.println();

		int j = 1;

		System.out.print("From do-while Loop: ");
		do {
			System.out.print(j + " ");
			j = j + 1; // j++;
		} while(j <= 10);

		System.out.println();

		System.out.print("Using For Loop (Even): ");
		for(int k = 1; k <= 10; k++) {
			if(k % 2 == 0) {
				System.out.print(k + " ");
			}
		}

		System.out.println();
		System.out.print("Using For Loop (Odd): ");
		for(int k = 1; k <= 10; k++) {
			if(k % 2 != 0) {
				System.out.print(k + " ");
			}
			else {
				System.out.print("Even ");
			}
		}
	}
}