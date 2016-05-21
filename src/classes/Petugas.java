
package classes;


public class Petugas {
    private String noUser;
    private String nama;
    private String username;
    private String password;
    private String status;
    private String jabatan;
    
    
    public Petugas() {
        
    }

    public Petugas(String no_user, String nama, String username, String password, String status, String jabatan) {
        this.noUser = no_user;
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.status = status;
        this.jabatan = jabatan;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    
    
    
}
