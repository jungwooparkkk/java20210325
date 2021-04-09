package p06.textbook.exercise.ex18;

public class ShopService {
	private static ShopService shopService = new ShopService();
	
	private ShopService() {
		
	}
	
	public static ShopService getInstance() {
		shopService = new ShopService();
		if( shopService == null) {
		}
		
		return shopService;
	}
}
