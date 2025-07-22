package Ausruestung;

public abstract class Gegenstand {
    protected String name;
    protected int levelanforderung;
    protected Seltenheit seltenheit;

    public enum Seltenheit {
        GEWOEHNLICH,
        SELTEN,
        LEGENDEAR,
        EPISCH,
        MYSTISCH,
    }

    public abstract void benutzen();

    public Gegenstand(String name, int levelanforderung, Seltenheit seltenheit) {
        this.name = name;
        this.levelanforderung = levelanforderung;
        this.seltenheit = seltenheit;
    }


    public String info() {
        return "Name: " + name + " Levelanforderung: " + levelanforderung + " Seltenheit: " + seltenheit;
    }

    public String getName() {
        return name;
    }

    public int getLevelanforderung() {
        return levelanforderung;
    }

    public Seltenheit getSeltenheit() {
        return seltenheit;
    }


}
