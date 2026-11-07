// 1c. Kalau ada kendaraan baru, tinggal buat class baru tanpa mengubah Trip
public class SepedaListrik implements Kendaraan {
    public double hitungTarif(double jarakKm) { return 5000 + 800 * jarakKm; }
    public String getNama() { return "Sepeda Listrik"; }
}
