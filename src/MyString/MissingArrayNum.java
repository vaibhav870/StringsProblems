package MyString;

public class MissingArrayNum {
    public static void main(String[] args) {
        int a[]={-1,0,1,2,4,5,6,7,8,9,10};

        int sum=0;
        int actualsum=0;
        for(int i=0;i<a.length;i++){
            sum= sum +a[i];
        }
     // System.out.println(sum);
        for (int j=-1;j<=10 ;j++){
        //  System.out.println(j);
                actualsum=actualsum+Math.abs(j);

        }
   // System.out.println(actualsum);
        int missnum=actualsum-sum;
        System.out.println(missnum);
    }


}
