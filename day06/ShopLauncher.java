package day06;

public class ShopLauncher{

	public static void main(String[] args) {
		IShop shop = new MyShop();
		shop.settitle("MyShop");
		shop.genUser();
		shop.genProduct();
		shop.start();
				
	}

}
