package java8Problems;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicatesInaSingleString {

    public static void main(String[] args) {

    String str="kajal"  ;


  Map<String,Long> map=  str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Object::toString,Collectors.counting()));

map.forEach((key,value)-> System.out.println(key+value));


    }

}
