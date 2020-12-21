package MyString;

public class StringJunk {
    public static void main(String[] args) {
        String str= "@#@@#@$@#$@%@# vaibhav @#$@%original$%#&%(&*(&$@ string@#$#%#$%$#%# ";


        str=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);
    }
}
