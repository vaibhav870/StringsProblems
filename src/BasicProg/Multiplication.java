package BasicProg;

public class Multiplication {
    public static void Mtable(int num){
        for (int i=1;i<=10;i++){
            System.out.println(num+ " x "+i+ ": "+(num*i));
        }
    }



    public static void main(String[] args) {

        Mtable(12);
    }
}
