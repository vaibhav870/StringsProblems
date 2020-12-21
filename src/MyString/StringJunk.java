package MyString;

public class StringJunk {
    public static void main(String[] args) {
        String str= "@#@@#@$@#$@%@# vaibhav @#$@%original$%#&%(&*(&$@ string@#$#%#$%$#%# ";

        //[a-zA-Z0-9] for all small captial alphaphets and number
        str=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);
    }
}
