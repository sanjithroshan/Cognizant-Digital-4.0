public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Clean Code", "Robert C. Martin"),
            new Book(2, "Effective Java", "Joshua Bloch"),
            new Book(3, "The Pragmatic Programmer", "Andy Hunt"),
            new Book(4, "Java Concurrency in Practice", "Brian Goetz"),
            new Book(5, "Head First Java", "Kathy Sierra")
        };

        Library library = new Library(books);

        library.listBooks();

        System.out.println("\n Linear Search for 'Effective Java':");
        Book linearResult = library.linearSearchByTitle("Effective Java");
        System.out.println(linearResult != null ? linearResult : "Book not found");

        System.out.println("\n Binary Search for 'Effective Java':");
        Book binaryResult = library.binarySearchByTitle("Effective Java");
        System.out.println(binaryResult != null ? binaryResult : "Book not found");
    }
}
