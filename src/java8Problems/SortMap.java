package java8Problems;

import java.util.HashMap;
import java.util.Map;

public class SortMap {

    public static void main(String[] args) {

     Map<String ,Integer> map=new HashMap<>() ;
        map.put("f",2);
        map.put("kk",3);
        map.put("s",1);
        map.put("p",5);
        map.put("a",6);
     map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(x-> System.out.println(x));


    }
}
