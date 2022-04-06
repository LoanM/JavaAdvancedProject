package model;

import enums.AvailablityTypeEnum;
import enums.PermisTypeEnum;

public class Boat extends Vehicle{
	private String id;
	private String harbor;
	private PermisTypeEnum license;
	private String rentalTo;
	
	public Boat(String id, String color, Integer nbPassenger, Integer rentalPeriod, AvailablityTypeEnum availablity, Integer price,
			String harbor, PermisTypeEnum license, String rentalTo) {
		super(color, nbPassenger, rentalPeriod, availablity, price);
		this.id = id;
		this.harbor = harbor;
		this.license = license;
		this.setRentalTo(rentalTo);
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHarbor() {
		return harbor;
	}
	public void setHarbor(String harbor) {
		this.harbor = harbor;
	}
	public PermisTypeEnum getLicense() {
		return license;
	}
	public void setLicense(PermisTypeEnum license) {
		this.license = license;
	}
	public String getRentalTo() {
		return rentalTo;
	}
	public void setRentalTo(String rentalTo) {
		this.rentalTo = rentalTo;
	}
	@Override
	public String toString() {
		return "Boat [id = " + id + " harbor = " + harbor + ", license = " + license + ", rentalTo = " + rentalTo + ", color = "
				+ getColor() + ", nbPassenger = " + getNbPassenger() + ", rentalPeriod = " + getRentalPeriod()
				+ ", availablity = " + getAvailablity() + ", price = " + getPrice() + "]";
	}
	
	
	
	
}
