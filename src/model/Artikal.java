package model;

import java.util.ArrayList;

/**
 * Created by Ivana on 9.9.2016.
 */
public class Artikal {
    String naziv;
    String opis;
    double cena;
    //asocijacija (Artikal-Stavka) - nov atribut
    private ArrayList<Stavka> stavka;

    //konstruktor bez parametara
    public Artikal () {
        stavka=new ArrayList<Stavka>(); //iniciajalizacija kolekcije
    }

    //konstruktor sa parametrima
    public Artikal ( String naziv, String opis, double cena) {
        this.naziv=naziv ;
        this.opis=opis;
        this.cena=cena;
        stavka=new ArrayList<Stavka>(); //iniciajalizacija kolekcije
    }
    //copy konstruktor
    public Artikal(Artikal a){
        this.naziv=a.naziv;
        this.opis=a.opis;
        this.cena=a.cena;
        this.stavka=a.stavka; //naredba za atribut stavke u copy konstruktoru - dodata
    }

    //get i set metode
    public String getNaziv () {
        return naziv;
    }
    public void setNaziv() {
        this.naziv=naziv;
    }

    public String getOpis() {return opis;}
    public void setOpis() {this.opis=opis;}

    public double getCena() { return cena;}
    public void setCena() {this.cena=cena;}


    public ArrayList<Stavka> getStavka() { //get metoda za stavku
        return stavka;
    }
    public void setStavka(ArrayList<Stavka> stavka) { //set metoda za stavku
        this.stavka = stavka;
    }
}


