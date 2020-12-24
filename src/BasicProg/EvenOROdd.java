package BasicProg;

public class EvenOROdd {

    public static String EvenOrOdd(int x) {
        if (x >=0) {
            if (x % 2 == 0) {
                return "Even";
            } else {
                return "odd";
            }
        }
        return "Invalid No";
    }


    public static void main(String[] args) {
        System.out.println(EvenOrOdd(-1));
    }
}
