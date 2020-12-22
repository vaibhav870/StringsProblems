package MyString;

public class StringManipulation {
    public static void main(String[] args) {
        String str="Women Heart is Deep ocean of secrets";

        System.out.println(str.length());

       // System.out.println(str.charAt(10));   // return character at index
      //  System.out.println(str.indexOf("D"));  // return index of character
        System.out.println(str.indexOf('e', str.indexOf('e', str.indexOf('e')+1)+1));
        //                   first + 1 second + 1 third
        System.out.println(str.indexOf('e',str.indexOf('e',str.indexOf('e',str.indexOf('e')+1)+1)+1));



        String z="      vaibhavM";
        System.out.println(z.trim());
        System.out.println(str.substring(0,5));

        String str1="vaibhav_m_muddebihalkar";
             String splited []=str1.split("_");
                for(String item:splited){
                    System.out.println(item);
                }
            StringBuffer rev=new StringBuffer(str1);
        System.out.println(rev.reverse());
            String rev1=null;
        for (int i=str1.length()-1;i>=0;i--){
             rev1= rev1 +str1.charAt(i);
        }
        System.out.println(rev);

        String st1="hello";
        String st2="world";
                int a=100;int b=200;
                //left to right execution
        System.out.println(st1+st2+a+b);  //helloword100200
        System.out.println(a+b+st1+st2);  //300helloworld

        System.out.println(st1+st2+(a+b));
    }
}
