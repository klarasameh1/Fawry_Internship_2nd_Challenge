public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(); //Declaring an Inventory

        //Adding Books to Inventory
        inventory.addBook(new PaperBook("ISBN1", "Clean Code", 2008, 200.0, 10));
        inventory.addBook(new EBook("ISBN2", "Java Fundamentals", 2012, 150.0, "pdf"));
        inventory.addBook(new DemoBook("ISBN3", "Rare Manuscript", 1800, 0.0));

        try {
            //Simulating Buying Books
            double amount = inventory.buyBook("ISBN1", 2, "user@example.com", "Cairo, Egypt");
            System.out.println("Paid: " + amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------------------------------------------------------------------");
        inventory.removeOutdatedBooks(2010);  //remove books that published before 2010
        //testing to buy "Clean Code" to make sure the pervious line worked
         try {
            double amount = inventory.buyBook("ISBN1", 2, "user@example.com", "Cairo, Egypt");
            System.out.println("Paid: " + amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
