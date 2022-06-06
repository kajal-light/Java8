package java8Problems;

import java.util.Arrays;
import java.util.List;

public class LimitAndSkip {
//The limit() method returns a reduced stream of first N elements but skip() method returns a stream of remaining elements after skipping first N elements.
//limit() is a short-circuiting stateful intermediate operation i.e, when processed with an infinite input, it may produce a finite stream as a result without processing the entire input but skip() is a stateful intermediate operation i.e, it may need to process the entire input before producing a result.
    public static void main(String[] args) {
    List<Integer> list= Arrays.asList(2,4,35,67,8,23);

        list.stream().limit(3).forEach(x-> System.out.println(x));//2,4,35
        System.out.println();
list.stream().skip(3).forEach(x-> System.out.println(x));//67,8,23
    }

}
