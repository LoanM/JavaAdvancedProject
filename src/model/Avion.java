package model;

import enums.AvailablityTypeEnum;

public class Avion extends Vehicle {
	private String id;
	private String aeroport;
	private Integer maxWeight;
	private String rentalTo;
		
	public Avion(String id, String color, Integer nbPassenger, Integer rentalPeriod, AvailablityTypeEnum availablity,
			Integer price, String aeroport, Integer maxWeight, String rentalTo) {
		super(color, nbPassenger, rentalPeriod, availablity, price);
		this.id = id;
		this.aeroport = aeroport;
		this.maxWeight = maxWeight;
		this.rentalTo = rentalTo;
	}

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getAeroport() {
		return aeroport;
	}

	public void setAeroport(String aeroport) {
		this.aeroport = aeroport;
	}

	public Integer getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(Integer maxWeight) {
		this.maxWeight = maxWeight;
	}

	public String getRentalTo() {
		return rentalTo;
	}
	public void setRentalTo(String rentalTo) {
		this.rentalTo = rentalTo;
	}
	
	@Override
	public String toString() {
		return "Avion [id = " + id + ", aeroport = " + aeroport + ", maxWeight = " + maxWeight + ", rentalTo = " + rentalTo + ", color = " + getColor()
				+ ", nbPassenger = " + getNbPassenger() + ", rentalPeriod = "
				+ getRentalPeriod() + ", availablity = " + getAvailablity() + ", price = "
				+ getPrice() + "]";
	}

}
