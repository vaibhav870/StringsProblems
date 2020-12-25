package BasicProg;

public class ArmstrongNumIntv {
    public static void armstrong(int low, int high) {
        int sum = 0, rev = 0;
        int t;
        for (int i=1;i<1000;i++){
            t = i;
            while (t > 0) {
                rev = t % 10;
                sum = sum + (rev * rev * rev);
                t = t / 10;
            }
            if (sum == i) {
                System.out.println(sum + "is armstrong");

            }
            sum=0;
        }
    }
        public static void main (String[]args){
            armstrong(1, 200);
        }

}
