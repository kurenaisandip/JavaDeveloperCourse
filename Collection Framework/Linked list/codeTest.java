package ninth;

import java.awt.print.Book;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class codeTest {

    public static void main(String[] args) {


        // linked list
        List<Book> booklist = new LinkedList<>();

        Book book1 = new Book(1, "Book1", "Me", "Me", 800);
        Book book2 = new Book(2, "Book2", "Me", "Me", 1000);

        booklist.add(book1);
        booklist.add(book2);

        //Iterator
        Iterator<Book> iterator = booklist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
