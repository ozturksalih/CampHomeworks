package Entities;

public class Discount implements Entity{
	int id ;
	int gameId;
	int discountPercentage;
	
	public Discount() {
		
	}

	public Discount(int id, int gameId, int discountPercentage) {
		this.id = id;
		this.gameId = gameId;
		this.discountPercentage = discountPercentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
}
