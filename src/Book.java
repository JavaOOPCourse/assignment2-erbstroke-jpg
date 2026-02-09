public class Book {

    // TODO: make fields private
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    // TODO: Implement parameterized constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // TODO: Implement copy constructor
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.year = other.year;
    }

    // TODO: Implement getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // TODO: Implement borrow logic
    public void borrowBook() {
        if (isAvailable){
            isAvailable = false;
            System.out.println("The book has been borrowed");
        }
        else {
            System.out.println("Sorry, the book isn't available");
        }
    }

    // TODO: Implement return logic
    public void returnBook() {
        if (!isAvailable){
            isAvailable = true;
            System.out.println("The book has been returned");
        }
        else {
            System.out.println("The book is already returned, please, get sure that you're giving true name of the book");
        }
    }

    // TODO: Override toString()
    @Override
    public String toString() {
        return "Title: " + getTitle() + ", Author: " + getAuthor() + ", Year: " + getYear() + ", Available: " + isAvailable();
    }

    // TODO: Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Book other = (Book) obj;
        return author.equals(other.author) && title.equals(other.title) && year == other.year;
    }

}
