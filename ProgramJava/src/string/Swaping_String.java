package string;

public class Swaping_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Rana";
		String name1="Sushmita";
		System.out.println(name+"----------------------"+name1);
		name=name+name1;
		name1=name.substring(0, name.length()-name1.length());
		name=name.substring(name1.length());
		
		System.out.println(name+"----------------------"+name1);

	}

}
