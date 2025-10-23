public class EBook extends NetTitle {

    private final long characters;
    private final boolean illustrated;

    /**
     * @param title This is the title of the book
     * @param literatureType enum LiteratureType (BI, TE, LYRIK, SKØN, FAG)
     * @param availability The number of libraries that has lent out a given title
     * @param reach The number of counties that lend out a given title
     * @param use The number of lend out titles at a given moment
     * @param characters The number of characters a given title contains
     * @param illustrated Whether a given title is illustrated or not
     */
    public EBook(String title, LiteratureType literatureType, int availability, int reach, int use, long characters, boolean illustrated) {
        super(title, literatureType, availability, reach, use);
        this.characters = characters;
        this.illustrated = illustrated;
    }

    /**
     * This method calculates the number of pseudopages by looking at the number of characters the title has, and if it is illustrated or not.
     * @return number of pages (pseudopages)
     */
    protected double pseudoPages() {
        if (illustrated) {
            return  (characters / 1800 + 20) * 1.1;
        } else {
            return characters / 1800 + 20;
        }
    }

    /**
     * This method takes an authors book-title and calculates the amount of points its worth.
     * The calculator takes the amount of pseudopages, reach, availability, use and points depending on the type of book it is.
     * @return points
     */
    @Override
    protected double calculatePoints() {
        double value = convertLiteratureType();
        return pseudoPages() * value * getUseFactor();
    }
}