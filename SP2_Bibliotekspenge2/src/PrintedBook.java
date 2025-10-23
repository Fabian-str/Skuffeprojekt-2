public class PrintedBook extends PhysicalTitle {

    private final int pages;

    /**
     * @param title This is the title of the book
     * @param literatureType enum LiteratureType (BI, TE, LYRIK, SKØN, FAG)
     * @param copies Number of copies of books found in the libraries (has to be >= 0)
     * @param pages Number of pages in the given book (has to be >= 1)
     */
    public PrintedBook(String title, LiteratureType literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    /**
     * This method takes an authors book-title and calculates the amount of points its worth.
     * The calculator takes the amount of pages, copies and points depending on the type of book it is.
     * @return points
     */
    @Override
    protected double calculatePoints() {
        double value = convertLiteratureType();
        return pages * value * copies;
    }
}