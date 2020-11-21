
public class Encap {
	private int age;
	private String name;
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	

	public static void main(String[] args) {
		Encap e=new Encap();
		e.age=20;
		e.name="Ram";
		System.out.println(e.age+" "+e.name);
	}

}





