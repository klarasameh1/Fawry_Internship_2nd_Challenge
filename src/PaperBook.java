public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, int year, double price, int stock) {
        super(isbn, title, year, price);
        this.stock = stock;
    }

    @Override
    public boolean isForSale() { return stock > 0; }

    @Override
    public void deliver(String address) {
        System.out.println("Shipping paper book to: " + address);
        // Simulate ShippingService
    }

    public boolean reduceStock(int qty) {
        if (stock >= qty) {
            stock -= qty;
            return true;
        }
        return false;
    }

    public int getstock() { return stock; }
}
