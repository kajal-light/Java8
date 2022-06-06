package java8Problems;

import java.util.stream.IntStream;

public class StringJava8 {

    public static void main(String[] args) {
  String str="hello hello"  ;

 long ans= str.chars().filter(x->x=='a' ||x=='e' ).count();

        System.out.println(ans);

        IntStream a=str.chars();
        System.out.println(a);
    }

    
}
