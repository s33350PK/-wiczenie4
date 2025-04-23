import java.util.ArrayList;
public class SystemRezerwacji {
    private ArrayList<Wydarzenie> listaWydarzeń;
    private ArrayList<Klient> listaKlientów;
    public SystemRezerwacji() {
        this.listaWydarzeń = new ArrayList<>();
        this.listaKlientów = new ArrayList<>();
    }
    // Dodawanie wydarzenia - wersja 1 (pełny obiekt)
    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        listaWydarzeń.add(wydarzenie);
    }
    // Dodawanie wydarzenia - wersja 2 (dane wejściowe)
    public void dodajWydarzenie(String nazwa, double cena) {
        listaWydarzeń.add(new Wydarzenie(nazwa, cena));
    }
    // Dodawanie klienta - wersja 1 (pełny obiekt)
    public void dodajKlienta(Klient klient) {
        listaKlientów.add(klient);
    }
    // Dodawanie klienta - wersja 2 (dane wejściowe)
    public void dodajKlienta(String imię, String nazwisko, String email) {
        listaKlientów.add(new Klient(imię, nazwisko, email));
    }
    // Rezerwacja wydarzenia dla klienta
    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        if (wydarzenie.getDostępneMiejsca() < wydarzenie.getMaxLiczbaMiejsc()) {
            klient.dodajRezerwację(wydarzenie);
        } else {
            System.out.println("Brak wolnych miejsc na wydarzenie: " + wydarzenie.getNazwa());
        }
    }
    // Szukanie wydarzenia po nazwie
    public Wydarzenie znajdźWydarzenie(String nazwa) {
        for (Wydarzenie w : listaWydarzeń) {
            if (w.getNazwa().equalsIgnoreCase(nazwa)) {
                return w;
            }
        }
        System.out.println("Nie znaleziono wydarzenia: " + nazwa);
        return null;
    }
    // Szukanie klienta po nazwisku
    public Klient znajdźKlienta(String nazwisko) {
        for (Klient k : listaKlientów) {
            if (k.getNazwisko().equalsIgnoreCase(nazwisko)) {
                return k;
            }
        }
        System.out.println("Nie znaleziono klienta o nazwisku: " + nazwisko);
        return null;
    }
    // Zmiana ceny wydarzenia
    public void zmieńCenęWydarzenia(String nazwa, double nowaCena) {
        Wydarzenie wydarzenie = znajdźWydarzenie(nazwa);
        if (wydarzenie != null) {
            wydarzenie.setCena(nowaCena);
        }
    }
}
