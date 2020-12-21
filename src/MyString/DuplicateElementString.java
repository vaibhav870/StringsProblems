package MyString;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementString {
    public static void main(String[] args) {
        String name[]={"java","qa","jscript","python","java"};

        for(int i=0;i<=name.length;i++){

            for (int j=i+1;j<name.length;j++){
                if(name[i].equals(name[j]))
                    System.out.println("Duplicate:: "+name[i]);
            }
        }

        System.out.println("***********************");

        Set<String> store= new HashSet<String>();

        for (String item:name){
            if(!store.add(item)){
                System.out.println("Duplicate::"+item);
            }
        }

        System.out.println("***********************");

        int a[]={1,2,3,4,5,5,6,7,8};

        for (int x=0;x<a.length;x++){
            for (int y=x+1;y<a.length;y++){
                if (a[x]==a[y]){
                    System.out.println("Duplicate:: "+a[x]);
                }
            }
        }
        Set<Integer> numstore=new HashSet<>();

        for(Integer item:a){
            if(!numstore.add(item)){
                System.out.println("Duplicate:: "+item);
            }
        }

    }
}
