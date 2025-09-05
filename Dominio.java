package SistemaBiblioteca;
public class Dominio {
    public static void main(String[] args) {
        
        Book b1 = new Book("1934", "Olavo de Carvalho", 1934, "Suspense");
        

        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getPublicationYear());
        System.out.println(b1.getGenre());

        b1.borrow();
        b1.returnItem();

        Magazine m1 = new Magazine("Mad", "Madness", 2013, 27);

        m1.flipPages();

        System.out.println(m1.getTitle());
        System.out.println(m1.getAuthor());
        System.out.println(m1.getPublicationYear());
        System.out.println(m1.getIssueNumber());

        DigitalMedia d1 = new DigitalMedia("Vídeo do trabalho de inglês", "Enzo e Bernardo", 2017, "mp4");

        d1.play();

        System.out.println(d1.getTitle());
        System.out.println(d1.getAuthor());
        System.out.println(d1.getPublicationYear());
        System.out.println(d1.getFileFormat());
    }
}
