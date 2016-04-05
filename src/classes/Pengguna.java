package classes;

public class Pengguna {

    private String noUser;
    private String nama;
    private String jabatan;
    private String status;
    private String password;

    public Pengguna() {
    }

    public Pengguna(String noUser, String nama, String jabatan, String status, String password) {
        this.noUser = noUser;
        this.nama = nama;
        this.jabatan = jabatan;
        this.status = status;
        this.password = password;
    }

    public String getNoUser() {
        return noUser;
    }

    public void setNoUser(String noUser) {
        this.noUser = noUser;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    
    
    
    
    
    
    
}
