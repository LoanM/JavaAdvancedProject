package business;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import data.RentalCarDataMock;
import model.RentalCar;

public class RentalCarBusinessImpl implements RentalCarBusiness{

	List<RentalCar> rentalCar = RentalCarDataMock.getList();
	
    public List<RentalCar> getList() {
        return rentalCar;
    }
	
    public Optional<RentalCar> get(String LastName) {

        return rentalCar.stream()
                .filter(rentalCar -> Objects.equals(rentalCar.getLastName(), LastName))
                .findFirst();
    }
}
