public class Bond {
    public static int SINGLE = 2, DOUBLE = 4, TRIPLE = 6;

    private Atom atom1 = null;
    private Atom atom2 = null;
    private int electrons = SINGLE;

    public Bond(Atom atom1, Atom atom2, int type) {
        this.atom1 = atom1;
        this.atom2 = atom2;
    }

    public Atom getAtom1() {
        return this.atom1;
    }

    public Atom getAtom2() {
        return this.atom2;
    }

    public int getElectrons() {
        return this.electrons;
    }

    public static boolean bond(Atom atom1, Atom atom2, int type) {
        for(Bond bond : atom1.getBonds())
            if(bond.getAtom1() == atom2 || bond.getAtom2() == atom2)
                return false; // bond already exists
        for(Bond bond : atom2.getBonds())
            if(bond.getAtom1() == atom1 || bond.getAtom2() == atom1)
                return false; // bond already exists

        Bond bond = new Bond(atom1, atom2, type);

        atom1.getBonds().add(bond);
        atom2.getBonds().add(bond);

        return true;
    }
}
