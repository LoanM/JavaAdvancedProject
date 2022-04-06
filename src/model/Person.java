package model;

import enums.SexTypeEnum;

public class Person {

	private String lastName;
	private String firstName;
	private Integer age;
	private SexTypeEnum sex;
	
	
	public Person(String lastName, String firstName, Integer age, SexTypeEnum sex) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.sex = sex;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public SexTypeEnum getSex() {
		return sex;
	}

	public void setSex(SexTypeEnum sex) {
		this.sex = sex;
	}

	
	@Override
	public String toString() {
		return "Person [LastName = " + lastName + ", FirstName = " + firstName + ", age = " + age + ", sex = " + sex + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
