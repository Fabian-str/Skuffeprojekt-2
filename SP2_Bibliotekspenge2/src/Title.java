import java.util.Objects;

public abstract class Title {

    protected final String title;
    protected final LiteratureType literatureType;
    public final double RATE = 0.067574;

    /**
     * @param title This is the title of the book
     * @param literatureType enum LiteratureType (BI, TE, LYRIK, SKØN, FAG)
     */
    public Title(String title, LiteratureType literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    /**
     * This method calculates royalties by multiplying a titles points with the rate from 2025.
     * @return points
     */
    public double calculateRoyalty() {
        return calculatePoints() *  RATE;
    }

    /**
     * This method converts the enum LiteratureType into the titles type-value. <p>
     * BI = Billedbøger (for børn) <p>
     * TE = Tegneserier <p>
     * LYRIK = Lyriksamlinger <p>
     * SKØN = Skønlitterære bøger <p>
     * FAG = Fagbøger
     * @return returns the given types value
     */
    protected double convertLiteratureType() {
        return switch (literatureType) {
            case BI, TE -> 3;
            case LYRIK -> 6;
            case SKØN -> 1.7;
            case FAG -> 1;
            default -> throw new IllegalArgumentException("Invalid literature type: " + literatureType);
        };
    }

    /**
     * This method compares this object to another to determine logical equality <p>
     * Used to check whether two objects represent the same entity (This method prevents duplicates)
     * @param object The reference object with which to compare
     * @return true if the objects are considered equal. Otherwise returns false
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Title other = (Title) object;
        return Objects.equals(title, other.title) && literatureType == other.literatureType;
    }

    /**
     * Returns a hash code value for this object <p>
     * The hash code is consistent with {@link #equals(Object)},
     * meaning that equal objects produce the same hash code <p>
     * @return an integer hash code value for this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(getClass(), title, literatureType);
    }

    /**
     * This abstract method is meant to be overwritten by sub-classes.
     * @return Returns nothing
     */
    protected abstract double calculatePoints();
}