package arrays;

public class Find_Second_Highest_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 102, 33, 44, 22, 66, 89, 102, 104, 33 };

		int fbig = num[0];
		int sbig = 0;
		int size = num.length;

		for (int i = 1; i < size; i++) {

			if (num[i] > fbig) {
				sbig = fbig;
				fbig = num[i];
			} else if (num[i] > sbig && fbig > num[i])
			{
				sbig = num[i];
			}
		}
		
		System.out.println("Second heighest number---->"+sbig);
	}

}
