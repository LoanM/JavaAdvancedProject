package business;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import data.AvionDataMock;
import model.Avion;

public class AvionBusinessImpl {
	
	List<Avion> rentalCar = AvionDataMock.getList();
	
	public List<Avion> getList() {
        return rentalCar;
    }
	
	public Optional<Avion> get(String id) {

        return rentalCar.stream()
                .filter(rentalCar -> Objects.equals(rentalCar.getId(), id))
                .findFirst();
    }
}
