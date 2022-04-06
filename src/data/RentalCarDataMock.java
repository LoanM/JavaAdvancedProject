package data;

import java.util.Arrays;
import java.util.List;

import enums.SexTypeEnum;
import model.RentalCar;

public class RentalCarDataMock {
	public static List<RentalCar> getList(){
        return Arrays.asList(
        		new RentalCar("Michel", "DUPONT", 35, SexTypeEnum.MALE),
        		new RentalCar("Clara", "MONAURE", 24, SexTypeEnum.FEMALE)
        );
    }
}
