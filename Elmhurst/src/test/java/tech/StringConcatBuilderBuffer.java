package tech;

public class StringConcatBuilderBuffer {
	public static void main(String[] args) {
		
// String is Immutabel
// String Buffer is mutable and Synchronize
// String Builder is mutabe but not Synchronize and faster
		
		String a = ("OLI");
		       a = ("MD");
		       a = ("RAHMAN");
		String ab = new String (" OLI");
		
		System.out.println(a.concat(ab));
	
   StringBuffer Buffer = new StringBuffer ("JAVED");
   Buffer.append(" AHMED");
   
		System.out.println(Buffer);
		
   StringBuilder builder = new StringBuilder ("MD OLIUR");
   builder.append(" RAHMAN");
   
        System.out.println(builder);
        
        String s = new String ("BANGLADESH");
		String y = new StringBuffer(s).reverse().toString();
		System.out.println(y);
	}

}
