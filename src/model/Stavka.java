package model;

/**
 * Created by Ivana on 9.9.2016.
 */

public class Stavka {
    int kolicina;
    //asocijacija (Artikal-Stavka) - nov atribut
    private Artikal artikal;
    //asocijacija (Racun-Stavka) - nov atribut
    private Racun racun;

    //konstruktor bez parametara
    public Stavka() {
    }

    //konstruktor sa parametrima
    public Stavka ( int kolicina) {
        this.kolicina=kolicina ;
        this.artikal=artikal; //naredba za atribut artikal
        this.racun=racun; //naredba za atribut racun
    }

    //copy konstruktor
    public Stavka(Stavka s){
        this.kolicina=s.kolicina;
        this.artikal=s.artikal; //naredba za atribut artikal
        this.racun=s.racun; //naredba za atribut racun
    }

    //get i set metod
    public int getKolicina () {
        return kolicina;
    }
    public void setKolicina() {
        this.kolicina=kolicina;
    }

    public Artikal getArtikal() { //get metoda za artikal
        return artikal;
    }
    public void setArtikal (Artikal artikal) { //set metoda za artikal
        this.artikal = artikal;
    }

    public Racun getRacun() { //get metoda za racun
        return racun;
    }
    public void setRacun (Racun racun) { //set metoda za racun
        this.racun = racun;
    }
}



