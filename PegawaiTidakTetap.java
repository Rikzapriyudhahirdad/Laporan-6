package laporan6;

public class PegawaiTidakTetap extends Employee {

    private static int gaji;
    private int jamlamalembur;
    private int upahlembur;

    public PegawaiTidakTetap(String nama, String id, String jabatan, String i, int a, int x) {
        super(nama, id, jabatan, i, a, x);
    }

    public void setLamaKerja(int jamlamakerja) {
        //this.jamlamakerja = jamlamakerja;
        this.gaji = gajiEmployee;
        if (jamlamakerja >= 10) {
            this.jamlamalembur = jamlamakerja - 10;
            upahlembur = 10000 * jamlamalembur *30;
            gaji += upahlembur;
        } else {
            gaji = gaji;
        }
    }

    public int getUpahLembur() {
        return upahlembur;

    }

    public int getGaji() {
        return gaji;
    }

    public void tampilPegawaiTidakTetap() {
        System.out.println(" - - - - - - - -SLIP GAJI- - - - - - - - ");
        System.out.println("Nama        : " + getNama());
        System.out.println("Jabatan     : " + getJabatan());
        System.out.println("ID Kerja    : " + getId());
        System.out.println("Gaji anda   : " + "Rp.2000000");
        System.out.println("Upah Lembur : Rp." + getUpahLembur());
        System.out.println("-----------------------------------------");
        System.out.println("Total Gaji  : Rp." + getGaji());
    }

}
