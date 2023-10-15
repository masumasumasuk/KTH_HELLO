package prac;

class newStudent extends Person {
	
	public void set() {
		age = 26;
		height = 179;
		name = "김태현";
		setWeight(85);
		System.out.println(name + "의 나이는 : " + age + ", 키는 : " + height + ", 몸무게는 : " + getWeight());
	}
}
