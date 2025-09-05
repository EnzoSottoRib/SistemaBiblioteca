package SistemaBiblioteca;
public class DigitalMedia extends LibraryItem {

    private String fileFormat;

    public DigitalMedia(String title, String author, int publicationYear, String fileFormat){
        this.setTitle(title);
        this.setAuthor(author);
        this.setPublicationYear(publicationYear);
        this.fileFormat = fileFormat;
    }

    public void play(){
        System.out.println("Tocando...");
    }


    public String getFileFormat() {
        return fileFormat;
    }



    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

}
