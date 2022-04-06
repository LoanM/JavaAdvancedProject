package business;

import java.util.List;
import java.util.Optional;

import model.Avion;
/**
 * Business on Plane.
 * Two parts:
 * - the first Optional to pick up 1 renter by id.
 * - the second which allows to retrieve the list of all known renters.
 * 
 * @author Mouelo Loan
 * @version V 1.0
 * 
*/
public interface AvionBusiness {
	/**
	 * Get Plane by id
	 * 
	 * @param Id
	 * @return One Plane find by Id
	 */
	Optional<Avion> get(String id);
	/**
	 * @return List of Plane
	 */
	List<Avion> getList();
	
}
