import java.util.*;

public class Inventory {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public void removeOutdatedBooks(int cutoffYear) {
        books.values().removeIf(book -> book.getPublicationYear() < cutoffYear);
    }

    public double buyBook(String isbn, int qty, String email, String address) throws Exception {
        Book book = books.get(isbn);
        if (book == null || !book.isForSale())
            throw new Exception("Book not available for sale.");

        if (book instanceof PaperBook) {
            PaperBook pb = (PaperBook) book;
            if (!pb.reduceStock(qty))
                throw new Exception("Not enough stock.");
            pb.deliver(address);
        } else if (book instanceof EBook) {
            book.deliver(email);
        }

        return book.getPrice() * qty;
    }
}
