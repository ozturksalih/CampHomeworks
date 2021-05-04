package Concrete;

import Abstract.SaleService;
import Entities.*;

public class SaleManager implements SaleService{



	@Override
	public void buy(Gamer gamer, Game game , Discount discount) {
		System.out.println(
				gamer.getFirstName() + " buyed " +
				game.getGameName() + 
				(discount == null ? 
				(game.getPrice() +"$"):  
				("with "+ discount.getDiscountPercentage()+"% discount for " +
				(game.getPrice() -(discount.getDiscountPercentage()* game.getPrice())/100 )
				)+"$" )
				);
		
		
	}

}
