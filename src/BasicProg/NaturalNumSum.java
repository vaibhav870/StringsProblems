package BasicProg;

public class NaturalNumSum {

    public static void sum(int num){
        int sum=0;
        for (int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        sum(100);
    }
}
