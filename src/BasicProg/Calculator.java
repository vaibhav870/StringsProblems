package BasicProg;

import java.util.Scanner;

public class Calculator {
    public static void calc(int n1,int n2,char op){
        double result;
        switch (op){
            case '+':
                result=n1 + n2;
                System.out.println(result);
                break;
            case '-':
                result=n1 - n2;
                System.out.println(result);
                break;
            case '*':
                result=n1 * n2;
                System.out.println(result);
                break;
            case '/':
                if (n2!=0){
                result=n1 / n2;
                    System.out.println(result);
                }else {
                    throw new ArithmeticException("/ by zero");
                    }

                break;
            default:
                System.out.println("invalid Operator");
        }

    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1=scn.nextInt();
        System.out.println("Enter the operator");
        char op=scn.next().charAt(0);
        System.out.println("Enter the num2");
        int num2=scn.nextInt();
            calc(num1,num2,op);

    }
}
