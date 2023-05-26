class StaticInitializationBlock {

	static int i;

	static {
		i = 10;
		System.out.println("Static initialization block - 2");
	}

	public static void main(String[] args) {

		System.out.println("Test Main Method");
		
		System.out.println(i);
		
		/*StaticInitializationBlock sIB = new StaticInitializationBlock();

		System.out.println(sIB.i);*/

	}

	static {
		System.out.println("Static initialization block - 3");
	}

	static {
		i = 20;
		System.out.println("Static initialization block - 1");
	}
}