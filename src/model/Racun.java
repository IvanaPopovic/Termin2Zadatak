package model;

/**
 * Created by Ivana on 9.9.2016.
 */
import java.util.ArrayList;
import java.util.Date;
public class Racun {
    String oznaka;
    Date datum;
    //asocijacija (Racun-Stavka) - nov atribut
    private ArrayList<Stavka> stavka;

    //konstruktor bez parametara
    public Racun() {
        stavka=new ArrayList<Stavka>(); //iniciajalizacija kolekcije
    }

    //konstruktor sa parametrima
    public Racun (String oznaka, Date datum) {
        this.oznaka=oznaka ;
        this.datum=datum;
        stavka=new ArrayList<Stavka>(); //iniciajalizacija kolekcije
    }
    //copy konstruktor
    public Racun(Racun r){
        this.oznaka=r.oznaka;
        this.datum=r.datum;
        this.stavka=r.stavka; //naredba za atribut stavke u copy konstruktoru - dodata
    }

    //get i set metode
    public String getOznaka () {
        return oznaka;
    }
    public void setoznaka() {
        this.oznaka=oznaka;
    }

    public Date getDatum() {return datum;}
    public void setDatum() {this.datum=datum;}


    public ArrayList<Stavka> getStavka() { //get metoda za stavku
        return stavka;
    }
    public void setDelovi(ArrayList<Stavka> stavka) { //set metoda za stavku
        this.stavka = stavka;
    }
}

