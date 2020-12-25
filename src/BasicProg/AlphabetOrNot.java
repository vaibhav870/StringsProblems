package BasicProg;

import java.util.regex.Pattern;

public class AlphabetOrNot {

    public static void isAlphabet(char c){
        if((c>='a'&& c<='z')|| (c>='A' && c<='Z'))
        {
            System.out.println("Alphabet");
        }else {
            System.out.println("Not Aphabet");
        }
    }


    public static void main(String[] args) {

        isAlphabet('A');
    }
}
