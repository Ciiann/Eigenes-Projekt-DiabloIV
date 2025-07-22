package Ausruestung;
import Held.Held;

public class Waffe extends Gegenstand implements Ausruestbar{
    private int schaden;

    public Waffe(String name, int levelanforderung, Seltenheit seltenheit, int schaden) {
        super(name, levelanforderung, seltenheit);
        this.schaden = schaden;
    }


    @Override
    public void benutzen() {
        System.out.println(name + " verursacht " + schaden + " Schaden.");
    }
    @Override
    public void ausruesten() {
        System.out.println(name + " wurde als Waffe ausgerüstet.");
    }

    @Override public int machtwert() {
        return 0;
    }

    @Override
    public String info() {
        return super.info() + " Typ: Ausruestung.Waffe\nSchaden: " +schaden;
    }

}
