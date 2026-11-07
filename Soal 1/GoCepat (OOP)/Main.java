import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Nama driver: ");
        Driver driver = new Driver(input.readLine());

        while (true) {
            System.out.print("\nNama penumpang (ketik 0 untuk selesai): ");
            String namaPenumpang = input.readLine();
            if (namaPenumpang.equals("0")) break;

            System.out.println("Pilih kendaraan: 1. Motor  2. Mobil  3. Mobil Listrik  4. Sepeda Listrik");
            System.out.print("Pilihan: ");
            int pilihan = Integer.parseInt(input.readLine());

            Kendaraan kendaraan;
            if (pilihan == 1) kendaraan = new Motor();
            else if (pilihan == 2) kendaraan = new Mobil();
            else if (pilihan == 3) kendaraan = new MobilListrik();
            else if (pilihan == 4) kendaraan = new SepedaListrik();
            else {
                System.out.println("Pilihan tidak valid.");
                continue;
            }

            System.out.print("Jarak (km): ");
            double jarak = Double.parseDouble(input.readLine());

            Trip trip = new Trip(driver, new Penumpang(namaPenumpang), kendaraan, jarak);
            System.out.println("--- Ringkasan Trip ---");
            trip.cetak();
        }

        // Semua perjalanan selesai, Driver masih tetap ada
        System.out.println("\nDriver " + driver.getNama() + " tetap ada setelah trip selesai, total trip: "
            + driver.getJumlahTrip());
        input.close();
    }
}