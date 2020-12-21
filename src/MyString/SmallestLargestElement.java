package MyString;

public class SmallestLargestElement {
    public static void main(String[] args) {
        int num[] = {0};

        int smallest = num[0];
        int largest = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i]>largest){
                largest=num[i];
            }
            if (num[i]<smallest){
                smallest=num[i];
            }
        }

        System.out.println("Largest: "+largest);
        System.out.println("Smallest: "+smallest);
    }
}
