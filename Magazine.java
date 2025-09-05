package SistemaBiblioteca;
public class Magazine extends LibraryItem {

    private int issueNumber;

    public Magazine(String title, String author, int publicationYear, int issueNumber){
        this.setTitle(title);
        this.setAuthor(author);
        this.setPublicationYear(publicationYear);
        this.issueNumber = issueNumber;
    }

    public void flipPages(){
        System.out.println("Propaganda, propaganda, propaganda...");
    }


    public int getIssueNumber() {
        return issueNumber;
    }


    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

}
