public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Максим Горький");
        Author secondAuthor = new Author();
        secondAuthor.setAuthorFullName("Виктор Пелевин");

        Book firstBook = new Book("На дне", firstAuthor.getAuthorFullName(), 1902);
        firstBook.printInfo();

        Book secondBook = new Book("Generation «П»", secondAuthor.getAuthorFullName());
        secondBook.printInfo();
        secondBook.setYearPublication(1999);
        secondBook.printInfo();
    }
}