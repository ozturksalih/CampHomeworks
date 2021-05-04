import java.rmi.RemoteException;
import Concrete.*;
import Entities.*;

public class Main {

	public static void main(String[] args) throws RemoteException{
	
		Gamer salih = new Gamer();
		
		
		Game gta = new Game(1,"Gta 5 ", 125);
		Discount discount = new Discount(1,1,30);
		
		GamerManager gamer = new GamerManager(new MernisValidator());
		gamer.Add(salih);
		
		SaleManager sale = new SaleManager();
		sale.buy(salih, gta , discount);
		
		
		
		
	}

}
