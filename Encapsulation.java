public class Encapsulation {

	public static void main(String[] args) {

		/*Student s1 = new Student();
		s1.id = 1;
		s1.name = "abc";*/

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("def");

		System.out.println(s2.getId());
		System.out.println(s2.getName());
	}
}

class Student {

	private int id;
	private String name;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}