package BasicProg;

public class SwapNo {
    public static void swaptemp(int x,int y){

        int t=x;
        x=y;
        y=t;
        System.out.println("x: "+Math.abs(x)+" y: "+Math.abs(y));
    }
    public static void swaparth1(int x,int y){
        x=x+y;
        y=x-y;
        x=y-x;
        System.out.println("x: "+Math.abs(x)+" y: "+Math.abs(y));
    }

    public static void swaparth2(int x,int y){
        x = x * y; // x = 500
        y = x / y; // y = 10
        x = x / y; // x = 50

        System.out.println("x: "+Math.abs(x)+" y: "+Math.abs(y));
    }

    public static void main(String[] args) {
        int a=20,b=30;
        System.out.println("a: "+a+" B:" +b);
        swaptemp(a,b);
        swaparth1(a,b);
        swaparth2(a,b);
    }



}
