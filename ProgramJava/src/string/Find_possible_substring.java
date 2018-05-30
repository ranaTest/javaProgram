package string;

public class Find_possible_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String company="testyantara";
		
		String s1=company.toUpperCase();
		for(int i=0;i<s1.length();i++){
			for(int j=i+1;j<s1.length();j++){
				System.out.println(s1.substring(i, j));
			}
		}

	}

}
