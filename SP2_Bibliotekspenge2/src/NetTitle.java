public abstract class NetTitle extends Title {

    protected final int availability;
    protected final int reach;
    protected final int use;

    /**
     * @param title This is the title of the book
     * @param literatureType enum LiteratureType (BI, TE, LYRIK, SKØN, FAG)
     * @param availability The number of libraries that has lent out a given title
     * @param reach The number of counties that lend out a given title
     * @param use The number of lend out titles at a given moment
     */
    public NetTitle(String title, LiteratureType literatureType, int availability, int reach, int use) {
        super(title, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }

    protected double getUseFactor() {
        return (reach * 5) + (availability * 0.5) + use;
    }
}
