package FilterAndForEachMethod;

import java.security.KeyStore;
import java.util.*;

public class SortList {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 4, 2, 3, 4);
        Collections.sort(list);//ascending
        Collections.reverse(list);

//****************STREAM
        list.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.println(t));

        //*****************custom logic
//
//  List<emp> st=database.getem();

//collection.sort(emp,(o1,o2)->o1.getSalary.COMPAREt(O2.getSalary)));
//st.Steam().sorted(mp,(o1,o2)->o1.getSalary.COMPAREt(O2.getSalary)).foreach;
//st.Steam().sorted(Comparator.comparing(emp->emp.getSalary()).foreACH;
//st.Steam().sorted(Comparator.comparing(employees calss name:: get name)).foreach;


//collection.sort(CLASSNAME::METHODnAME).foreACH;

        //use stream------------------------

//******************************
    }}