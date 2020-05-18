package techcoding;

public class SplitWord {
	
	public static void main(String[] args) {
		
		String country = "United State Of America";
		
		String [] s = country.split("");
		
		for(int i=0; i<s.length; i++) {
			
		System.out.println(s[i]);
		}
	}

}
