package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapAndReduce {
    public static void main(String[] args) {

     List<Integer> list= Arrays.asList(1,4,2,3,5,4);


int ans=list.stream().mapToInt(e->e).sum();
        System.out.println(ans);
//******************************
Optional<Integer> ans2 =list.stream().reduce(Integer::sum);
        System.out.println(ans2.get());

        Integer ans22 =list.stream().reduce(Integer::sum).get();
        System.out.println(ans22);
//*******************************************
        Integer ans3=list.stream().reduce(0,(a,b)-> a+b);
        System.out.println(ans3);


        int mul=list.stream().reduce(1,(a,b)->a*b);
        System.out.println(mul);

//String s=words.stream.reduce((w1,w2)->w1.len>w2.len?w1:w2).get();

//sout(s)


 //get emp whoes grade is A
 //{
        //EMP.GETEM.stream.filter(e->e.getGrade().equal(A)).map(emp->emp.getSlarry)
        //.mapToDouble(i->i).average().getASdouble();
        //
        //
        // }


    }


}
