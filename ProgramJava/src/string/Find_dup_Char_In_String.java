package string;

public class Find_dup_Char_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="testYantra";
		char[] ch=name.toCharArray();
		int i,j;
		int l=ch.length;
		
			for (i=0;i<l;i++){
			int count=1;			
			for(j=i+1;j<l;j++){
				
				if(ch[i]==ch[j]){
					count++;
					
					ch[j]='*';
					
				}
				
			}
			if(ch[i]!='*' && count>1){
				System.out.println("Duplicate charecter in String is "+ch[i]+"--------->"+count);
			}
			
		}
		//count+=1;
		

	}

}
