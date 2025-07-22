package Helden;
import Ausruestung.Ausruestbar;
import Held.*;

public class Druide extends Held implements Kampfbereit {
    private static final Ausruestung.Ausruestbar Ausruestbar = null;

    public Druide(String name, int level) {
        super(name, level, Heldenklasse.DRUIDE);
    }
    @Override
    public void angreifen() {
        System.out.println(getName() + " geht in Bärform");
    }
    @Override
    public void spezialFaehigkeitEinsatz() {
        System.out.println(getName() + " ruft die Natur. Angriffskraft erhöht!");
    }
    @Override
    public String beschreibung() {
        return "Helden.Druide " + getName() + ", Stufe " + getLevel() + " ein Muskelprotz!";
    }
    public String getName() {
        return super.getName();
    }
    public int getLevel() {
        return super.getLevel();
    }
}
