package model;

import java.util.List;
import java.util.Optional;

import business.AvionBusinessImpl;
import business.CarBusinessImpl;
import business.RentalCarBusinessImpl;
import business.BoatBusinessImlp;

public class main {

	public static void main(String[] args) {	
		CarBusinessImpl carBusiness = new CarBusinessImpl();
		Optional<Car> OneCar= carBusiness.get("AA-000-AA");
		List<model.Car> AllCar = carBusiness.getList();
		
		BoatBusinessImlp boatBusiness = new BoatBusinessImlp();
		Optional<Boat> OneBoat = boatBusiness.get("UYRGDHDI");
		List<model.Boat> AllBoat = boatBusiness.getList();
		
		AvionBusinessImpl avionBusiness = new AvionBusinessImpl();
		Optional<Avion> OneAvion = avionBusiness.get("ZIEBIZENE");
		List<model.Avion> AllAvion = avionBusiness.getList();
		
		RentalCarBusinessImpl rentalCarBusiness = new RentalCarBusinessImpl();
		Optional<RentalCar> OneRentalCar = rentalCarBusiness.get("Michel");
		List<model.RentalCar> AllRentalCar = rentalCarBusiness.getList();
		
		System.out.println(OneCar);
		System.out.println(AllCar);
		System.out.println(OneBoat);
		System.out.println(AllBoat);
		System.out.println(OneAvion);
		System.out.println(AllAvion);
		System.out.println(OneRentalCar);
		System.out.println(AllRentalCar);
		
		
		
	}

}
