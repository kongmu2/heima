package collection.arrays;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class testarrays {
    @Test
    public void test(){
        Book[]  books = new Book[]{
                new Book("java", 45),
                new Book("三国演义",90),
                new Book("水浒传",60),
        };
        for (Book book : books) {
            System.out.println(book);
        }

        Arrays.sort(books);

        for (Book book : books) {
            System.out.println(book);
        }

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Double.compare(o2.getPrice(),o1.getPrice());
            }
        });


    }
}
