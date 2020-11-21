
public class Student {
	String name;
	int rollno;
	String fathername;
	long mob;
	int age;
	double height;

	public Student(String a, int b, String c, long d, int e, double g) {
		name = a;
		rollno = b;
		fathername = c;
		mob = d;
		age = e;
		height = g;

	}

	public static void main(String[] args) {
		Student s1 = new Student("pappu", 125, "deepnarayanRai", 7898746318l, 22, 5.8);
		Student s2 = new Student("ritesh", 545, "vedprakash rai", 9074585793l, 22, 5.6);
		System.out.println(
				s1.name + " " + s1.rollno + " " + s1.fathername + " " + s1.mob + " " + s1.age + " " + s1.height);
		System.out.println(
				s2.name + " " + s2.rollno + " " + s2.fathername + " " + s2.mob + " " + s2.age + " " + s2.height);
	}
}
