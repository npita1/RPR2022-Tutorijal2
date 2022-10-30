package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Banka {

    private static Long brojRacuna = Long.valueOf(150567);
    private List<Korisnik> korisnici = new ArrayList<>();
    private List<Uposlenik> uposlenici = new ArrayList<>();


    public Banka(){
    }

    public Korisnik kreirajNovogKorisnika (String ime, String prezime) {
        Korisnik noviKorisnik = new Korisnik(ime,prezime);
        if (korisnici.size() == 0 || !korisnici.contains(noviKorisnik))
            korisnici.add(noviKorisnik);
        return noviKorisnik;
    }

    public Uposlenik kreirajNovogUposlenika (String ime, String prezime) {
        Uposlenik noviUposlenik = new Uposlenik (ime,prezime);
        if (uposlenici.size() == 0 || !uposlenici.contains(noviUposlenik))
            uposlenici.add(noviUposlenik);
        return noviUposlenik;
    }

    public Racun kreirajRacunZaKorisnika (Korisnik korisnik) {
        Racun noviRacun = new Racun(++brojRacuna, korisnik);
        korisnik.dodajRacun(noviRacun);
        return noviRacun;
    }


    public List<Korisnik> getKorisnici() {
        return korisnici;
    }

    public void setKorisnici(List<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    public List<Uposlenik> getUposlenici() {
        return uposlenici;
    }

    public void setUposlenici(List<Uposlenik> uposlenici) {
        this.uposlenici = uposlenici;
    }
}
