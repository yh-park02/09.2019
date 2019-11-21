package datastructure;

//이름, 나이, 직업을 저장하는 클래스 
public class PersonDTO {
	private String name;
	private int age;
	private String jab;
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJab() {
		return jab;
	}
	public void setJab(String jab) {
		this.jab = jab;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jab=" + jab + "]";
	}
}
