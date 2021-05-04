import java.util.Date;

import Concrete.*;
import Entities.*;

public class Main {

	public static void main(String[] args) {
		Date dateOfBirth = new Date();
		Gamer salih = new Gamer(40459081,1,"salih@salih.com",
				"123","salih","ozturk",dateOfBirth);
		
		Game gta = new Game(1,"Gta 5 ", 125);
		Discount discount = new Discount(1,1,30);
		
		GamerManager gamer = new GamerManager(new EDevletValidationManager());
		gamer.Add(new Gamer());
		
		SaleManager sale = new SaleManager();
		sale.buy(salih, gta , discount);
	}

}
