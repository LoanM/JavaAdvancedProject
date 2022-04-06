package business;

import java.util.List;
import java.util.Optional;

import model.RentalCar;
/**
 * Business on vehicle rental companies.
 * Two parts:
 * - the first Optional to pick up 1 renter by name.
 * - the second which allows to retrieve the list of all known renters.
 * 
 * @author Mouelo Loan
 * @version V 1.0
 * 
*/
public interface RentalCarBusiness {
	/**
	 * Get rentalCar by lastName
	 * 
	 * @param LastName
	 * @return One RentalCar find by LastName
	 */
	Optional<RentalCar> get(String LastName);
	
	/**
	 * @return List of RentalCar
	 */
	List<RentalCar> getList();
	
}
