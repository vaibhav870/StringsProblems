package BasicProg;

public class PrimeInterval {
    public static void primebetween(int low, int high) {
        while (low < high) {
            boolean flag = false;
            for (int i = 2; i < low; i++) {
                if (low % i == 0) {
                    flag = true;
                    // System.out.println(low);
                    break;
                }
            }

            if (!flag) {
                System.out.println(low + "");
            }
            low++;
        }
    }


    public static void main(String[] args) {
            primebetween(20,50);

    }
}