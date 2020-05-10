package Heirarchichal;

public class Runner {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		
		System.out.println("Brand is: "+c.Brand+" And cost is: " +c.cost);
	     c.start();
	     
	     Bike B = new Bike();
	     
	     System.out.println("Brand is: "+B.Brand+" And price is: " +B.price);
	     B.stop();
	}

}
