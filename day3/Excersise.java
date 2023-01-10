package day3;

public class Excersise {
	public static void main (String []args) {
		String institute = "oneSofT";
		String upper = institute.toUpperCase();
		String lower = institute.toLowerCase();
		int length = institute.length();
		String join= upper.concat("technologies");
		
		System.out.println(institute+ " ," + upper+ " , " + lower +" ," + length + " ," + join);
		
	
		
		String fruit = "Mango";
		boolean check = fruit.contains("ngo");
		boolean start = fruit.startsWith ("Ma");
		boolean end = fruit.endsWith("go");
		boolean equals = fruit.equals("Mango");
		boolean equalsignore = fruit.equalsIgnoreCase("MaNGo");
		
		System.out.println (check+" " + start+ " " + end+ " "+ equals+ " " + equalsignore);
		
		String name = "gaja";
		int index = name.indexOf ('a');
		char letter = name.charAt(2);
		String word = name.substring(2,4);
		
		System.out.println(name +", " +  index+ ", " + letter+", "+ word );
		
		
		String word1 = "technnologies";
		String uppercase = word1.toUpperCase();
		String lowercase = word1.toLowerCase();
		int lengths = word1.length();
		String joins = word1.concat("onesoft");
		boolean contains = word1.contains("nol");
		boolean starting = word1.startsWith("t");
		boolean ending = word1.endsWith("es");
		boolean equal = word1.equals("technologies");
		boolean equalignore = word1.equalsIgnoreCase("technnologies");
		
		System.out.println (name + uppercase + lowercase + lengths + joins + contains +starting+ ending +equal + equalsignore );
		
		
				
		
		
		
		
		
		
		
		
		
				
	}

}
