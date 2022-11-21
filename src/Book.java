import java.util.Arrays;

public class Book{

    //region Variables
    private String bookName;
    private Integer yearPublication;
    private final Author author = new Author();
    //endregion

    //region Constructors
    Book(String bookName, String authorFullName) {
        try {
            this.author.setAuthorFullName(authorFullName);
            this.bookName = bookName;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    Book(String bookName, String authorFullName, Integer yearPublication) {
        try {
            author.setAuthorFullName(authorFullName);
            this.bookName = bookName;
            this.yearPublication = yearPublication;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    //endregion

    //region print
    public void printInfo(){
        System.out.println("------Информация------");
        System.out.println("Название книги: " + getBookName() +
                "\nАвтор книги: " + author.getAuthorFullName() +
                "\nГод книги: " + getYearPublication());
        System.out.println("----------------------");
    }
    //endregion

    //region bookName
    public void setBookName(String bookName) {this.bookName = bookName;}
    public String getBookName() {return this.bookName;}
    //endregion

    //region yearPublication
    public void setYearPublication(int yearPublication) {this.yearPublication = yearPublication;}
    public Integer getYearPublication() {return this.yearPublication;}
    //endregion

    //region change Author Full Name
    public void setAuthorFullName(String author) {this.author.setAuthorFullName(author);}
    public String getAuthorFullName() {return this.author.getAuthorFullName();}
    //endregion

    //region change Author First Name
    public void setAuthorFirstName(String author) {this.author.setAuthorFirstName(author);}
    public String getAuthorFirstName() {return this.author.getAuthorFullName();}
    //endregion

    //region change Author Second Name
    public void setAuthorSecondName(String author) {this.author.setAuthorSecondName(author);}
    public String getAuthorSecondName() {return this.author.getAuthorSecondName();}
    //endregion
}
