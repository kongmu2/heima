package collection.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class testBook {
    public static void main(String[] args) {
        TreeSet<Book> treeSet = new TreeSet<>();
        Book book = new Book("java", 45);
        Book book1=new Book("三国演义",90);
        Book book2=new Book("水浒传",60);
        treeSet.add(book);
        treeSet.add(book1);
        treeSet.add(book2);
        System.out.println(treeSet);

        //外部比较器 内外部比较器同时存在先走外部比较器
        TreeSet<Book> books = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Double.compare(o2.getPrice(), o1.getPrice());
            }
        });
        books.add(book);
        books.add(book1);
        books.add(book2);
        System.out.println(books);
    }
}
