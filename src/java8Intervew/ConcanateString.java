package java8Intervew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcanateString {

    public static void main(String[] args) {
        List<String> str= Arrays.asList("kajal"," is","crazy");

        str.stream().map(String::valueOf).collect(Collectors.joining("_"));


    }
}
