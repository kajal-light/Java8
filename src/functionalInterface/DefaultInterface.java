package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultInterface {
    public static void main(String[] args) {
//        Consumer<Integer> cs = t -> System.out.println(t);
//
//        cs.accept(23);//out 23
//
//        List<Integer> list = Arrays.asList(1, 4, 2, 3, 4);
//        list.stream().forEach(t -> System.out.println(t));//out 1,4,2,3,4

        //*****************PREDICATES

//        Predicate<Integer>  ps=t->t%2==0;

//ps.test(5);//false

        List<Integer> list = Arrays.asList(1, 4, 2, 3, 4);
list.stream().filter(t->t%2==0).forEach(t-> System.out.println(t));

///*********************Supplier

        Supplier<String> st=()->"hi kajal";
st.get();

List<String> ls=Arrays.asList("a","b");

        System.out.println(ls.stream().findAny().orElseGet(st));




    }

}
