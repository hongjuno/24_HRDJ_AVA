package day06;

public class CellPhone extends Product{
	
	String carrier;
	
	public CellPhone(String name, int price, String carrier) {
		this.pname = name;
		this.price = price;
		this.carrier = carrier;
	}
	
	
	@Override
	public void printExtra() {
		System.out.println("통신사: " + carrier);
	
		
	}

}
