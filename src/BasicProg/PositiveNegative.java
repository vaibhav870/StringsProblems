package BasicProg;

public class PositiveNegative {

    public static void CheckNum(double num) {
        if (num >=0) {
            System.out.println("Positive");
        } else {
            System.out.println("negative");
        }
    }

    public static void main(String[] args) {
            CheckNum(-10.1);

    }
}
