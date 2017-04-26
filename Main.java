public class Main {
    public static void main(String[] args) {
        new Element(1, "H", "Hydrogen", 1, 1);
        new Element(2, "He", "Helium", 2, 2);
        new Element(3, "Li", "Hydrogen", 3, 1);
        new Element(6, "Lo", "Looy", 6, 4);

        Atom one = new Atom(Element.getElement("Lo"));
        Atom two = new Atom(Element.getElement("Lo"));
        Bond.bond(one, two, Bond.TRIPLE);

        System.out.println("valence e-: " + two.getValence() + " & nonbonding:" + two.getNonBondingElectrons() + " & bonding:" + two.getBondingElectrons());
    }
}
