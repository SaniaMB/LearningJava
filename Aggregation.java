import org.w3c.dom.ls.LSOutput;

public class Aggregation {
    public static void main(String[] args) {

//    Aggregation = Represents a "has-a" relationship between objects.
//                  One object contains another object as a part of its structure,
//                  but the contained object/s can exist independently.

        Book book = new Book("The fellow of the ring", 423);
        Book book1 = new Book("The two towers", 352);
        Book book2 = new Book("The Return of the king", 416);

        Book[] books = {book, book1, book2};

       Library library = new Library("SAN Public library" , 2025 , books);

       library.displayInfo();




    }
}
