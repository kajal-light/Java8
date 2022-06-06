package customizeProblem;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {

    List<Employee> emp=new ArrayList<>();
    emp.add(new Employee(1, "jkk  ", 34000.0, "female", 32));
        emp.add(new Employee(2, "ramesh  ", 52000.0, "male", 22));
        emp.add(new Employee(3, "kajal  ", 23000.0, "female", 12));
        emp.add(new Employee(4, "prakash  ", 10000.0, "male", 21));
        emp.add(new Employee(5, "shubham  ", 13000.0, "male", 32));
        emp.add(new Employee(6, "tanmay  ", 45000.0, "male", 40));
        emp.add(new Employee(7, "akash  ", 1234.0, "male", 32));

        //Query:1 how may female and male are there in compay
        method1(emp);
        //print the distint male female
        System.out.println("/n");
        method2(emp);
        //average male and female
        method3(emp);
//get the detail of higst paid salary
        method4(emp);
        //get emp whoes age is grreater than 21
        method5(emp);



    }

    private static void method5(List<Employee> emp) {

        emp.stream().map(Employee::getAge).filter(x->x>21).forEach(x->  System.out.println(" max age "+ x));
        //
        emp.stream().filter(x->x.getSalary()>21).map(Employee::getName).forEach(x->  System.out.println(" max age "+ x));

    }

    private static void method4(List<Employee> emp) {

   //double ans= emp.stream().mapToDouble(Employee::getSalary).max().getAsDouble();

       // System.out.println(ans);

   Optional<Employee> TT=   emp.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println(TT.get().getName());

    }

    private static void method3(List<Employee> emp) {
        Map<String,Double> map=emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println("average" + map);
    }

    private static void method2(List<Employee> emp) {
emp.stream().map(Employee::getGender).distinct().forEach(s-> System.out.println(s));

    }

    private static void method1( List<Employee> emp) {

Map<String,Long> map=emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));

        System.out.println(map);


    }


}
