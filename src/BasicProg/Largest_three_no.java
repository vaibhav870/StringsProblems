package BasicProg;

public class Largest_three_no {

    public static void largest(int x,int y,int z){
        if(x>y && x>z){
            System.out.println(x+" is greater");
        }else if (y>z){
            System.out.println(y+" is greater");
        }else {
            System.out.println(z+" is greater");
        }

    }

    public static void main(String[] args) {
        largest(50,40,30);
    }
}
