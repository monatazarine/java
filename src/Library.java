public class Library {
             String name;
             int yearEstablished;
             Book[] books;

             Library(String name, int yearEstablished, Book[] books) {
                 this.name = name;
                 this.yearEstablished = yearEstablished;
                 this.books = books;
             }
             void displayLibraryInfo() {
                 System.out.println("The " + this.name + " established in " + this.yearEstablished + " has the following books:");

                 for (Book book : books) {
                     System.out.println("- " + book.displayInfo());
                 }
             }


}
