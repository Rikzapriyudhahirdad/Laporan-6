package laporan6;

import java.util.Scanner;

public class mainEmployeeGaji {

    public static void main(String[] args) {
        Scanner inint = new Scanner(System.in);
        Scanner instring = new Scanner(System.in);

        System.out.println("\t\t CV KARYA CIPTA ABADI");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.print("Masukkan Nama                 : ");
        String nama = instring.nextLine();
        System.out.print("Masukkan Jabatan              : ");
        String jabatan = instring.nextLine();
        System.out.print("Masukkan ID Kerja             : ");
        String id = instring.nextLine();
        System.out.print("Masukkan Tahun Awal Kerja     : ");
        int tahunawalkerja = inint.nextInt();
        System.out.print("Mempunyai Istri/Suami ? (Y/T) : ");
        String istri = instring.nextLine();
        System.out.print("Mempunyai Anak Berapa         : ");
        int brpanak = inint.nextInt();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("");
        Employee em = new Employee(nama, id, jabatan, istri, brpanak, tahunawalkerja);
        if (jabatan.equalsIgnoreCase("Manager")) {
            Manager manager = new Manager(nama, id, jabatan, istri, brpanak, tahunawalkerja);
            manager.setBonus(tahunawalkerja);
            manager.tampilManager();

        } else if (jabatan.equalsIgnoreCase("Pegawai Tetap")) {
            PegawaiTetap pt = new PegawaiTetap(nama, id, jabatan, istri, brpanak, tahunawalkerja);
            pt.setBonus(tahunawalkerja);
            pt.tampilPegawaiTetap();
        } else if (jabatan.equalsIgnoreCase("Pegawai Tidak Tetap")) {
            PegawaiTidakTetap ptt = new PegawaiTidakTetap(nama, id, jabatan, istri, brpanak, tahunawalkerja);
            System.out.print("Masukkan Lama Kerja anda perhari selama sebulan: ");
            int lembur = inint.nextInt();
            ptt.setLamaKerja(lembur);
            ptt.tampilPegawaiTidakTetap();
        } else {
            System.out.println("Maaf, Mungkin kesalahan memasukkan Jabatan, coba cek lagi !");
        }
    }
}
