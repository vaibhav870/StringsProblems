package MyString;

public class Reverseint {

    public static void main(String[] args) {

        int num=123456;
        int rev=0;

        while (num!=0){
            rev =rev *10 + num % 10;

            System.out.println(+rev);
            num = num/10;
        }
        System.out.println(rev);
        long test=6789;
        System.out.println(new StringBuffer(String.valueOf(test)).reverse());




    }
}
