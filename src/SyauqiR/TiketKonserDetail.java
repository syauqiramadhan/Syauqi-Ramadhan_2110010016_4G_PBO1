package SyauqiR;

// inheritance
public class TiketKonserDetail extends TiketKonser {

//overridding
    public TiketKonserDetail(String notik, String nama) {
        super(notik, nama);
    }

    public int getKodePendaftaran() {
        return Integer.parseInt(getNotik().substring(0, 3));
    }

    public String getPosisiDuduk() {
        String KodeDuduk = getNotik().substring(3, 5);
        // seleksi if
        if (KodeDuduk.equals("07")) {
            return "Kursi Duduk VIP";
        } else {
            return "Kusi Duduk Reguler";
        }
    }

    public String getHari() {
        // seleksi switch
        String hari = getNotik().substring(5, 7);
        switch (hari) {
            case "01":
                return "Senin";
            case "02":
                return "Selasa";
            case "03":
                return "Rabu";
            case "04":
                return "Kamis";
            case "05":
                return "Jum'at";
            case "06":
                return "Sabtu";
            case "07":
                return "Minggu";
            default:
                return "Tanggal Tidak Ada";
        }
    }
    @Override
    public String displayInfo() {
        return super.displayInfo()
                + "\nKode Pendaftaran: " + getKodePendaftaran()
                + "\nPosisi Duduk : " + getPosisiDuduk()
                + "\nJadwal Hari : " + getHari();
    }
}
