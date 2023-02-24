package LearningJavaSeminars.Seminar5;

import java.util.HashMap;
import java.util.Map;

public class Passports {
    private Map<String, String> map = new HashMap<>();

    void add(String passport, String name){
        map.put(passport, name);
    }
}
