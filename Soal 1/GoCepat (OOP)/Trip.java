// 1b. Driver dibuat di luar Trip dan hanya dipakai sebagai referensi
// 1c. Trip cukup menggunakan interface Kendaraan
public class Trip {
    private Driver driver;
    private Penumpang penumpang;
    private Kendaraan kendaraan;
    private double jarakKm;

    public Trip(Driver driver, Penumpang penumpang, Kendaraan kendaraan, double jarakKm) {
        this.driver = driver;
        this.penumpang = penumpang;
        this.kendaraan = kendaraan;
        this.jarakKm = jarakKm;
        driver.tambahTrip();
    }

    public double getTarif() {
        return kendaraan.hitungTarif(jarakKm);   // polymorphism (dynamic binding)
    }

    public void cetak() {
        System.out.println("Driver    : " + driver.getNama());
        System.out.println("Penumpang : " + penumpang.getNama());
        System.out.println("Kendaraan : " + kendaraan.getNama());
        System.out.println("Jarak     : " + jarakKm + " km");
        System.out.printf("Tarif     : Rp %,.0f%n", getTarif());
    }
}