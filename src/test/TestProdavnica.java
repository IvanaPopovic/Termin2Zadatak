package test;


import model.Artikal;
import model.Racun;
import model.Stavka;

import java.util.Date;

/**
 * Created by Ivana on 9.9.2016.
 */
public class TestProdavnica {
    public static void main(String[] args) {

        Artikal a1= new Artikal("Mleko", "Mleko u flasi 1L", 40.99);
        Artikal a2= new Artikal("Beli hleb","400g", 50);
        Artikal a3= new Artikal("Crni hleb", "Crni razeni hleb", 60);
        Artikal a4= new Artikal("Jogurt", "Jogurt u tetrapaku 1L", 90.99);

        Racun r1= new Racun("Racun1", new Date());
        Racun r2= new Racun ("Racun2", new Date());

        Stavka s1=new Stavka(1);
        Stavka s2=new Stavka(2);
        Stavka s3=new Stavka(3);

        //postavljanje referenci asocijacije (Artikal - Stavka)
        a1.getStavka().add(s1); //mleko - 1
        s1.setArtikal(a1);

        a2.getStavka().add(s2); //beli hleb - 2
        s2.setArtikal(a2);

        a3.getStavka().add(s3); //crni hleb - 3
        s3.setArtikal(a3);

        //postavljanje referenci asocijacije (Racun - Stavka)
        r1.getStavka().add(s1); //Racun1 - 1
        s1.setRacun(r1);

        r1.getStavka().add(s2); //Racun1 - 2
        s2.setRacun(r2);

        r2.getStavka().add(s3); //Racun2 - 3
        s3.setRacun(r2);

        //Prikaz stavki (kolicina i naziv stavke) za racun 1
        for(Stavka stavka:r1.getStavka())
            System.out.println("Stavka: Kolicina: "+ stavka.getKolicina() + " Naziv: "+ stavka.getArtikal().getNaziv());

        System.out.println();

        //prikaz stavki (kolicina i naziv stavke) za racun1 ako je kolicina 2
        for(Stavka stavka:r1.getStavka()) {
            System.out.println("Proveravam kolicinu: " + stavka.getKolicina());
            if (stavka.getKolicina()==2)
                System.out.println("Stavka sa kolicinom 2: Kolicina: " + stavka.getKolicina() + " Naziv: " + stavka.getArtikal().getNaziv());
            else
                System.out.println("Ova kolicina nije odgovarajuca.");
        }

        System.out.println();

        //prikaz stavki (naziv i opis) za racun1 ako je naziv artikla mleko
        for(Stavka stavka:r1.getStavka()) {
            System.out.println("Proveravam naziv: " + stavka.getArtikal().getNaziv());
            if (stavka.getArtikal().getNaziv().equals("Mleko"))
                System.out.println("Artikal stavka sa nazivom Mleko: Naziv: " + stavka.getArtikal().getNaziv() + " Opis: " + stavka.getArtikal().getOpis());
            else
                System.out.println("Ovaj artikal stavke nema naziv Mleko. ");
        }

    }
}
