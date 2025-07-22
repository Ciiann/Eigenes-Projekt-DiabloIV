package Helden;
import Ausruestung.Ausruestbar;
import Held.*;

public class Totenbeschwoerer extends Held implements Kampfbereit {
    private static final Ausruestung.Ausruestbar Ausruestbar = null;

    public Totenbeschwoerer(String name, int level) {
        super(name, level, Heldenklasse.TOTENBESCHWOERER);
    }
    @Override
    public void angreifen() {
        System.out.println(getName() + " beschwört die Totenarmee!");
    }
    @Override
    public void spezialFaehigkeitEinsatz() {
        System.out.println(getName() + " tötet die Armee. Intelligenz steigt!");
    }
    @Override
    public String beschreibung() {
        return "Totenbeschwörer " + getName() + ", Stufe " + getLevel() + " Macht der Unterwelt!";
    }
    public String getName() {
        return super.getName();
    }
    public int getLevel() {
        return super.getLevel();
    }
}
