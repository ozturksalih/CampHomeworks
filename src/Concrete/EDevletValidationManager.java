package Concrete;
import Abstract.ValidationService;
import Entities.User;

public class EDevletValidationManager implements ValidationService{

	@Override
	public void Validate(User user) {
		System.out.println("User Validated");
		
	}

}
