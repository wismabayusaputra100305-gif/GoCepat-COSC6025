// 1b. Data driver digunakan kembali untuk setiap perjalanan
public class Driver {
    private String nama;
    private int jumlahTrip;

    public Driver(String nama) { this.nama = nama; }
    public void tambahTrip() { jumlahTrip++; }
    public String getNama() { return nama; }
    public int getJumlahTrip() { return jumlahTrip; }
}