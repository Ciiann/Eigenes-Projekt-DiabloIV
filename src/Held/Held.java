package Held;

import Ausruestung.Ruestung;
import Ausruestung.Waffe;

public abstract class Held {
    private String name;
    private int level;
    private Heldenklasse heldenklasse;
    //private Ruestung ausgeruesteteRuestung;
    private Waffe ausgeruesteteWaffe;
    private Ruestung ausgeruesteteKopfschutz;
    private Ruestung ausgeruesteteBrustschutz;
    private Ruestung ausgeruesteteHandschuhe;
    private Ruestung ausgeruesteteBeinschutz;
    private Ruestung ausgeruesteteStiefel;

    public Held(String name, int level, Heldenklasse heldenklasse) {
        this.name = name;
        this.level = level;
        this.heldenklasse = heldenklasse;
        this.ausgeruesteteWaffe = null;
//Um die letzte Rüstung anzeigen zu lassen (allgemein)
        //this.ausgeruesteteRuestung = null;
        this.ausgeruesteteKopfschutz = null;
        this.ausgeruesteteBeinschutz = null;
        this.ausgeruesteteBrustschutz = null;
        this.ausgeruesteteStiefel = null;
        this.ausgeruesteteHandschuhe = null;
    }

    public void ruesteAus(Waffe waffe) {
        if (this.ausgeruesteteWaffe != null) {
            System.out.println(this.ausgeruesteteWaffe.getName() + " wurde abgelegt.");
        }
        this.ausgeruesteteWaffe = waffe;
        waffe.ausruesten(); // Ruft die eigene Ausrüstungslogik des Items auf
    }

//Um die letzte Rüstung anzeigen zu lassen (allgemein)

    //public void ruesteAus(Ruestung ruestung) {
    //    if (this.ausgeruesteteRuestung != null) {
    //        System.out.println(this.ausgeruesteteRuestung.getName() + " wurde abgelegt.");
    //    }
    //    this.ausgeruesteteRuestung = ruestung;
    //    ruestung.ausruesten();
    //}
    public void ruesteKopfschutzAus(Ruestung ruestung) {
        if (this.ausgeruesteteKopfschutz != null) {
            System.out.println(this.ausgeruesteteKopfschutz.getName() + " wurde abgelegt.");
        }
        this.ausgeruesteteKopfschutz = ruestung;
        ruestung.ausruesten();
    }

    public void ruesteBrustschutzAus(Ruestung ruestung) {
        if (this.ausgeruesteteBrustschutz != null) {
            System.out.println(this.ausgeruesteteBrustschutz.getName() + " wurde abgelegt.");
        }
        this.ausgeruesteteBrustschutz = ruestung;
        ruestung.ausruesten();
    }

    public void ruesteHandschuheAus(Ruestung ruestung) {
        if (this.ausgeruesteteHandschuhe != null) {
            System.out.println(this.ausgeruesteteHandschuhe.getName() + " wurde abgelegt.");
        }
        this.ausgeruesteteHandschuhe = ruestung;
        ruestung.ausruesten();
    }

    public void ruesteBeinschutzAus(Ruestung ruestung) {
        if (this.ausgeruesteteBeinschutz != null) {
            System.out.println(this.ausgeruesteteBeinschutz.getName() + " wurde abgelegt.");
        }
        this.ausgeruesteteBeinschutz = ruestung;
        ruestung.ausruesten();
    }

    public void ruesteStiefelAus(Ruestung ruestung) {
        if (this.ausgeruesteteStiefel != null) {
            System.out.println(this.ausgeruesteteStiefel.getName() + " wurde abgelegt.");
        }
        this.ausgeruesteteStiefel = ruestung;
        ruestung.ausruesten();
    }

    public void zeigeAusruestung() {
        if (ausgeruesteteWaffe != null) {
            System.out.println("Waffe: " + ausgeruesteteWaffe.info());
        } else {
            System.out.println("Waffe: Keine");
        }
//Um die letzte Rüstung anzeigen zu lassen (allgemein)
        //if (ausgeruesteteRuestung != null) {
        //    System.out.println("Rüstung: " + ausgeruesteteRuestung.info());
        //} else {
        //    System.out.println("Rüstung: Keine");
        //}
        //damit Kopfschutz angezeigt wird
        if (ausgeruesteteKopfschutz != null) {
            System.out.println("Kopfschutz: " + ausgeruesteteKopfschutz.info());
        } else {
            System.out.println("Kopfschutz: Keine");
        }
        if (ausgeruesteteBrustschutz != null) {
            System.out.println("Brustschutz: " + ausgeruesteteBrustschutz.info());
        } else {
            System.out.println("Brustschutz: Keine");
        }
        if (ausgeruesteteHandschuhe != null) {
            System.out.println("handschuhe: " + ausgeruesteteHandschuhe.info());
        } else {
            System.out.println("Handschuhe: Keine");
        }
        if (ausgeruesteteBeinschutz != null) {
            System.out.println("Beinschutz: " + ausgeruesteteBeinschutz.info());
        } else {
            System.out.println("Beinschutz: Keine");
        }
        if (ausgeruesteteStiefel != null) {
            System.out.println("Stiefel: " + ausgeruesteteStiefel.info());
        } else {
            System.out.println("Stiefel: Keine");
        }
        System.out.println("*".repeat(50));
    }

    public abstract String beschreibung();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Heldenklasse getHeldenklasse() {
        return heldenklasse;
    }

    public void setHeldenklasse(String heldenklasse) {
        this.heldenklasse = Heldenklasse.valueOf(heldenklasse);
    }


}
