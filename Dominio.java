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

    }
}
