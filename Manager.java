package laporan6;

public class Manager extends Employee {

    private static int gaji = 7000000;
    private static int bonus = 0;
    private static int tunjangan = 0;
    private static int tunjanganJabatan = 0;

    public Manager(String nama, String id, String jabatan, String i, int a, int x) {
        super(nama, id, jabatan, i, a, x);
    }

    public void setBonus(int awalkerja) {
        tunjanganJabatan += (int) (0.1 * getGaji());
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
        gaji += tunjanganJabatan;
    }

    public int tunjanganJabatan() {
        return tunjanganJabatan;
    }

    public int getBonus() {
        return bonus;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public int getTunjanganJabatan() {
        return tunjanganJabatan;
    }

    public int getGaji() {
        return gaji;
    }

    public void tampilManager() {
        System.out.println(" - - - - - - - -SLIP GAJI- - - - - - - - ");
        System.out.println("Nama               : " + getNama());
        System.out.println("Jabatan            : " + getJabatan());
        System.out.println("ID Kerja           : " + getId());
        System.out.println("Gaji Pokok         : " + "Rp.7000000");
        System.out.println("Bonus              : Rp." + getBonus());
        System.out.println("Tunjangan          : Rp." + getTunjangan());
        System.out.println("Tunjangan Jabatan  : Rp." + getTunjanganJabatan());
        System.out.println("-----------------------------------------");
        System.out.println("Total Gaji         : Rp." + getGaji());
    }
}
