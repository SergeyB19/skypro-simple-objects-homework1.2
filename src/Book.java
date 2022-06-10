public class Book {
    int publicationYear = 1900;
    public Book(String firstName, String middleName, int publicationYear ) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.publicationYear = publicationYear;

        Book Book = new Book("Steven", "King", 1900);
    }
}
