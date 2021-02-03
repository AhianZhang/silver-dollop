package pattern;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-09-11 10:20
 **/
public class OCP {


}

interface IBook {
    String getName();

    int getPrice();

    String getAuthor();
}

class NovelBook implements IBook {

    private String bookName;
    private int price;
    private String author;

    public NovelBook(String bookName, int price, String author) {
        this.bookName = bookName;
        this.price = price;
        this.author = author;
    }

    @Override
    public String getName() {
        return this.bookName;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        return "NovelBook{" +
                "bookName='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", author='" + getAuthor() + '\'' +
                '}';
    }
}

class OffValueNovelBook extends NovelBook {

    OffValueNovelBook(String bookName, int price, String author) {

        super(bookName, price, author);
    }

    @Override
    public int getPrice() {
        int orignPrice = super.getPrice();

        return orignPrice * 90 / 100;
    }
}

class BookStore {
    private final static ArrayList<IBook> bookList = new ArrayList<>();

    static {
       /* bookList.add(new NovelBook("领域驱动设计",100,"Eric Evans"));
        bookList.add(new NovelBook("实现领域驱动设计",100,"Vaughn Vernon"));
        bookList.add(new NovelBook("领域驱动设计精简版",50,"Eric Evans"));*/
        bookList.add(new OffValueNovelBook("领域驱动设计", 100, "Eric Evans"));
        bookList.add(new OffValueNovelBook("实现领域驱动设计", 100, "Vaughn Vernon"));
        bookList.add(new OffValueNovelBook("领域驱动设计精简版", 50, "Eric Evans"));

    }


    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        format.setMaximumFractionDigits(2);


        bookList.forEach(System.out::println);
    }
}
