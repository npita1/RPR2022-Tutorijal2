package ba.unsa.etf.rpr;

import java.util.Scanner;

/*Napomena: kao primjer rada zadatka mogao se napisati program drugačije, npr da se rucno unose korisnici i uposlenici (njihova imena i prezimena)
* i stanje na računima i da idemo kroz petlju za svakog korisnika i da se ispisuje da je korisnik usao u prekoracenje i slicno, ali posto nije naglaseno,
* osnovne stvari su prikazane na ovaj "pojedinacni" način.*/

public class App
{
    public static void main( String[] args )
    {
        Scanner ulaz = new Scanner(System.in);
        Banka banka = new Banka();
        Korisnik korisnik1 = banka.kreirajNovogKorisnika("Halid", "Bešlić");
        Racun racun1 = banka.kreirajRacunZaKorisnika(korisnik1);
        Osoba korisnik2 = banka.kreirajNovogKorisnika("Džoni","Štulić");
        Racun racun2 = banka.kreirajRacunZaKorisnika((Korisnik) korisnik2);
        Osoba uposlenik1 = banka.kreirajNovogUposlenika("Radomir", "Radović");
        Osoba uposlenik2 = banka.kreirajNovogUposlenika("Rada", "Voliradić");

        System.out.println("Korisnici banke: ");
        for ( Osoba k : banka.getKorisnici())
            System.out.print(k.toString() + ", ");

        System.out.println("\nUposlenici banke: ");
        for ( Osoba u : banka.getUposlenici())
            System.out.print(u.toString() + ", ");

        System.out.println("\n");
        racun1.izvrsiUplatu(5000.0);
        racun2.izvrsiUplatu(2000.0);
        System.out.println("Stanje na računu Halida Bešlića je (broj " + racun1.getBrojRacuna() + "): "+  racun1.getStanjeRacuna());
        System.out.println("Stanje na računu Džonija Štulića je (broj  " + racun2.getBrojRacuna() +"): "+ racun2.getStanjeRacuna());

        System.out.println("Halide, koliko želite podići novca? Ukucajte: ");
        Double isplata = ulaz.nextDouble();
        if (racun1.izvrsiIsplatu(isplata))
            System.out.println("Uspješna isplata, sadašnje stanje na računu je: " + racun1.getStanjeRacuna());
        else
            System.out.println("Neuspjesna isplata, pokrijte se onoliko koliko ste dugi.");

        System.out.println("A vi Džoni, koliko želite podići novca? Ukucajte: ");
        isplata = ulaz.nextDouble();
        if (racun2.izvrsiIsplatu(isplata))
            System.out.println("Uspješna isplata, sadašnje stanje na računu je: " + racun2.getStanjeRacuna());
        else
            System.out.println("Neuspjesna isplata, pokrijte se onoliko koliko ste dugi.");

    }
}
