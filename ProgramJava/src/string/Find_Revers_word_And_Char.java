package string;

public class Find_Revers_word_And_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="love am rana thakur";
		
		String[] word=name.split("\\s");
		String rev=" ";
		
		for(int i=word.length-1;i>=0;i--){
			String s2=word[i];
			
			for(int j=s2.length()-1;j>=0;j--){
				rev=rev+s2.charAt(j);
			}
			rev=rev+" ";
			
		}
		System.out.print(rev);		

	}

}
