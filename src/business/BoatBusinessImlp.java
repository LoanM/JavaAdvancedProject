package business;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import data.BoatDataMock;
import model.Boat;

public class BoatBusinessImlp {
	
	List<Boat> boat = BoatDataMock.getList();
	
	public List<Boat> getList() {
        return boat;
    }
	
	public Optional<Boat> get(String id) {

        return boat.stream()
                .filter(boat -> Objects.equals(boat.getId(), id))
                .findFirst();
    }
}
