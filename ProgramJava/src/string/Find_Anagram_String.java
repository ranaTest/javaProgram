package string;

public class Find_Anagram_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ranaa"; 
		String s2="RANAb"; 
		char[] ch1=s1.toLowerCase().toCharArray(); 
		char[] ch2=s2.toLowerCase().toCharArray(); 
		char temp=' '; 
//		boolean status=true; 
//		int n=ch2.length+ch1.length; 
		// System.out.println(n); 
		for(int i=0;i<ch1.length;i++){ 
		for (int j=i+1;j<=ch1.length-1;j++){ 
		if(ch1[i]>ch1[j]){ 
		temp=ch1[i]; 
		ch1[i]=ch1[j]; 
		ch1[j]=temp; 
		} 
		} 
		} 
		System.out.println(ch1); 
		for(int i=0;i<=ch2.length-1;i++){ 
		for (int j=i+1;j<=ch2.length-1;j++){ 
		if(ch2[i]>ch2[j]){ 
		temp=ch2[i]; 
		ch2[i]=ch2[j]; 
		ch2[j]=temp; 
		} 
		} 
		} 
		System.out.println(ch2); 
		for (int i=0;i<=ch1.length-1;i++){ 
		if(ch1[i]==ch2[i]){ 
		temp=' '; 
		} 
		} 
		for (int i=0;i<=ch1.length-1;i++){ 
		if(ch1[i]!=ch2[i]){ 
		temp=ch1[i]; 
		} 
		} 
		if(temp==' '){ 
		System.out.println("this is a anagram string "+s2); 
		}else{ 
		System.out.println("this is not anagram string " +s2); 
		} 
		} 

}
