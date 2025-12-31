package LW_05.Q1;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book(
                "Seena Maragatham",
                "Sujatha Thilaka",
                "9789553023975",
                true
        );

        Book b2 = new Book(
                "Nuramakadya Bauthika Nuladanayakshanamaala",
                "Seynamasasekaka",
                "9789553548721",
                true
        );

        Book b3 = new Book(
                "Island of a Thousand Mirrors",
                "Nayomi Munaweera",
                "9781616953623",
                true
        );

        Library library = new Library();

        library.addLibraryItem(b1);
        library.addLibraryItem(b2);
        library.addLibraryItem(b3);

        library.displayLibraryInfo();
        library.listAvailableItems();

        library.checkoutItem("Island of a Thousand Mirrors");

        library.listAvailableItems();
    }
}

