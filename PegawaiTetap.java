package laporan6;

public class PegawaiTetap extends Employee {

    private static int gaji = 4000000;
    private static int bonus;
    private static int tunjangan;

    public PegawaiTetap(String nama, String id, String jabatan, String i, int a, int x) {
        super(nama, id, jabatan, i, a, x);
    }

    public void setBonus(int awalkerja) {
        if (super.getLamakerja() <= 5) {
            if (getIstri().equalsIgnoreCase("Y")) {
                tunjangan += 0.1 * getLamakerja() * gaji;
                if (getAnak() >= 1 && getAnak() <= 3) {
                    tunjangan += (0.15 * getAnak()) * gaji;
                    gaji += tunjangan;
                } else if (getAnak() > 3) {
                    tunjangan += 0.15 * 3 * gaji;
                    gaji += tunjangan;
                } else {
                    gaji += tunjangan;
                }
            } else if (getAnak() >= 1 && getAnak() <= 3) {
                tunjangan += (0.15 * getAnak() * gaji);
                gaji += tunjangan;
            } else {
                bonus = 0;
                tunjangan = 0;
            }
        } else if (getLamakerja() >= 6 && getLamakerja() <= 10) {
            bonus += (0.05 * getLamakerja()) * gaji;
            if (getIstri().equalsIgnoreCase("Y")) {
                tunjangan += (0.1 * getLamakerja()) * gaji;
                if (getAnak() >= 1 && getAnak() <= 3) {
                    tunjangan += (0.15 * getAnak()) * gaji;
                    gaji += tunjangan + bonus;
                } else if (getAnak() > 3) {
                    tunjangan += (0.15 * 3) * gaji;
                    gaji += tunjangan + bonus;
                } else {
                    gaji += tunjangan + bonus;
                }
            } else if (getAnak() != 0 && getAnak() <= 3) {
                tunjangan += (0.15 * getAnak() * gaji);
                gaji += tunjangan + bonus;
            } else if (getAnak() > 3) {
                tunjangan += (0.15 * 3 * gaji);
                gaji += tunjangan + bonus;
            } else {
                bonus += (0.05 * getLamakerja()) * gaji;
                tunjangan = 0;
                gaji += bonus;
            }

        } else if (getLamakerja() > 10) {
            bonus += (0.1 * getLamakerja()) * gaji;
            tunjangan += (0.1 * getLamakerja()) * gaji;
            if (getIstri().equalsIgnoreCase("Y")) {
                tunjangan += (0.1 * getLamakerja()) * gaji;
                if (getAnak() != 0 && getAnak() <= 3) {
                    tunjangan += (0.15 * getAnak()) * gaji;
                    gaji += tunjangan + bonus;
                } else if (getAnak() > 3) {
                    tunjangan += (0.15 * 3 * gaji);
                    gaji += tunjangan + bonus;
                } else {
                    gaji += tunjangan + bonus;
                }
            } else if (getAnak() != 0 && getAnak() <= 3) {
                tunjangan += (0.15 * getAnak() * gaji);
                gaji += tunjangan + bonus;

            } else if (getAnak() > 3) {
                tunjangan += (0.15 * 3 * gaji);
                gaji += tunjangan + bonus;

            } else {
                bonus += (0.1 * getLamakerja()) * gaji;
                tunjangan += (0.1 * getLamakerja()) * gaji;
                gaji += bonus + tunjangan;
            }
        }
    }

    public int getGaji() {
        return gaji;
    }

    public int getBonus() {
        return bonus;
    }

    public static int getTunjangan() {
        return tunjangan;
    }

    public void tampilPegawaiTetap() {
        System.out.println(" - - - - - - - -SLIP GAJI- - - - - - - - ");
        System.out.println("Nama        : " + getNama());
        System.out.println("Jabatan     : " + getJabatan());
        System.out.println("ID Kerja    : " + getId());
        System.out.println("Gaji anda   : Rp." + "4000000");
        System.out.println("Bonus       : Rp." + getBonus());
        System.out.println("Tunjangan   : Rp." + getTunjangan());
        System.out.println("-----------------------------------------");
        System.out.println("Total Gaji  : Rp." + getGaji());
    }

}
