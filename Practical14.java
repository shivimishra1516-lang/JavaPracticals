class LibraryBox {

    int id;
    String title;
    private boolean available = true;

    LibraryBox(int id, String title) {
        this.id = id;
        this.title = title;
    }

    void borrow() {

        if (available) {
            available = false;
            System.out.println(title + " borrowed");
        } else {
            System.out.println(title + " is not available");
        }
    }

    void returnItem() {

        if (!available) {
            available = true;
            System.out.println(title + " returned");
        } else {
            System.out.println(title + " was not borrowed");
        }
    }

    boolean isAvailable() {
        return available;
    }
}

class BookBox extends LibraryBox {

    BookBox(int id, String title) {
        super(id, title);
    }
}

class MagazineBox extends LibraryBox {

    MagazineBox(int id, String title) {
        super(id, title);
    }
}

class NewspaperBox extends LibraryBox {

    NewspaperBox(int id, String title) {
        super(id, title);
    }
}

public class Practical14 {

    public static void main(String[] args) {

        BookBox book = new BookBox(1, "Java Book");

        System.out.println("Available: " + book.isAvailable());

        book.borrow();

        System.out.println("Available: " + book.isAvailable());

        book.borrow();

        book.returnItem();

        System.out.println("Available: " + book.isAvailable());
    }
}