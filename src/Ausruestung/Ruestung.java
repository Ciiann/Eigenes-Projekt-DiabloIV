package Ausruestung;
import Ausruestung.*;
import Held.Held;
import Helden.*;

public class Ruestung extends Gegenstand implements Ausruestbar{
    private int ruestungswert;

    public Ruestung(String name, int levelanforderung, Seltenheit seltenheit, int ruestungswert) {
        super(name, levelanforderung, seltenheit);
        this.ruestungswert = ruestungswert;
    }

    @Override public void ausruesten() {
        System.out.println(name + " wurde als Rüstung angelegt.");
    }

    @Override public int machtwert() {
        return 0;
    }

    @Override public void benutzen() {
        System.out.println(name + " schützt mit " + ruestungswert + " Rustungswert.");
    }
    @Override
    public String info() {
        return super.info() + "\nTyp: Rüstung\nRüstungswert: " + ruestungswert;
    }
}
