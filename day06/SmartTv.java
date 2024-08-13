package day06;

public class SmartTv extends Product{
	String resolution;	//해상도
	
	public SmartTv(String name, int price, String resolution) {
		this.pname = name;
		this.price = price;
		this.resolution = resolution;
	}
	
	
	@Override
	public void printExtra() {
		System.out.println("해상도: " + resolution);
	
		
	}
}
