package BasicProg;

public class AscIIValue {

    public static void main(String[] args) {
        String str= "vaibhav";
        int asc=0;
        for (int i=0;i<str.length();i++){
            asc=str.charAt(i);
            System.out.println(str.charAt(i)+ "||"+asc);

        }

    }
}
