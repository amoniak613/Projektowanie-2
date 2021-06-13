package pl.javka.collections;

import java.util.List;

public class Book {
    private String tytul;
    private float cena;
    private  int rokWydania;
    private List<String> autorzy;
    private Gatunek gatunek;


    public Book(String tytul, float cena, int rokWydania, List<String> autorzy, Gatunek gatunek) {
        this.tytul = tytul;
        this.cena = cena;
        this.rokWydania = rokWydania;
        this.autorzy = autorzy;
        this.gatunek = gatunek;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public List<String> getAutorzy() {
        return autorzy;
    }

    public void setAutorzy(List<String> autorzy) {
        this.autorzy = autorzy;
    }

    public Gatunek getGatunek() {
        return gatunek;
    }

    public void setGatunek(Gatunek gatunek) {
        this.gatunek = gatunek;
    }
}
