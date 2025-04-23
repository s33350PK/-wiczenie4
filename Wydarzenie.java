import java.text.SimpleDateFormat;
import java.util.Date;
public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostępneMiejsca = 0;
    private double cena;
    // Konstruktor 1: nazwa, cena
    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }
    // Konstruktor 2: nazwa, cena, data
    public Wydarzenie(String nazwa, double cena, String data) {
        this(nazwa, cena);
        this.data = data;
    }
    // Konstruktor 3: nazwa, cena, data, miejsce
    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this(nazwa, cena, data);
        this.miejsce = miejsce;
    }
    // Gettery i settery
    public String getNazwa() { return nazwa; }
    public void setNazwa(String nazwa) { this.nazwa = nazwa; }
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
    public String getMiejsce() { return miejsce; }
    public void setMiejsce(String miejsce) { this.miejsce = miejsce; }
    public int getMaxLiczbaMiejsc() { return maxLiczbaMiejsc; }
    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) { this.maxLiczbaMiejsc = maxLiczbaMiejsc; }
    public int getDostępneMiejsca() { return dostępneMiejsca; }
    public void setDostępneMiejsca(int dostępneMiejsca) { this.dostępneMiejsca = dostępneMiejsca; }
    public double getCena() { return cena; }
    public void setCena(double cena) { this.cena = cena; }
    // Rezerwacja miejsca
    public void zarezerwujMiejsce() {
        if (dostępneMiejsca < maxLiczbaMiejsc) {
            dostępneMiejsca++;
        } else {
            System.out.println("Brak dostępnych miejsc na to wydarzenie.");
        }
    }
    @Override
    public String toString() {
        return "Wydarzenie: " + nazwa + ", Data: " + data + ", Miejsce: " + miejsce +
                ", Cena: " + cena + " zł, Dostępne miejsca: " + (maxLiczbaMiejsc - dostępneMiejsca);
    }
}
