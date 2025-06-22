import java.util.Arrays;
import java.util.Comparator;

public class Library {
    Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    // Linear Search by Title
    public Book linearSearchByTitle(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    // Binary Search by Title (Assuming sorted array)
    public Book binarySearchByTitle(String title) {
        Arrays.sort(books, Comparator.comparing(b -> b.title.toLowerCase())); // sort alphabetically

        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            String midTitle = books[mid].title.toLowerCase();
            int compare = title.toLowerCase().compareTo(midTitle);

            if (compare == 0) {
                return books[mid];
            } else if (compare < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return null;
    }

    // Display all books
    public void listBooks() {
        System.out.println("\n-- Library Books --");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
