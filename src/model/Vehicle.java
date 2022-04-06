package model;

import enums.AvailablityTypeEnum;

public class Vehicle {
	
	private String color;
	private Integer nbPassenger;
	private Integer rentalPeriod;
	private AvailablityTypeEnum availablity;
	private Integer price;
	
	public Vehicle(String color, Integer nbPassenger, Integer rentalPeriod, AvailablityTypeEnum availablity, Integer price) {
		super();
		this.color = color;
		this.nbPassenger = nbPassenger;
		this.rentalPeriod = rentalPeriod;
		this.availablity = availablity;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getNbPassenger() {
		return nbPassenger;
	}

	public void setNbPassenger(Integer nbPassenger) {
		this.nbPassenger = nbPassenger;
	}

	public Integer getRentalPeriod() {
		return rentalPeriod;
	}

	public void setRentalPeriod(Integer rentalPeriod) {
		this.rentalPeriod = rentalPeriod;
	}

	public AvailablityTypeEnum getAvailablity() {
		return availablity;
	}

	public void setAvailablity(AvailablityTypeEnum availablity) {
		this.availablity = availablity;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [color = " + color + ", nbPassenger = " + nbPassenger + ", rentalPeriod = " + rentalPeriod
				+ ", availablity = " + availablity + ", price = " + price + "]";
	}
	
	

	


}
