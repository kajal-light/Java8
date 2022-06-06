package java8Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfOcurrence {

    public static void main(String[] args) {
String str="welcome to java world its great to";

List<String> list= Arrays.asList(str.split(" "));


Map<String ,Long> ans=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(ans);
//Collectors.groupingBy is use to collect similar elemt
  //  Function.identity(), is simple collect the word or any input
  //counting give the count

    }
}
