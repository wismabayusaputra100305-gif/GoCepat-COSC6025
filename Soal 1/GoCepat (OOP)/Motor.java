// Tarif = tarif dasar + (tarif per km x jarak)
public class Motor implements Kendaraan {
    public double hitungTarif(double jarakKm) { return 8000 + 2000 * jarakKm; }
    public String getNama() { return "Motor"; }
}
