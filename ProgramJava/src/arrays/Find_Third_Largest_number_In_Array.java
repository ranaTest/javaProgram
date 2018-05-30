package arrays;

public class Find_Third_Largest_number_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 66, 22, 77, 11, 88, 55, 44, 88, 55, 345, 667, 345, 988 };
		int fbig = num[0];
		int sbig = 0;
		int tbig = 0;

		int arrsize = num.length;

		for (int i = 1; i < arrsize; i++) {

			if (num[i] > fbig) {
				sbig = fbig;
				fbig = num[i];

			} else if (num[i] > sbig) {

				tbig = sbig;
				sbig = num[i];
			} else if(num[i]>tbig && sbig>num[i] && fbig>num[i]){
				tbig=num[i];
			}
		}
		System.out.println(fbig);
		System.out.println(sbig);
		System.out.println(tbig);

	}

}
