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
		boolean result = validationService.Validate(gamer);
		if(result) {
			System.out.println(gamer.getFirstName()+" dogrulandi");
		}else {
			System.out.println(gamer.getFirstName() + " icin dogrulama basarisiz");
		}
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
