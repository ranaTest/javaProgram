package arrays;

public class Find_Bigest_Number_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num={22,33,11,55,67};
		
		int fbig=0;
		int arrsize=num.length;
		
		for(int i=0;i<arrsize;i++){
			
			if(num[i]>fbig){
				
				fbig=num[i];
			}
			
		}
		System.out.println(fbig);

	}

}
