package string;

public class Find_Digit_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String captcha= "you otp is 1234";
		
		//String[] words=captcha.split("\\s");
		
		char[] ch=captcha.toCharArray();
		
		for(int i=0;i<ch.length;i++){
			
			if(Character.isDigit(ch[i])){
				System.out.print(ch[i]+" ");
				
			}
		}

	}

}
