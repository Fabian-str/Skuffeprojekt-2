public class AudioBook extends PhysicalTitle {

    private final int durationInMinutes;

    /**
     * @param title This is the title of the book
     * @param literatureType enum LiteratureType (BI, TE, LYRIK, SKØN, FAG)
     * @param copies Number of copies of books found in the libraries (has to be >= 0)
     * @param durationInMinutes amount of minutes the audio-file is (has to be >= 1)
     */
    public  AudioBook(String title, LiteratureType literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    /**
     * This method takes an authors book-title and calculates the amount of points its worth. <p>
     * The calculator takes the duration in minutes, copies and points depending on the type of book it is.
     * @return points
     */
    @Override
    protected double calculatePoints() {
        double value = convertLiteratureType();
        return (durationInMinutes * 0.5) * value * copies;
    }
}