package arrays;

public class Find_Reverse_Array_By_Half {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num={1,2,3,4,5,6,7,8};
		
		int size=num.length;
		
		for(int i=0;i<=size/2;i++){
			
			if(i<size/2){
				System.out.print(num[i]);
			}else{
				for(int j=num.length-1;j>=size/2;j--){
					System.out.print(num[j]);
				}
			}
		}

	}

}
