
package classes;

public class Kendaraan {
    private String noKendaraan;
    private String platNomor;
    private String namaKendaraan;
    private String merk;
    private String noMesin;
    private String warna;
    private String thnKendaraan;

    public Kendaraan() {
    }

    
    
    public Kendaraan(String noKendaraan, String platNomor, String namaKendaraan, String noMesin, String warna, String thnKendaraan) {
        this.noKendaraan = noKendaraan;
        this.platNomor = platNomor;
        this.namaKendaraan = namaKendaraan;
        //this.merk = merk;
        this.noMesin = noMesin;
        this.warna = warna;
        this.thnKendaraan = thnKendaraan;
    }

    public String getNoKendaraan() {
        return noKendaraan;
    }

    public void setNoKendaraan(String noKendaraan) {
        this.noKendaraan = noKendaraan;
    }
    
    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }
    
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getNoMesin() {
        return noMesin;
    }

    public void setNoMesin(String noMesin) {
        this.noMesin = noMesin;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getThnKendaraan() {
        return thnKendaraan;
    }

    public void setThnKendaraan(String thnKendaraan) {
        this.thnKendaraan = thnKendaraan;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    
    
}
