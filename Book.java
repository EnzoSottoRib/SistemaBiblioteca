package SistemaBiblioteca;
public class Book extends LibraryItem {

    private String genre;


    public Book(String title, String author, int publicationYear, String genre){
        this.setTitle(title);
        this.setAuthor(author);
        this.setPublicationYear(publicationYear);
        this.genre = genre;
    }
    

    public String getGenre() {
        return genre;
    }



    public void setGenre(String genre) {
        this.genre = genre;
    }


    public void readSample(){
        System.out.println("Lorem ipsum dolor sit amet...");
    }


}
