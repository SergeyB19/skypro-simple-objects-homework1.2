public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Alex ", "Alexandro ");

        Book book1 = new Book("книга", author1, 2022);

        System.out.println("Имя книги " +  book1.getBookName() + " Имя автора " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname() + "Год публикации " + book1.getPublishingYear());

        book1.setPublishingYear(2000);

        System.out.println("Имя книги " +  book1.getBookName() + " Имя автора " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname() + "Год публикации " + book1.getPublishingYear());

    }
}