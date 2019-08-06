package Library;

public class Library {

    public static void main(String[] args) {
        Book book_1 = new Book("King", "Horror", "Shining");
        System.out.println(book_1.author + book_1.genre + book_1.name);
    }
}
