package BasicProg;

public class test {
    public static void palindrom(int num){
        int rev=0;
        int sum=0;
        int t;
        t=num;
        while(num!=0){
            rev=rev * 10 + num %10;

            num=num/10;
        }
        System.out.println(rev);
        if (t==rev){
            System.out.println("Palindrom");
        }else {
            System.out.println("not palindrome");
        }
    }



    public static void main(String []args){
        palindrom(1331);
    }
}
