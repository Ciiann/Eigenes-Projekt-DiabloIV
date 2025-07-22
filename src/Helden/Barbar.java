package Helden;
import Held.*;

public class Barbar extends Held implements Kampfbereit {
    private static final Ausruestung.Ausruestbar Ausruestbar = null;

    public Barbar(String name, int level) {
        super(name, level, Heldenklasse.BARBAR);
    }
    @Override
    public void angreifen() {
        System.out.println(getName() + " wirbelt mit seiner Axt!");
    }
    @Override
    public void spezialFaehigkeitEinsatz() {
        System.out.println(getName() + " wird rasend vor Wut. Angriffskraft erhöht!");
    }
    @Override
    public String beschreibung() {
        return "Barbar Name: " + getName() + ", Stufe: " + getLevel() + " ein Muskelprotz!";
    }
    public String getName() {
        return super.getName();
    }
    public int getLevel() {
        return super.getLevel();
    }
}
