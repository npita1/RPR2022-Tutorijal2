package ba.unsa.etf.rpr;

public class Korisnik extends Osoba {

    private Racun racun;

    public Korisnik(String ime, String prezime) {
        super(ime, prezime);
    }

    public void dodajRacun (Racun racun) {
        if (this.racun == null)
            this.racun = racun;
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }
}
