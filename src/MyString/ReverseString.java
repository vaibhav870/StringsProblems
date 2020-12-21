package MyString;

public class ReverseString {

	public static void main(String[] args) {
			
		String str="Vaibhav";
		
		int len=str.length();
		System.out.println(len);
		
		String rev="";
		for (int i=len-1; i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

		StringBuffer strb= new StringBuffer(str);
		strb.reverse();
		System.out.println(strb);
	}

}
