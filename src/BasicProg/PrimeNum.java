package BasicProg;

public class PrimeNum {
    // 2 is lowest prime
    // 3 is prime

    public static boolean isPrime(int num){
        //check is o or  less than 1
        if(num<=1){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void getPrimes(int num1){
      for(int i=2;i<num1;i++){
          if(isPrime(i)){
              System.out.println(i);
          }
      }
    }

    public static void main(String[] args) {
       // System.out.println("10 Is Prime "+isPrime(10));
        //System.out.println("0 Is Prime "+isPrime(0));
        //System.out.println("-2 Is Prime "+isPrime(-2));
        //System.out.println("2 Is Prime "+isPrime(2));
        getPrimes(30);

    }
}
