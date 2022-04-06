package model;

import enums.SexTypeEnum;

public class RentalCar extends Person {
	
	public RentalCar(String lastName, String firstName, Integer age, SexTypeEnum sex) {
		super(lastName, firstName, age, sex);
	}

	

	@Override
	public String toString() {
		return "RentalCar [LastName = " + getLastName() + ", FirstName = " + getFirstName() + ", Age = "
				+ getAge() + ", Sex = " + getSex() + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
