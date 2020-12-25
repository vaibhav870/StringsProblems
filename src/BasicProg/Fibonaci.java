package BasicProg;

public class Fibonaci {

    public static void Fseries(int num){
        int n1=0;
        int n2=1;
        int sum=0;


        System.out.println(n1);
        System.out.println(n2);
        for (int i=1;i<num;i++){
            sum=n1+n2;
            System.out.println(n2);
            n1=n2;
            n2=sum;
        }
    }

    public static void main(String[] args) {
        Fseries(10);
    }
}
