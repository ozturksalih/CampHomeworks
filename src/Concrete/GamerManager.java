package Concrete;
import Abstract.GamerService;
import Abstract.ValidationService;
import Entities.Gamer;

public class GamerManager implements GamerService {
	
	private ValidationService validationService;
	

	public GamerManager(ValidationService validationService) {
		
		this.validationService = validationService;
	}


	@Override
	public void Add(Gamer gamer) {
		validationService.Validate(gamer);
		
	}


	@Override
	public void Get(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void Update(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void Delete(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	
	

}
