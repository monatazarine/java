//Aggregation = Represents a "has-a" relationship between objects.
// It is a specialized form of association where the child can exist independently of the parent.
public class Main{
    public static  void main(String[] args) {
      Book book1 = new Book("Crime and Punishment", "Fyodor Dostoevsky", 430);  


      Book book2 = new Book("Metamorphosis", "Franz Kafka", 201);       


      Book book3 = new Book("1984", "George Orwell", 328);

      Book[] books = {book1, book2, book3}; 

      Library library = new Library("City Library", 1995, books);

      library.displayLibraryInfo();

    }
}
