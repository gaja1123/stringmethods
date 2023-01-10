package day3;

public class UseCar {
	public static void main(String []args) {
	
	String[] a = args [0].split("#");
	
	Car car1= new Car();
	
	car1.brand = a[0];
	car1.price = Integer.parseInt(a[1]);
	car1.isGear = Boolean.parseBoolean(a[2]);
	car1.topspeed = Integer.parseInt(a[3]);
	
	
	String [] b = args[1].split("@");
	
	Car car2 = new Car (); 
	
	car2.brand = b [0];
	car2.price = Integer.parseInt(b[1]);
	car2.isGear = Boolean.parseBoolean(b[2]);
	car2.topspeed = Integer.parseInt(b[3]);
	
	String [] c = args[2].split ("&");
	
	Car car3 = new Car ();
	car3.brand = c[0];
	car3.price = Integer.parseInt(c[1]);
	car3.isGear = Boolean.parseBoolean(c[2]);
	car3.topspeed = Integer.parseInt(c[3]);
	
	
	
	System.out.println(car1.brand + " " + car1.price + " "+ car1.topspeed+" "+car1.isGear);
	System.out.println(car2.brand + " " + car2.price + " "+ car2.topspeed+" "+car2.isGear);
	System.out.println(car3.brand + " " + car3.price + " "+ car3.topspeed+" "+car3.isGear);
	
	
	
	
	
	
	
	
	
	}
}
