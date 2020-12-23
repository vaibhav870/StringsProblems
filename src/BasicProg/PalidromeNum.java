package BasicProg;

public class PalidromeNum {
    /*
    Get the number to check for palindrome
    Hold the number in temporary variable
    Reverse the number
    Compare the temporary number with reversed number
    If both numbers are same, print "palindrome number"
    Else print "not palindrome number"
   */
    public static void isPalindromeNum(int num){  //Get the number to check for palindrome
        int r=0;
        int sum=0;
        int t;
        t=num; // Hold the number in temporary variable
        while (num>0){
            r=num%10;
            //System.out.println("r: "+r);
            sum=(sum * 10) + r;
           // System.out.println("sum: "+sum);
            num=num /10;
        //    System.out.println("Num :" +num);
        } //Reverse the number
        System.out.println(sum);
        if(t==sum){// Compare the temporary number with reversed number
            System.out.println("Number is Palindrome" +num);
        }else {
            System.out.println("Number is not Palindrome" +num);
        }

    }

    public static void main(String[] args) {
        isPalindromeNum(1002);
    }
}
