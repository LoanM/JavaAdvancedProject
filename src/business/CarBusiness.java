package business;

import java.util.List;
import java.util.Optional;

import model.Car;
/**
 * Business on car.
 * Two parts:
 * - the first Optional to pick up 1 renter by registration.
 * - the second which allows to retrieve the list of all known renters.
 * 
 * @author Mouelo Loan
 * @version V 1.0
 * 
*/
public interface CarBusiness {
	/**
	 * Get Car by registration 
	 * 
	 * @param registration
	 * @return One Car find by registration
	 */
	Optional<Car> get(String registration);
	/**
	 * 
	 * @return List of Cars
	 */
	List<Car> getList();
}
