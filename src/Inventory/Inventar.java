package Inventory;

import Ausruestung.Waffe;

public class Inventar {
    private int inventarplatz;
    private Items items;
    private Trank trank;

    public Inventar(int inventarplatz, Items items, Trank lebenstrank) {
        this.inventarplatz = inventarplatz;
        this.items = items;
        this.trank = trank;
    }

    public Inventar(Items items) {
    }
//****************************************************schauen woran es liegt das die Methode nicht funktioniert*********************************
    //public void fuegeInventarHinzu(Trank trank) {
    //    if (this.trank != null) {
    //        trank.legeInInventar();
    //        System.out.println(this.trank.getTypVonTrank() + " ins Inventar gelegt.");
    //    }
    //    this.trank = trank;
    //}

    public void fuegeInventarHinzu(Trank trank) {
        if (trank != null) {
            trank.legeInInventar();
            System.out.println(trank.getTypVonTrank() + " ins Inventar gelegt.");
        }
    }

    public void zeigeInventar() {
        if (trank != null) {
            System.out.println("Trank: " + trank.getTypVonTrank());
        } else {
            System.out.println("Trank im Inventar?: Nein");
        }
    }

    public int getInventarplatz() {
        return inventarplatz;
    }

    public Items getItems() {
        return items;
    }

    public Trank getLebenstrank() {
        return trank;
    }

    public void setInventarplatz(int inventarplatz) {
        this.inventarplatz = inventarplatz;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public void setLebenstrank(Trank lebenstrank) {
        this.trank = lebenstrank;
    }


}
