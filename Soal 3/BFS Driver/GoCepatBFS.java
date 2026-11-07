public class GoCepatBFS {
    public static void main(String[] args) {
        //Membuat peta kota dengan 10 simpul dan 11 ruas jalan
        Graph peta = new Graph(10);
        peta.tambahSisi(0, 1); peta.tambahSisi(0, 2); peta.tambahSisi(1, 3);
        peta.tambahSisi(2, 4); peta.tambahSisi(3, 5); peta.tambahSisi(4, 5);
        peta.tambahSisi(4, 6); peta.tambahSisi(5, 7); peta.tambahSisi(6, 8);
        peta.tambahSisi(7, 8); peta.tambahSisi(8, 9);

        //Menentukan posisi driver
        boolean[] adalahDriver = new boolean[10];
        adalahDriver[3] = true;
        adalahDriver[7] = true;
        adalahDriver[8] = true;

        System.out.println(" GOCEPAT - BFS DRIVER TERDEKAT ");
        System.out.println("Jumlah persimpangan : 10 (simpul 0-9)");
        System.out.println("Driver berada di    : simpul 3, 7, 8");

        //Menguji pencarian driver dari dua titik penumpang
        int[] titikPenumpang = {0, 6};
        for (int i = 0; i < titikPenumpang.length; i++) {
            int asal = titikPenumpang[i];
            int driver = peta.bfsCariTerdekat(asal, adalahDriver);
            System.out.println("Penumpang di simpul " + asal
                + " -> driver terdekat: simpul " + driver);
        }
    }
}