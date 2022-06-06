package FilterAndForEachMethod;

import java.util.*;

public class Functions {

    public static void main(String[] args) {

List<String> list= Arrays.asList(args);
list.add("java");
list.add("software");
list.add("kajal");
list.add("capgemini");
list.add("yes");
//
//use for iterate
list.stream().filter(t->t.startsWith("s")).forEach(t-> System.out.println(t));


      Map<Integer,String> map=new HashMap<>();

map.put(1,"d");
map.put(2,"a");
map.put(3,"f");
map.put(4,"g");
//
//map.forEach((key,value)-> System.out.println(key + value));
//map.entrySet().stream().filter(t->t.getKey()%2==0).forEach(obj-> System.out.println(obj));
//


    }



}
