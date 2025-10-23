import java.util.*;

public class Author {

    private final String name;
    private final Set<Title> titles;

    /**
     * @param name The name of the author
     */
    public Author(String name) {
        this.name = name = Objects.requireNonNull(name, "Name can not be null!");
        this.titles = new LinkedHashSet<Title>();
    }

    /**
     * This method adds a title to a given authors list of titles
     * @param title
     * @return title added to authors list og titles
     */
    public boolean addTitle(Title title) {
        Objects.requireNonNull(title, "Title can not be null!");
        return titles.add(title);
    }

    /**
     * This method is used to calculate the total pay an author receives.
     * @return total pay in DKK
     */
    public double calculateRoyalties() {
        double total = 0;
        for (Title title : titles) total += title.calculateRoyalty();
        return Math.round(total * 100.0)/100.0;
    }

    /**
     * The method retrieves the name of a given author.
     * @return name of author
     */
    public String getName() {
        return name;
    }

    public String toString() {
        return name + ": " + calculateRoyalties() + "kr";
    }
}