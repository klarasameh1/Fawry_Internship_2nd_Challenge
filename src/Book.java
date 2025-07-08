public abstract class Book {
    protected String isbn;
    protected String title;
    protected int publicationYear;
    protected double price;

    public Book(String isbn, String title, int year, double price) {
        this.isbn = isbn;
        this.title = title;
        this.publicationYear = year;
        this.price = price;
    }

    public String getIsbn() { return isbn; }
    public int getPublicationYear() { return publicationYear; }
    public double getPrice() { return price; }

    public abstract boolean isForSale();
    public abstract void deliver(String contact); //Either by address or email
}
