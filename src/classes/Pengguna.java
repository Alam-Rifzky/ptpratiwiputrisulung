package classes;

public class Pengguna {
    String noTrans;
    String tanggal;
    String noKend;
    String tujuan;
    int kmGo;
    String namaKend;
    String warnaKend;
    String thnKend;
    String sopir;
    String dataKerusakan;
    int kmBack;

    public Pengguna(String noTrans, String tanggal, String noKend, String tujuan, int kmGo, String namaKend, String warnaKend, String thnKend, String sopir, String dataKerusakan, int kmBack) {
        this.noTrans = noTrans;
        this.tanggal = tanggal;
        this.noKend = noKend;
        this.tujuan = tujuan;
        this.kmGo = kmGo;
        this.namaKend = namaKend;
        this.warnaKend = warnaKend;
        this.thnKend = thnKend;
        this.sopir = sopir;
        this.dataKerusakan = dataKerusakan;
        this.kmBack = kmBack;
    }

    public String getNoTrans() {
        return noTrans;
    }

    public String getNamaKend() {
        return namaKend;
    }

    public String getDataKerusakan() {
        return dataKerusakan;
    }

    public int getKmBack() {
        return kmBack;
    }

    public int getKmGo() {
        return kmGo;
    }

    public String getNoKend() {
        return noKend;
    }

    public String getSopir() {
        return sopir;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getThnKend() {
        return thnKend;
    }

    public String getTujuan() {
        return tujuan;
    }

    public String getWarnaKend() {
        return warnaKend;
    }
    
    
}
