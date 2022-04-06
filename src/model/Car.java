package model;

import enums.AvailablityTypeEnum;
import enums.MarquesTypeEnum;

public class Car extends Vehicle {

	private MarquesTypeEnum marques;
	private String registration;
	private String rentalTo;
	
	public Car(String color, Integer nbPassenger, Integer rentalPeriod, AvailablityTypeEnum availablity, Integer price,
			MarquesTypeEnum marques, String registration, String rentalTo) {
		super(color, nbPassenger, rentalPeriod, availablity, price);
		this.marques = marques;
		this.registration = registration;
	}

	public MarquesTypeEnum getMarques() {
		return marques;
	}

	public void setMarques(MarquesTypeEnum marques) {
		this.marques = marques;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}
	
	public String getRentalTo() {
		return rentalTo;
	}

	public void setRentalTo(String rentalTo) {
		this.rentalTo = rentalTo;
	}

	@Override
	public String toString() {
		return "Car [marques = " + marques + ", registration = " + registration + ", rentalTo = " + rentalTo + ", color = " + getColor()
				+ ", NbPassenger = " + getNbPassenger() + ", RentalPeriod = "
				+ getRentalPeriod() + ", Availablity = " + getAvailablity() + ", Price = "
				+ getPrice() + "]";
	}

	
}
