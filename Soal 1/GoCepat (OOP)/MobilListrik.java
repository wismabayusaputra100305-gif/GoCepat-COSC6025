// Tarif awal lebih mahal, tetapi biaya per km lebih murah
public class MobilListrik implements Kendaraan {
    public double hitungTarif(double jarakKm) { return 15000 + 1500 * jarakKm; }
    public String getNama() { return "Mobil Listrik"; }
}
