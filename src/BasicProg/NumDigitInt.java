package BasicProg;

public class NumDigitInt {


    public static void count_digit(long num){
    int count=0;

        while (num!=0){
            num =num /10;
            ++count;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        count_digit(9890152573l);
    }
}
