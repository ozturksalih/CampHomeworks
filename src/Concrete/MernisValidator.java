package Concrete;

import Abstract.ValidationService;
import Entities.*;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisValidator implements ValidationService{

	

	@Override
	public boolean Validate(Gamer gamer) {
		KPSPublicSoapProxy kpsPublic  = new KPSPublicSoapProxy();
		try {
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalId()), gamer.getFirstName().toUpperCase(),
				gamer.getLastName().toUpperCase(),gamer.getDateOfBirth());
		return result;
		}catch(Exception ex) {
			System.out.println("api hatasi "+ex.getMessage());
			return false;
		}
		
		
	}
	
	
}
