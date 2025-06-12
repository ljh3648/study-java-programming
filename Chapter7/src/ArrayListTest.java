import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<Book> library = new ArrayList<Book>();

        library.add(new Book("태백산맥", "조정래"));
        library.add(new Book("데미안", "헤르만 허세"));
        library.add(new Book("어린왕자", "이지훈"));

        for (int i = 0; i < library.size(); i++){
            Book book = library.get(i);
            book.showBookInfo();
        }

        System.out.println();
        for(Book book: library){
            book.showBookInfo();
        }
    }
}