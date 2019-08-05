package Library;
public class V2 {
    String bookName;
    String bookAuthor;
    String bookGenre;

    public V2(String bookName, String bookAuthor, String bookGenre) {
        System.out.println("Название:" + bookName + "Автор:" + bookAuthor + "Жанр:" + bookGenre);
    }
    public static void main(String[] args) {
        V2 myBook = new V2("Сияние ", "C. Кинг ", "Ужасы ");
        System.out.println(myBook);
        V2 myBook_2 = new V2("Сияние2 ", "C. Кинг2 ", "Ужасы2 ");
        System.out.println(myBook_2);
    }
}
