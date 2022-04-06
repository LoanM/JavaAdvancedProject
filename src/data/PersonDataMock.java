package data;

import enums.SexTypeEnum;
import model.Person;

public class PersonDataMock {

	public static Person getDirector() {
		Person director = new Person(null, null, null, null);
		director.setFirstName("Loan");
		director.setLastName("MOUELO");
		director.setAge(45);
		director.setSex(SexTypeEnum.MALE);
		return director;
	}
	public static Person getManager() {
		Person manager = new Person(null, null, null, null);
		manager.setFirstName("Orane");
		manager.setLastName("FLAMAND");
		manager.setAge(38);
		manager.setSex(SexTypeEnum.FEMALE);
		return manager;
	}
	public static Person getCommercial() {
		Person commercial = new Person(null, null, null, null);
		commercial.setFirstName("Stéphane");
		commercial.setLastName("GAREAU");
		commercial.setAge(26);
		commercial.setSex(SexTypeEnum.MALE);
		return commercial;
	}
	
}
