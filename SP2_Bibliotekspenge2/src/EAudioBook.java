public class EAudioBook extends NetTitle {

    private final int durationInMinutes;

    /**
     * @param title This is the title of the book
     * @param literatureType enum LiteratureType (BI, TE, LYRIK, SKØN, FAG)
     * @param availability The number of libraries that has lent out a given title
     * @param reach The number of counties that lend out a given title
     * @param use The number of counties that lend out a given title
     * @param durationInMinutes Amount of minutes the audio-file is (has to be >= 1)
     */
    public EAudioBook(String title, LiteratureType literatureType, int availability, int reach, int use, int durationInMinutes) {
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    /**
     * This method takes an authors book-title and calculates the amount of points its worth.
     * The calculator takaes the duration in minutes, reach, availability, use and points depending on the type of book it is.
     * @return points
     */
    @Override
    protected double calculatePoints() {
        double value = convertLiteratureType();
        return (durationInMinutes / 2) * value * getUseFactor();
    }
}