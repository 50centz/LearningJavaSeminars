package LearningJavaSeminars.Seminar5;

import java.util.HashMap;
import java.util.Map;

public class izomorf {
    Map<String, String> map = new HashMap<>();

    boolean izomorff(String slovo1, String slovo2 ){
        Map<Character, Character> map = new HashMap<>();

        if(slovo1.length() != slovo2.length()) return false;

        char[] someSlovo1 = slovo1.toCharArray();
        char[] someSlovo2 = slovo2.toCharArray(); 

        for (int i = 0; i < someSlovo1.length; i++) {
            if(map.containsKey(someSlovo1[i])){
                if(map.get(someSlovo1[i]) == someSlovo2[i])
                return false;
            }
            else{
                map.put(someSlovo1[i], someSlovo2[i]);
            }
        }

        return true;
    }
}
