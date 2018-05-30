package string;

public class Find_Total_Ocurrence_Char_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="hi how hello me to love people human human man people how hi you";
		String[] word=name.split("\\s");
		
		for(int i=0;i<word.length;i++){
			
			int count=1;
			
			for(int j=i+1;j<word.length;j++){
				
				if(word[i].equals(word[j])){
					word[j]=" ";
					count++;
					
				}
			}
			if(word[i]!=" " && count==1){
				System.out.println(word[i]+"--------->"+count);
			}
			
		}

	}

}
