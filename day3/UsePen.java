package day3;

public class UsePen {
	public static void main (String [] args) {
		Pen pen1 =  new Pen ();
		pen1.brand = "reynolds";
		pen1.price = 5;
		pen1.color = "blue";
		
		Pen pen2  = new Pen();
		pen2.brand = "parker";
		pen2.price = 25;
		pen2.color = "green";
		
		String upp = pen1.brand.toUpperCase()  + "  "+ pen2.brand.toUpperCase();
		boolean  contain = pen1.brand.contains("r")    ;
		boolean contain1 = pen2.brand.contains("r");
		boolean equal = pen1.color.equals("blue");
		int len = pen1.color.length();
		char cha = pen1.color.charAt(3);
		int ind = pen1.brand.indexOf("l") ;
		int ind1 = pen1.color.indexOf("u") ;
		
		String[] spl = pen1.brand.split("reynolds");
		char[] chararray = pen1.brand.toCharArray( );
		
		
		String line = "world wide wonder";
		
		String[] array = line.toCharArray("world wide wonder");
		
		
		
		 
		
		
		
		
		
		
		
		System.out.println(array);
		
		
		
	}
	

}
