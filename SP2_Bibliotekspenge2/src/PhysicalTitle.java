public abstract class PhysicalTitle extends Title {

    protected final int copies;

    /**
     * @param title This is the title of the book
     * @param literatureType enum LiteratureType (BI, TE, LYRIK, SKØN, FAG)
     * @param copies Number of copies of books found in the libraries (has to be >= 0)
     */
    public PhysicalTitle(String title, LiteratureType literatureType, int copies) {
        super(title, literatureType);
        this.copies = copies;
    }

    /**
     * The method retrieves a given book-titles number of copies in the library
     * @return number of copies
     */
    public int getCopies() {
        return copies;
    }
}