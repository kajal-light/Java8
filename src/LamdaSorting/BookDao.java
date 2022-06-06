package LamdaSorting;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
public List<Books> getBooks(){
    List<Books> list=new ArrayList<>();

    list.add(new Books(23,"kajal",33));
    list.add(new Books(22,"core",33));
    list.add(new Books(12,"java",33));
    list.add(new Books(11,"yes",33));
return list;
}


}
