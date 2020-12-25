package BasicProg;

public class ReverseNum {

    public static void revNum(long num){

        long  rev =0;
        while (num!=0){
            rev=rev * 10+ num%10;
            //System.out.println(rev);
            num=num/10;
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        revNum(123456);
    }
}
