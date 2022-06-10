public class Book {
    private final String authorName;
    private final int pageAmount;
    private String publisherName;

    private int publishingYear;

    public Book(String authorName, int pageAmount, String publisherName) {
        this.authorName = authorName;
        this.pageAmount = pageAmount;
        this.publisherName = publisherName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getPageAmount() {
        return pageAmount;
    }

    public String getPublisherName() {
        return getPublisherName();
    }

    public int getPublishingYear() {
        return getPublishingYear();
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear < 1950 || publishingYear > 2050) {
            System.out.println("Invalid publishing year parameter: " + publishingYear);
            return;
        }
    }
    public Book(String authorName, int pageAmount) {
        this(authorName, pageAmount, null);
    }

    Book Book = new Book("S.King", 100, "Book Publishing Ltd.");

}
