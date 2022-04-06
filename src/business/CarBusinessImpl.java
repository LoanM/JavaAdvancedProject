package business;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import data.CarDataMock;
import model.Car;

public class CarBusinessImpl {
	
	List<Car> car = CarDataMock.getList();
	
	public List<Car> getList() {
        return car;
    }
	
	public Optional<Car> get(String registration) {

        return car.stream()
                .filter(car -> Objects.equals(car.getRegistration(), registration))
                .findFirst();
    }
}
