package BasicProg;


public class PowerOFNum {


    public static void powerNum(int num ,int pow){
        int result=1;
        while (pow!=0){
            result=result * num;
            --pow;
        }
        System.out.println(result);

    }
    public static void main(String[] args) {
        powerNum(2,3);
    }
}
