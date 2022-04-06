package data;

import java.util.Arrays;
import java.util.List;

import enums.AvailablityTypeEnum;
import enums.PermisTypeEnum;
import model.Boat;

public class BoatDataMock {
	public static List<Boat> getList(){
        return Arrays.asList(
        		new Boat("UYRGDHDI","White", 20, 1, AvailablityTypeEnum.YES, 7500, "Port de BREST", PermisTypeEnum.YES, "Michel"),
        		new Boat("JSBAIRYC","White", 20, 7, AvailablityTypeEnum.NO, 15000, "Port de BREST", PermisTypeEnum.YES, "Clara"),
        		new Boat("HYNUFHXJ","Black", 5, 2, AvailablityTypeEnum.YES, 2500, "Port de BREST", PermisTypeEnum.NO, null)
        );
    }
}
