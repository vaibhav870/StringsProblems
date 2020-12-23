package BasicProg;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class DuplicateWord {


    public static void findDuplicateWord(String input){

        // split the string in words
        String words[]=input.split(" ");

        //store words in HashMap
        Map<String,Integer> wordcount=new HashMap<>();
        for(String word:words){
                if(wordcount.containsKey(word)){ // check word is present or not in map

                                         // word         1+1
                    wordcount.put(word.toLowerCase(),wordcount.get(word)+1);  // if yes the retrive word and its value 1 and add 1
                }
                else {
                    wordcount.put(word,1); // if word is not available then add word with 1 value
                }
        }
        System.out.println(wordcount);

        Set<String> wordsinString= wordcount.keySet();

        for (String item:wordsinString){
            if(wordcount.get(item)>1){
                System.out.println(item+ " Count "+wordcount.get(item));
            }
        }



    }
    public static void main(String[] args) {
        String inputString="hello java is best top programming is java concept ";
        String input="Python is as best for Python inteface but it is not working as Java";
        findDuplicateWord(inputString);
        findDuplicateWord(input);

    }
}
