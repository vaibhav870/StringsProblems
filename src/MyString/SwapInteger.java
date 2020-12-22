package MyString;

public class SwapInteger {

    public void swap1(int x,int y){
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x: "+x+" y: "+y);
    }
    public void swap3(int x,int y){
        x=x*y;
        y=x/y;
        x=x/y;
        System.out.println("x: "+x+" y: "+y);
    }
    public void swap2(int x,int y){
        int t=0;
        t=x;
        x=y;
        y=t;

        System.out.println("x: "+x+" y: "+y);
    }


    public static void main(String[] args) {
        int a= 40 ;
        int b=50 ;
        SwapInteger s1= new SwapInteger();
        s1.swap1(a,b);
        s1.swap2(a,b);
        s1.swap3(a,b);
    }
}
