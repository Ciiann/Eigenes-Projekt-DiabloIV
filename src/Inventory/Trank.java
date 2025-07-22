package Inventory;

public class Trank extends Inventar implements Usable{
    String typVonTrank;
    int heilungLebenspunkte;
    int levelanforderung;

    public Trank(String typVonTrank, int levelanforderung, int heilungLebenspunkte) {
        super(Items.TRANK);
        this.typVonTrank = typVonTrank;
        this.heilungLebenspunkte = heilungLebenspunkte;
        this.levelanforderung = levelanforderung;
    }

    public String info() {
        return "Der Trank ist ein: " + typVonTrank + " und ist ab Stufe: " + levelanforderung;
    }

    public String getTypVonTrank() {
        return typVonTrank;
    }

    public int getLevelanforderung() {
        return levelanforderung;
    }

    @Override public void benutzen() {
        System.out.println(getTypVonTrank() + " heilt dich um " + heilungLebenspunkte + " Lebenspunkte.");
    }
    @Override public void wegwerfen() {

    }

    @Override public void legeInInventar() {

    }
}
