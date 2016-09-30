package ibm_java_basis;

/**
 * Created by a.shipulin on 30.09.16.
 */
public class Card

{
    private String name;

    public Card() {
        name = "unknown";
    }

    public Card(String name1) {
        name = name1;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return getName();
    }
}

