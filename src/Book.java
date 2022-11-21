import java.util.Arrays;

public class Book extends Author {

    //region Variables
    private String bookName;
    private Integer yearPublication;
    //endregion

    //region Constructors
    Book(String bookName, String authorFullName) {
        super(authorFullName);
        try {
            this.bookName = bookName;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    Book(String bookName, String authorFullName, Integer yearPublication) {
        super(authorFullName);
        try {
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
                "\nАвтор книги: " + getAuthorFullName() +
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
}
