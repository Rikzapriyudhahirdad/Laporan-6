package laporan6;

public class Employee {

    public static int gajiEmployee = 2000000;
    private String nama;
    private String idKerja;
    private String jabatan;
    private String istri;
    public int anak;
    public final int tahunsekarang = 2016;
    public int tahunAwalKerja;
    public int lamakerja;

    public Employee(String nama, String id, String jabatan, String i, int a, int x) {
        this.nama = nama;
        this.idKerja = id;
        this.jabatan = jabatan;
        this.istri = i;
        this.anak = a;
        this.tahunAwalKerja = x;
    }

    public void setTahunAwalKerja(int awal) {
        this.tahunAwalKerja = awal;
    }

    public int getTahunAwalKerja() {
        return tahunAwalKerja;
    }

    public int getLamakerja() {
        this.lamakerja = tahunsekarang - tahunAwalKerja;
        return lamakerja;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return idKerja;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getIstri() {
        return istri;
    }

    public int getAnak() {
        return anak;
    }
}
