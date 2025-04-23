import java.util.ArrayList;
public class Klient {
    private String imię;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listaRezerwacji;
    // Konstruktor 1: imię, nazwisko, email
    public Klient(String imię, String nazwisko, String email) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.email = email;
        this.listaRezerwacji = new ArrayList<>();
    }
    // Konstruktor 2: imię i nazwisko (bez e-maila)
    public Klient(String imię, String nazwisko) {
        this(imię, nazwisko, "brak@mail.com");
    }
    // Gettery i settery
    public String getImię() { return imię; }
    public void setImię(String imię) { this.imię = imię; }
    public String getNazwisko() { return nazwisko; }
    public void setNazwisko(String nazwisko) { this.nazwisko = nazwisko; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public ArrayList<Wydarzenie> getListaRezerwacji() { return listaRezerwacji; }
    // Dodanie rezerwacji
    public void dodajRezerwację(Wydarzenie wydarzenie) {
        if (wydarzenie != null) {
            listaRezerwacji.add(wydarzenie);
            wydarzenie.zarezerwujMiejsce();
        }
    }
    // Anulowanie rezerwacji
    public void anulujRezerwację(Wydarzenie wydarzenie) {
        if (listaRezerwacji.remove(wydarzenie)) {
            wydarzenie.setDostępneMiejsca(wydarzenie.getDostępneMiejsca() - 1);
        } else {
            System.out.println("Nie znaleziono tej rezerwacji.");
        }
    }
    // Wyświetlenie wszystkich rezerwacji klienta
    public void wyświetlRezerwacje() {
        if (listaRezerwacji.isEmpty()) {
            System.out.println("Brak rezerwacji.");
        } else {
            for (Wydarzenie wydarzenie : listaRezerwacji) {
                System.out.println(wydarzenie);
            }
        }
    }
}
