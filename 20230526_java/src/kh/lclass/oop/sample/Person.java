package kh.lclass.oop.sample;

public class Person {

	protected String name; // 주민등록상 이름
	private int age;
	private char gender;
	
	// 기본생성자
	
	public Person() {}
	
	
	//allArgumentsConstructor 만들어주세요
	public Person(String name, int age, char gender, final int maxCnt) {
		this.name = name;
		this.age = age;
		this.gender = gender; // 생성자에는 return타입 작성하지 않는다
	}
	
	// getter / setter (타이핑으로)
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}


	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; // return 필요없음 값을 대입할 것이기 때문
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
