package Singleton;

public class ShopService {
	private static ShopService singleton = new ShopService(); //외부에서 객체로의 접근을 막기 위함.
	
	private ShopService() {} //생성자
	
	static ShopService getInstace() {
		return singleton;
	}
}
