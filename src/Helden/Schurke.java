package Helden;
import Ausruestung.Ausruestbar;
import Held.*;

public class Schurke extends Held implements Kampfbereit {
    private static final Ausruestung.Ausruestbar Ausruestbar = null;

    public Schurke(String name, int level) {
        super(name, level, Heldenklasse.SCHURKE);
    }
    @Override
    public void angreifen() {
        System.out.println(getName() + " legt seine Todesfalle");
    }
    @Override
    public void spezialFaehigkeitEinsatz() {
        System.out.println(getName() + " geht in verstecken. Angriffskraft erhöht!");
    }
    @Override
    public String beschreibung() {
        return "Helden.Schurke " + getName() + ", Stufe " + getLevel() + " Meister der Schatten!";
    }
    public String getName() {
        return super.getName();
    }
    public int getLevel() {
        return super.getLevel();
    }
}
