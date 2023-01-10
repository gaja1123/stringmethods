package day3;

public class UseLaptop {
	public static void main (String[]args) {
		
		String [] e = args[0].split("@");
		
		Laptop laptop1 = new Laptop();
		
		laptop1.brand = e[0];
		laptop1.price = Integer.parseInt(args[1]);
		laptop1.taxPercentage= Integer.parseInt(args[2]);
		laptop1.discountPercentage = Integer.parseInt(args[3]);
		laptop1.netprice = (laptop1.price + (laptop1.taxpercentage/100)-(laptop1.discountpercentage/100) );
		
		
String [] f = args[1].split("#");
		
		Laptop laptop2 = new Laptop();
		
		laptop2.brand = f[0];
		laptop2.price = Integer.parseInt(args[1]);
		laptop.taxPercentage= Integer.parseInt(args[2]);
		laptop1.discountPercentage = Integer.parseInt([3]);
		
String [] e = args[2].split("@");
		
		Laptop laptop3 = new Laptop();
		
		laptop1.brand = e[0];
		laptop1.price = Integer.parseInt(args[1]);
		laptop1.taxPercentage= Integer.parseInt(args[2]);
		laptop1.discountPercentage = Integer.parseInt([3]);
		
		
	}

}
