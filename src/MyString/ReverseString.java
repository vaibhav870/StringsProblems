package MyString;

public class ReverseString {

	public static void main(String[] args) {
			
		String str="Vaibhav";
		
		int len=str.length();
		System.out.println(len);
		
		String rev;
		for (int i=len-1; i>=0;i--) {
			System.out.println(str.charAt(i));
		}
	}

}
