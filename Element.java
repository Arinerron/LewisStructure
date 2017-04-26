import java.util.ArrayList;
import java.util.List;

public class Element {
    private static List<Element> elements = new ArrayList<>();

    private int number = 1;
    private String symbol = "H";
    private String name = "Hydrogen";
    private int electrons = 1;
    private int valence = 1;

    public Element(int number, String symbol, String name, int electrons, int valence) {
        this.number = number;
        this.symbol = symbol;
        this.name = name;
        this.electrons = electrons;
        this.valence = valence;

        this.getElements().add(this);
    }

    public static List<Element> getElements() {
        return elements;
    }

    public static Element getElement(String symbol) {
        for(Element element : getElements())
            if(element.getSymbol().equals(symbol))
                return element;
        return null;
    }

    public static Element getElement(int number) {
        for(Element element : getElements())
            if(element.getAtomicNumber() == number)
                return element;
        return null;
    }

    public int getAtomicNumber() {
        return this.number;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public String getName() {
        return this.name;
    }

    public int getElectrons() {
        return this.electrons;
    }

    public int getValence() {
        return this.valence;
    }

    public int getNonValence()  {
        return this.getElectrons() - this.getValence();
    }
}
