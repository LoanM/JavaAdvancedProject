package data;

import java.util.Arrays;
import java.util.List;

import enums.MarquesTypeEnum;
import enums.AvailablityTypeEnum;
import model.Car;

public class CarDataMock {
	public static List<Car> getList(){
        return Arrays.asList(
                new Car("Black", 4, 2, AvailablityTypeEnum.YES, 1500, MarquesTypeEnum.BMW, "AA-000-AA", "Michel"),
                new Car("Red", 2, 2, AvailablityTypeEnum.NO, 1000, MarquesTypeEnum.AUDI, "BB-111-BB", null),
                new Car("Green", 2, 1, AvailablityTypeEnum.YES, 2000, MarquesTypeEnum.MERCEDES, "CC-222-CC", "Clara"),
                new Car("Black", 7, 2, AvailablityTypeEnum.YES, 2500, MarquesTypeEnum.BMW, "DD-444-DD", null)
        );
    }
}
