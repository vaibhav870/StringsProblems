package BasicProg;

public class LeapYear {

    public static boolean findLeap(long x){

        if(x%4==0){
            if (x%400==0) {
                if(x%100==0){
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(findLeap(1900));
    }
}
