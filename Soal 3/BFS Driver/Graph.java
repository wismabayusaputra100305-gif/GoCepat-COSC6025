public class Graph {
    private int[][] tetangga;
    private int[] jumlahTetangga;
    public Graph(int jumlahSimpul) {
        tetangga = new int[jumlahSimpul][];
        jumlahTetangga = new int[jumlahSimpul];
        for (int v = 0; v < jumlahSimpul; v++) {
            tetangga[v] = new int[2];
        }
    }

    public void tambahSisi(int a, int b) {        //Menambahkan jalan dua arah
        tambahTetangga(a, b);
        tambahTetangga(b, a);
    }

    //Menambah kapasitas daftar tetangga jika sudah penuh
    private void tambahTetangga(int v, int w) {
        if (jumlahTetangga[v] == tetangga[v].length) {
            int[] baru = new int[tetangga[v].length * 2];
            for (int i = 0; i < tetangga[v].length; i++) {
                baru[i] = tetangga[v][i];
            }
            tetangga[v] = baru;
        }
        tetangga[v][jumlahTetangga[v]] = w;
        jumlahTetangga[v]++;
    }

    //Mencari driver terdekat menggunakan BFS
    public int bfsCariTerdekat(int asal, boolean[] adalahDriver) {
        if (adalahDriver[asal]) return asal;

        int n = tetangga.length;
        boolean[] dikunjungi = new boolean[n];
        int[] antrean = new int[n];
        int depan = 0, belakang = 0;

        dikunjungi[asal] = true;
        antrean[belakang] = asal;
        belakang++;

        while (depan < belakang) {
            int v = antrean[depan];
            depan++;
            for (int i = 0; i < jumlahTetangga[v]; i++) {
                int u = tetangga[v][i];
                if (!dikunjungi[u]) {
                    if (adalahDriver[u]) return u;
                    dikunjungi[u] = true;
                    antrean[belakang] = u;
                    belakang++;
                }
            }
        }
        return -1;
    }
}