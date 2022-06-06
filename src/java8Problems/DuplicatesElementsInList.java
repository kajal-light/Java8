package java8Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesElementsInList {
    public static void main(String[] args) {


        List<Integer> ele= Arrays.asList(2,3,2,4,3,5);
Set<Integer> set=new HashSet<>();

ele.stream().filter(x->!set.add(x)).collect(Collectors.toSet()).forEach(x-> System.out.println(x));
//using collect method to collect set for to get only one number whather it is repating more than three times

    }
}
