package techcoding;

public class FindLetter {
	public static void main(String[] args) {
		

		String country = new String("United State Of America");
		
		int count = 0;
		
		for(int i=0; i<country.length(); i++) {
			
			if(country.charAt(i)=='e') {
			System.out.println("");
		//	System.out.println(name.charAt(i)+"::"+count);
			System.out.println("Index of e::"+i);
			count++;
			
			}
		}

		
	}
}