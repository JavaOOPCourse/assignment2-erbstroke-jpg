public class Library {

    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // TODO: Add book to array
    public void addBook(Book book) {
        for (int i = 0; i<this.books.length;i++){
            if (this.books[i]==null){
                this.books[i] = book;
                break;
            }
        }
    }

    // TODO: Display all books
    public void displayBooks() {
        for (int i = 0; i < this.books.length;i++){
            if (books[i]!=null){System.out.println(books[i].toString());}
        }
    }

    // TODO: Search book by title
    public Book searchByTitle(String title) {
        for (int i = 0; i<this.books.length;i++){
            if (this.books[i].getTitle().equals(title)){
                return this.books[i];
            }
        }
        return null;
    }

    // TODO: Borrow book by title
    public void borrowBook(String title) {
        for (int i = 0; i<this.books.length;i++){
            if (this.books[i].getTitle().equals(title)){
                this.books[i].borrowBook();
            }
        }
    }

    // TODO: Return book by title
    public void returnBook(String title) {
        for (int i = 0; i<this.books.length;i++){
            if (this.books[i].getTitle().equals(title)){
                this.books[i].returnBook();
            }
        }
    }
}
