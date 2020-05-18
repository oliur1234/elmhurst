package techcoding;

public class Output {

	public static void main(String[] args) {
    
	 String s1 = new String("oliur");
	 
	 String s2 = new String("OLIUR");
	 
	 s2.intern();
	 
	 System.out.println(s1=s2);
	 
//System.out.println(s1==s2);

	}

}
