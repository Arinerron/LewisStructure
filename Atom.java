import java.util.List;
import java.util.ArrayList;

public class Atom {
    private Element element = null;
    private List<Bond> bonds = new ArrayList<>();

    public Atom(Element element) {
        this.element = element;
    }

    public Element getElement() {
        return this.element;
    }

    public List<Bond> getBonds() {
        return this.bonds;
    }

    public int getElectrons() {
        return this.getElement().getElectrons();
    }

    public int getValence() {
        return this.getElement().getValence();
    }

    public int getNonValence() {
        return this.getElement().getNonValence();
    }

    public int getBondingElectrons() {
        int total = 0;

        for(Bond bond : this.getBonds())
            total += bond.getElectrons();

        return total;
    }

    public int getNonBondingElectrons() {
        return this.getValence() - this.getBondingElectrons();
    }

    public boolean isBonded() {
        return this.getBonds().size() != 0;
    }

    public boolean isStableOctet() {
        return this.getValence() + this.getBondingElectrons() == 8;
    }

    public boolean bond(Atom atom, int type) {
        return Bond.bond(this, atom, type);
    }
}
