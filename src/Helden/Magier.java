package Helden;
import Ausruestung.Ausruestbar;
import Held.*;

public class Magier extends Held implements Kampfbereit {
    private static final Ausruestung.Ausruestbar Ausruestbar = null;

    public Magier(String name, int level) {
        super(name, level, Heldenklasse.MAGIER);
    }
    @Override
    public void angreifen() {
        System.out.println(getName() + " wirkt einen Zauberspruch!");
    }
    @Override
    public void spezialFaehigkeitEinsatz() {
        System.out.println(getName() + " spührt die Kraft. Erhöhte Intelligenz!");
    }
    @Override
    public String beschreibung() {
        return "Helden.Magier " + getName() + ", Stufe " + getLevel() + ", eine Macht die überirdisch ist!";
    }
    public String getName() {
        return super.getName();
    }
    public int getLevel() {
        return super.getLevel();
    }
}
