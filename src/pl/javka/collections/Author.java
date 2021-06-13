package pl.javka.collections;

public class Author {
    private String imie;
    private String nazwisko;
    private String plec;

    public Author(String imie, String nazwisko, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }
}
