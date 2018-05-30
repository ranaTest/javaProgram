package string;

public class Find_duplicate_words {
	
	
	public static void main(String[] args) {
		
	String name="I have pen and pen cost me cost";
	
	String[] words=name.split("\\s");
	
	
	for (int i=0;i<words.length;i++){
		
		int count=1;
		for(int j=i+1;j<words.length;j++){
			
			if(words[i].equals(words[j])){
				words[j]=" ";
				count++;
			}
		}
		if(words[i]!=" "&& count>1){
			System.out.println(words[i]+"---------->"+count);
		}
		
	}

}
}
