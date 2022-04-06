package data;

import java.util.Arrays;
import java.util.List;

import enums.AvailablityTypeEnum;
import model.Avion;


public class AvionDataMock {

	public static List<Avion> getList(){
        return Arrays.asList(
                new Avion("CNZNEKCZN","White", 10, 3, AvailablityTypeEnum.YES, 10000, "CDG Paris", 500, "Michel"),
                new Avion("ZIEBIZENE","Black", 10, 7, AvailablityTypeEnum.YES, 20000, "CDG Paris", 500, "Clara"),
                new Avion("APLMHZIOD","White", 10, 3, AvailablityTypeEnum.NO, 12500, "CDG Paris", 750, null)
        );
    }
}
