package SistemaBiblioteca;
public class LibraryItem implements Borrowable{

    private String title;
    private String author;
    private int publicationYear;

    public void borrow(){

    }

    public void returnItem(){

    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public int getPublicationYear() {
        return publicationYear;
    }


    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    

}
