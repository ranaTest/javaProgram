 package string;

public class Reverse_String {

	
	public static void main(String[] arg){
		
		String name="Rana";
		String rev="";		
		char[] ch=name.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--){
			rev=rev+ch[i];
		}
		System.out.println(rev);
	}
}
