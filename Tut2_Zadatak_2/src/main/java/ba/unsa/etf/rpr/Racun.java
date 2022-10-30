package ba.unsa.etf.rpr;

public class Racun {

    private Long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja = false;
    private Double stanjeRacuna = Double.valueOf(0);

    public Racun(Long broj, Osoba osoba) {
        this.brojRacuna = broj;
        this.korisnikRacuna = osoba;
    }

    private boolean provjeriOdobrenjePrekoracenja(Double prekoracenje) {
        this.odobriPrekoracenje(prekoracenje);
        return this.odobrenjePrekoracenja;
    }

    public boolean izvrsiUplatu(Double uplata) {
        this.stanjeRacuna += uplata;
        return true;
    }

    public boolean izvrsiIsplatu (Double isplata) {
        if (isplata >= 0 && isplata <= stanjeRacuna)
            stanjeRacuna -= isplata;
        else if (isplata >= 0 && isplata > stanjeRacuna) {
            Double prekoracenje = isplata - stanjeRacuna;
            if (provjeriOdobrenjePrekoracenja(prekoracenje))
                stanjeRacuna -= isplata;
            else
                return false;
        }
        return true;
    }

    public void odobriPrekoracenje (Double prekoracenje) {
        this.odobrenjePrekoracenja = prekoracenje <= 2000;
    }

    public Long getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(Long brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public Osoba getKorisnikRacuna() {
        return korisnikRacuna;
    }

    public void setKorisnikRacuna(Osoba korisnikRacuna) {
        this.korisnikRacuna = korisnikRacuna;
    }

    public boolean isOdobrenjePrekoracenja() {
        return odobrenjePrekoracenja;
    }

    public void setOdobrenjePrekoracenja(boolean odobrenjePrekoracenja) {
        this.odobrenjePrekoracenja = odobrenjePrekoracenja;
    }

    public Double getStanjeRacuna() {
        return stanjeRacuna;
    }

    public void setStanjeRacuna(Double stanjeRacuna) {
        this.stanjeRacuna = stanjeRacuna;
    }
}
