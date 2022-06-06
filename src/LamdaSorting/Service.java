package LamdaSorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Service {

    public static void main(String[] args) {
        //getListSort();

    }



public static List<Books> getListSort(){

    List<Books> book= new BookDao().getBooks();

   // Collections.sort(book,new MyComaparator());

    //*********************************
   //Collections.sort(book,new Comparator<Books>);
    //override the method

//    @Override
//    public int compare(Books o1, Books o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}

//**********************LAMDA


//Collections.sort(book,((O1,O2)->o1.getName().compareTo(o2.getName()));



return book;

}


}

//Traditional approach
//class MyComaparator implements Comparator<Books>{
//
//
//    @Override
//    public int compare(Books o1, Books o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}