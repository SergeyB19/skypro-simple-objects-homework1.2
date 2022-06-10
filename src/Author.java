public class Author {
    String firstName = "Steven";
    String middleName = "King";

    public Author(String firstName, String middleName) {
        this.firstName = firstName;
        this.middleName = middleName;
    }

    Author Author = new Author("Steven", "King");

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }
}



