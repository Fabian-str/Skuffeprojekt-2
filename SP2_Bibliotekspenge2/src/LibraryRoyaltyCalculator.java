public class LibraryRoyaltyCalculator {

    public static void main(String[] args) {

        Author JRRTolkien = new Author("J. R. R. Tolkien");

        Title book1 = new PrintedBook("The Hobbit", LiteratureType.SKØN, 102, 333);
        Title book2 = new AudioBook("The Lord of the Rings: The Fellowship of the Ring", LiteratureType.SKØN, 3, 1500);
        Title book3 = new EBook("The Lord of the Rings: The Two Towers", LiteratureType.SKØN, 10, 10, 10, 1015000, false);
        Title book4 = new EAudioBook("The Silmarillion", LiteratureType.SKØN, 10, 10, 10, 859);

        JRRTolkien.addTitle(book1);
        JRRTolkien.addTitle(book2);
        JRRTolkien.addTitle(book3);
        JRRTolkien.addTitle(book4);

        System.out.println(JRRTolkien);
    }
}