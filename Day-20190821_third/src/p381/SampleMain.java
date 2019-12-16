package p381;

public class SampleMain {

	public static void main(String[] args) {
		Book comic = new Book(5000);
		
		Book technicalBook = new Book(25000);
		
		Strategy discountStrategy = new DiscountStrategy();

		Strategy specialDiscountStrategy = new SpecialDiscountStrategy();
		
		
		Shop shop = new Shop(discountStrategy);
		
		Shop shop.setStrategy(specialDiscountStrategy);
	}

}
