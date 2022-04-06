package business;

import java.util.List;
import java.util.Optional;

import model.Boat;
/**
 * Business on boat.
 * Two parts:
 * - the first Optional to pick up 1 renter by id.
 * - the second which allows to retrieve the list of all known renters.
 * 
 * @author Mouelo Loan
 * @version V 1.0
 * 
*/
public interface BoatBusiness {
	/**
	 * Get Boat by id
	 * 
	 * @param Id
	 * @return One RentalCar find by Id
	 */
	Optional<Boat> get(String id);
	/**
	 * @return List of Boat
	 */
	List<Boat> getList();
}
