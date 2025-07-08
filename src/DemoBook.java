public class DemoBook extends Book {
    public DemoBook(String isbn, String title, int year, double price) {
        super(isbn, title, year, price);
    }

    @Override
    public boolean isForSale() { return false; }

    @Override
    public void deliver(String contact) {
        System.out.println("Showcase/Demo book is not for sale.");
    }
}
