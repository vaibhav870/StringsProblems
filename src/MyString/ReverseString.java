package MyString;

public class ReverseString {
    public static void main(String[] args) {
        String s="vaibhav";
        int len=s.length();
        String rev="";

        for (int i=len-1;i>=len;i--){
            rev=rev+s.charAt(i);

        }

        System.out.println(rev);
    }
}
