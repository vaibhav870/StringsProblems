package BasicProg;

public class FactorialNum {

//4=4*3*2*1

    //1 without using Recursive Function

    public static int factorial(int num){
        int fact=1;
        if (num==0){
            return 1;
        }
        for (int i=1;i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }


 // 2 with recursive function
 public static int factorial2(int num){
     int fact=1;
     if (num==0){
         return 1;
     }
     return (num * factorial2(num -1));
 }
    public static void main(String[] args) {
      //  System.out.println(factorial(4));
        System.out.println(factorial2(5));

    }
}
