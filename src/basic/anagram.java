package basic;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int len_a=a.length();
        int len_b=b.length();
        int value;

        Map<Character, Integer> charIntDictionary1 = new HashMap<>();
        Map<Character, Integer> charIntDictionary2 = new HashMap<>();

        for(int i=0;i<len_a;i++){
            if (charIntDictionary1.containsKey(a.charAt(i))) {
               value=charIntDictionary1.get(a.charAt(i))+1;
                charIntDictionary1.put(a.charAt(i),value);
            }
            else{
                charIntDictionary1.put(a.charAt(i),1);
            }
        }
        for(int i=0;i<len_b;i++){
            if (charIntDictionary2.containsKey(b.charAt(i))) {
                value=charIntDictionary2.get(b.charAt(i))+1;
                charIntDictionary2.put(b.charAt(i),value);
            }
            else{
                charIntDictionary2.put(b.charAt(i),1);
            }
        }

        if (compareDictionaries(charIntDictionary1, charIntDictionary2)) {
            return  true;
        } else {
            return  false;
        }

    }
    private static boolean compareDictionaries(Map<?,?> Dic1,Map<?,?> Dic2) {
        if (Dic1.size()!=Dic2.size()){
            return false;
        }

        for (Map.Entry<?,?> entry:Dic1.entrySet()){
            if( !Dic2.containsKey(entry.getKey()) || !Dic2.get(entry.getKey()).equals(entry.getValue())){
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {


        String a = "anagram".toLowerCase();
        String b = "Margana".toLowerCase();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}