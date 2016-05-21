package model;
import classes.Kendaraan;
import classes.Petugas;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Datas extends Koneksi{
    Petugas petugas;
    
    public boolean insertKendaraan(Kendaraan kendaraan){
        this.buka_koneksi();
        try {
            stmt = conn.createStatement();
            
            String query;
            query = "INSERT INTO kendaraan (no_kendaraan,nama_kendaraan,no_polisi,no_mesin,warna,tahun_kendaraan) "
                    + "VALUES('" + kendaraan.getPlatNomor() + "','"+ kendaraan.getNamaKendaraan() +"','"+ kendaraan.getPlatNomor()+"','"+ kendaraan.getNoMesin()+"','"+kendaraan.getWarna()+"','"+kendaraan.getThnKendaraan()+"')";
            
            stmt.executeUpdate(query);
            System.out.println("Data Inserted");
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println("Model Error Message:\n"+e.toString());
            return false;
        }
    }
    
    public String coba(){
        this.buka_koneksi();
        try {
            
            String query,ikan;
            ikan ="";
            query = "SELECT no_user FROM users WHERE no_user='123'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                ikan = rs.getString("no_user");
            }
            return ikan;
        } catch (Exception e) {
            return "Model Error";
        }
        
    }
    
    public Petugas login(Petugas petugaz){
        this.buka_koneksi();
        try {
            stmt = conn.createStatement();
            String query;
            query = "SELECT no_user,nama,jabatan,status FROM users WHERE no_user='" + petugaz.getNoUser() + "' AND password='" + petugaz.getPassword() + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                petugaz.setNoUser(rs.getString("no_user"));
                petugaz.setNama(rs.getString("nama"));
                petugaz.setJabatan(rs.getString("jabatan"));
                petugaz.setStatus(rs.getString("status"));
                //petugaz.setUsername(rs.getString("status"));
            }
            //System.out.println("working");
            this.tutup_koneksi();
            return petugaz;
        } catch (Exception e) {
            petugaz = new Petugas("", "", "", "", "", "");
            System.out.println("Model Error\n" + e.toString());
            return petugaz;
        }      
    }
    
    public boolean insertPetugas(Petugas petugas){
        this.buka_koneksi();
        try {
            stmt = conn.createStatement();
            
            String query;
            query = "INSERT INTO `users` (`no_user`, `nama`, `jabatan`, `status`, `password`) "
                    + "VALUES ('" + petugas.getNoUser() + "', '" + petugas.getNama() + "', '" + petugas.getJabatan() + "', '" + petugas.getStatus() + "', '" + petugas.getPassword() + "')";
            stmt.executeUpdate(query);
            stmt.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
