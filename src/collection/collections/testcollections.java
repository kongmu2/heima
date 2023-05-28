package collection.collections;

import collection.set.treeset.Book;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class testcollections {
    @Test
    public void test(){
        ArrayList<Book> list = new ArrayList<>();
        Book book = new Book("java", 45);
        Book book1=new Book("三国演义",90);
        Book book2=new Book("水浒传",60);
        list.add(book);
        list.add(book1);
        list.add(book2);
        for (Book book3 : list) {
            System.out.println(book3);
        }

        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Double.compare(o2.getPrice(),o1.getPrice());
            }
        });
        for (Book book3 : list) {
            System.out.println(book3);
        }
    }
}
