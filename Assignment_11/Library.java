import java.util.*;

enum Category {
    Math, BioLogy, Chem, Phy, Eng
}

class Book {
    String isbn;
    Category category;
    double price;
    String publishDate;
    String authorName;
    int quantity;

    public Book(String isbn, Category category, double price, String publishDate, String authorName, int quantity) {
        this.isbn = isbn;
        this.category = category;
        this.price = price;
        this.publishDate = publishDate;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn='" + isbn + '\'' + ", category=" + category + ", price=" + price + ", publishDate='" + publishDate + '\'' + ", authorName='" + authorName + '\'' + ", quantity=" + quantity + '}';
    }
}

public class Library {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();

        books.add(new Book("123", Category.Math, 19.99, "01/01/2020", "Steve", 3));
        books.add(new Book("987", Category.BioLogy, 29.99, "01/02/2021", "Jane", 5));
        books.add(new Book("456", Category.Chem, 14.99, "01/03/2022", "Smith", 10));
        books.add(new Book("789", Category.Phy, 39.99, "01/04/2023", "Johnson", 8));
        books.add(new Book("321", Category.Eng, 24.99, "01/05/2024", "Jobs", 7));

        Iterator<Book> iterator = books.iterator();
        System.out.println("Library books:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Set<Book> books1 = new LinkedHashSet<>();
        Set<Book> sortedBooks = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.publishDate.compareTo(o2.publishDate);
            }
        });
        sortedBooks.addAll(books);

        System.out.println("Sorted books by publish date:");
        for (Book book : sortedBooks) {
            System.out.println(book);
        }
    }
}




