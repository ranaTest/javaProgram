package sorting;

public  
class Bubble_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num={4,1,3,2,9,8};
		
		
		for(int i=num.length-1;i>=0;i--){
			
			for(int j=0;j<num.length-1;j++){
				int k=j+1;
				if(num[j]<num[k]){
					int temp=num[j];
					num[j]=num[k];
					num[k]=temp;
				}
			}
			
		}
		for( int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}

	}

}
