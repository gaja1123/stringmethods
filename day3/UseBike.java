package day3;

public class UseBike {
	public static void main(String[]args) {
		
		String [] x = args[0]. split(",");
		
		Bike bike1 = new Bike ();
		
		bike1.manufacturer= x[0];
		bike1.price = Integer.parseInt(x[1]);
		bike1.taxAmount = Integer.parseInt(x[2]);
		bike1.discountAmount= Integer.parseInt(x[3]);
		bike1.netprice = (bike1.price + bike1.taxAmount - bike1.discountAmount );
		
		
		
		String [] y = args[0]. split(",");
		Bike bike2 = new Bike ();
		
		bike2.manufacturer= y[0];
		bike2.price = Integer.parseInt(y[1]);
		bike2.taxAmount = Integer.parseInt(y[2]);
		bike2.discountAmount= Integer.parseInt(y[3]);
		bike2.netprice  = (bike2.price + bike2.taxAmount - bike2.discountAmount );
		
		
		String [] z = args[0]. split(",");
		Bike bike3 = new Bike ();
		
		bike3.manufacturer= z[0];
		bike3.price = Integer.parseInt(z[1]);
		bike3.taxAmount = Integer.parseInt(z[2]);
		bike3.discountAmount= Integer.parseInt(z[3]);
		bike3.netprice  = (bike3.price + bike3.taxAmount - bike3.discountAmount );
		
		
		
		System.out.println(bike1.netprice + " "+ bike2.netprice+ " " + bike3.netprice);
		

		
	}

}
