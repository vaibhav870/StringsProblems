package MyString;

public class SwapString {
    public static void main(String[] args) {
        String a="hello";
        String b="world";
        System.out.println("befor Swapping");
        System.out.println("a Value "+a);
        System.out.println("b Value "+b);
        // 1 append  a and b
        a =a + b ;  // helloworld

        //2 store b in intial a
        b= a.substring(0,a.length()-b.length());       //(0,10-5)

        // 3 store a intial b
        a=a.substring(b.length()); //(5)


        System.out.println("a Value "+a);
        System.out.println("b Value "+b);
    }
}
