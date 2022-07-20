package com.example.bahn;


//Abkuerzung: Bst = Betriebsstelle
public class Bst {

    //jede Instanzvariable entspricht einer Spalte in der csv-Datei

    private String plc;
    private String code;
    private String nameLang;
    private String nameKurz;
    private String typKurz;
    private String typLang;
    private String betriebszustand;
    private String datumAb;
    private String datumBis;
    private String niederlassung;
    private String regionalbereich;
    private String letzteAenderung;

    public Bst(String plc, String code, String nameLang, String nameKurz, String typKurz, String typLang, String betriebszustand, String datumAb, String datumBis, String niederlassung, String regionalbereich, String letzteAenderung) {
        this.plc = plc;
        this.code = code;
        this.nameLang = nameLang;
        this.nameKurz = nameKurz;
        this.typKurz = typKurz;
        this.typLang = typLang;
        this.betriebszustand = betriebszustand;
        this.datumAb = datumAb;
        this.datumBis = datumBis;
        this.niederlassung = niederlassung;
        this.regionalbereich = regionalbereich;
        this.letzteAenderung = letzteAenderung;
    }


    //oeffentliche getter

    public String getPlc() {
        return plc;
    }

    public String getCode() {
        return code;
    }

    public String getNameLang() {
        return nameLang;
    }

    public String getNameKurz() {
        return nameKurz;
    }

    public String getTypKurz() {
        return typKurz;
    }

    public String getTypLang() {
        return typLang;
    }

    public String getBetriebszustand() {
        return betriebszustand;
    }

    public String getDatumAb() {
        return datumAb;
    }

    public String getDatumBis() {
        return datumBis;
    }

    public String getNiederlassung() {
        return niederlassung;
    }

    public String getRegionalbereich() {
        return regionalbereich;
    }

    public String getLetzteAenderung() {
        return letzteAenderung;
    }
}
