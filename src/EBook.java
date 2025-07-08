public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, int year, double price, String fileType) {
        super(isbn, title, year, price);
        this.fileType = fileType;
    }

    @Override
    public boolean isForSale() { return true; }

    @Override
    public void deliver(String email) {
        System.out.println("Sending eBook to: " + email);
    }

    public String getFileType() { return fileType; }
}
