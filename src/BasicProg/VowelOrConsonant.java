package BasicProg;

public class VowelOrConsonant {


    public static String Check_vowel_consonent(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";
        } else {
            return "Consonant";
        }
    }

    public static void usingSwitch(char c){
        switch (c) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Voewl");
            default -> System.out.println("Consonent");
        }

    }
    public static void Check_string_vowel_consonent(String st) {
        for (int i = 0; i < st.length(); i++) {
            System.out.println(st.charAt(i) + " is " + Check_vowel_consonent(st.charAt(i)));
            System.out.println("* "+st.charAt(i)+" is "+ Check_vowel_consonent(st.charAt(i))+" *");
        }
    }

    public static void main(String[] args) {
        System.out.println(Check_vowel_consonent('a'));
        Check_string_vowel_consonent("vaibhav");

    }
}
