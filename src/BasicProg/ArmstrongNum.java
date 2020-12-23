package BasicProg;

/*Armstrong Number in Java: A positive number is called armstrong number
   if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
   153
   1*1*1=1
   5*5*5=125
   3*3*3=27
   1+125+27=153
*/



public class ArmstrongNum {

    public static void isArmstrong(int num){
        int r=0;
        int cube=0;
        int t;
        t=num;
            while (num>0){
                r=num%10;
                cube=cube +(r*r*r);
                num =num /10;
            }
            if (t==cube){
                System.out.println("Number is armstorng");
            }else {
                System.out.println("Number is not a armstorng");
            }
    }
    public static void main(String[] args) {
       int a[]={0, 1, 153, 370, 371, 407,10};
        for(int item:a){
            isArmstrong(item);
        }

    }
}
