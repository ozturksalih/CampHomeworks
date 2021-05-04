package Concrete;
import Abstract.ValidationService;
import Entities.Gamer;

public class EDevletValidationManager implements ValidationService{

	@Override
	public boolean Validate(Gamer gamer) {
		
		System.out.println("User Validated");
		return true;
		
	}

}
