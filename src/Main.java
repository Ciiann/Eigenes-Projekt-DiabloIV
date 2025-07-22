import Held.*;
import Helden.*;
import Ausruestung.*;
import Inventory.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //ArrayList für neue Helden
        ArrayList<Held> character = new ArrayList<>();
        Barbar barbar1 = new Barbar("Hulk", 1);
        character.add(barbar1);
        Barbar barbar2 = new Barbar("Jarzuul", 1);
        character.add(barbar2);
        Magier magier1 = new Magier("Dason", 1);
        character.add(magier1);
        Magier magier2 = new Magier("Brukes", 1);
        character.add(magier2);
        Druide druide1 = new Druide("Rob", 1);
        character.add(druide1);
        Druide druide2 = new Druide("Gucci", 1);
        character.add(druide2);
        Totenbeschwoerer totenbeschwoerer1 = new Totenbeschwoerer("Mowky", 1);
        character.add(totenbeschwoerer1);
        Totenbeschwoerer totenbeschwoerer2 = new Totenbeschwoerer("Meeres", 1);
        character.add(totenbeschwoerer2);
        Schurke schurke1 = new Schurke("P4wnyhof", 1);
        character.add(schurke1);
        Schurke schurke2 = new Schurke("Matze", 1);
        character.add(schurke2);

        //ForEach um Helden + Beschreibung auszugeben
        //     for(Held held : character) {
        //    System.out.println(held.beschreibung());
        //    if(held instanceof Kampfbereit) {
        //        Kampfbereit kaempfer = (Kampfbereit) held;
        //        kaempfer.angreifen();
        //        //kaempfer.spezialFaehigkeitEinsatz();
        //    }
        //    System.out.println();
        //}

        //ArrayList mit Gegenständen
        ArrayList<Waffe> waffe = new ArrayList<>();
        Waffe einhandschwert = new Waffe("Teufelsklinge", 10, Gegenstand.Seltenheit.LEGENDEAR, 120);
        Waffe zauberstab = new Waffe("Weisheitszepter", 9, Gegenstand.Seltenheit.LEGENDEAR, 160);
        Waffe stab = new Waffe("Totenstab", 12, Gegenstand.Seltenheit.EPISCH, 46);
        Waffe dolch = new Waffe("Tyrals Klinge", 15, Gegenstand.Seltenheit.MYSTISCH, 400);
        Waffe zweihandschwert = new Waffe("Pulverisierer", 12, Gegenstand.Seltenheit.MYSTISCH, 750);

        //ArrayList für Rüstung
        ArrayList<Ruestung> ruestung = new ArrayList<>();
        Ruestung brustschutz = new Ruestung("Todesplatte", 10, Gegenstand.Seltenheit.LEGENDEAR, 64);
        Ruestung kopfschutz = new Ruestung("Todeshelm", 10, Gegenstand.Seltenheit.LEGENDEAR, 75);
        Ruestung handschuhe = new Ruestung("Todeswickel", 10, Gegenstand.Seltenheit.LEGENDEAR, 43);
        Ruestung beinschutz = new Ruestung("Todesbrais", 10, Gegenstand.Seltenheit.LEGENDEAR, 56);
        Ruestung stiefel = new Ruestung("Todesbatons", 10, Gegenstand.Seltenheit.LEGENDEAR, 64);

        System.out.println("*".repeat(50));
        barbar2.ruesteAus(stab);
        barbar2.ruesteBrustschutzAus(brustschutz);
        barbar2.ruesteKopfschutzAus(kopfschutz);
        barbar2.ruesteHandschuheAus(handschuhe);
        barbar2.ruesteBeinschutzAus(beinschutz);
        barbar2.ruesteStiefelAus(stiefel);

        System.out.println("*".repeat(50));
        System.out.println(barbar1.beschreibung());
        System.out.println("*".repeat(50));
        barbar2.zeigeAusruestung();
        System.out.println("*".repeat(50));

        Waffe axt = new Waffe("Blutaxt",12, Gegenstand.Seltenheit.GEWOEHNLICH, 12);
        Trank lebenstrank = new Trank("Lebenstrank", 5, 20);



    }
}
