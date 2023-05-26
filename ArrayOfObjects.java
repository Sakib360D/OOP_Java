public class ArrayOfObjects {

	public static void main(String[] args) {

		Student s1 = new Student(1, "ABC");
		Student s2 = new Student(2, "DEF");
		Student s3 = new Student(3, "GHI");	

		System.out.println();

		Student s[] = new Student[3];

		/* 
			s[0] = s1;
			s[1] = s2;
			s[2] = s3;
		*/

		s[0] = new Student(1, "ABC");
		s[1] = new Student(2, "DEF");
		s[2] = new Student(3, "GHI");

		for(int i = 0; i < s.length; i++) {
			System.out.println("index: " + i + " " + s[i].id + " " + s[i].name + " " + s[i]);
		}

		System.out.println();

		// removing an array element
		s[1] = null;

		for(int i = 0; i < s.length; i++) {
			if(s[i] != null) {
				System.out.println("index: " + i + " " + s[i].id + " " + s[i].name + " " + s[i]);
			}
		}
	}
}

class Student {
	int id;
	String name;

	Student() {

	}

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}