
package controller;
import classes.Petugas;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Datas;
import view.*;


public class Core {
    Datas myData = new Datas();
    DataKendaraan dataKendaraan = new DataKendaraan();
    FormKendaraan formKendaraan = new FormKendaraan();
    Login login = new Login();
    PengembalianKendaraan pengembalianKendaraan = new PengembalianKendaraan();
    PenggunaanKendaraan penggunaanKendaraan = new PenggunaanKendaraan();
    MainMenu menuUtama = new MainMenu();
    
    
    public void loginPetugas(String username, String password){
        
        try {
            
            Petugas petugas = new Petugas();
            petugas.setNoUser(username);
            petugas.setPassword(password);
            
            petugas = myData.login(petugas);
            
            if (!petugas.getNama().equals("")) {
                JOptionPane.showMessageDialog(null, "Selamat Datang " + petugas.getNama(), "Welcome",JOptionPane.INFORMATION_MESSAGE);
                login.setVisible(false);
                menuUtama.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"Anda Tidak Terdaftar di Dalam Sistem", "Login Error", JOptionPane.ERROR_MESSAGE);
            }
            
            //System.out.println("Selamat Datang " + petugas.getNama());
            //return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            
        }

    }

    public void hideAndSeek(String from, String to){
        if (from.equals("MainMenu")&&to.equals("DataKendaraan")) {
            menuUtama.setVisible(false);
            dataKendaraan.setVisible(true);
        }else if(from.equals("MainMenu")&&to.equals("FormKendaraan")){
            menuUtama.setVisible(false);
            formKendaraan.setVisible(true);
        }else if(from.equals("MainMenu")&&to.equals("PengembalianKendaraan")){
            menuUtama.setVisible(false);
            pengembalianKendaraan.setVisible(true);
        }else if(from.equals("MainMenu")&&to.equals("PenggunaanKendaraan")){
            menuUtama.setVisible(false);
            penggunaanKendaraan.setVisible(true);
        }else if(from.equals("MainMenu")&&to.equals("Login")){
            menuUtama.setVisible(false);
            login.setVisible(true);
        }else if(from.equals("DataKendaraan")&&to.equals("FormKendaraan")){
            dataKendaraan.setVisible(false);
            formKendaraan.setVisible(true);
        }else if(from.equals("DataKendaraan")&&to.equals("Login")){
            dataKendaraan.setVisible(false);
            login.setVisible(true);
        }else if(from.equals("DataKendaraan")&&to.equals("MainMenu")){
            dataKendaraan.setVisible(false);
            menuUtama.setVisible(true);
        }else if(from.equals("DataKendaraan")&&to.equals("PengembalianKendaraan")){
            dataKendaraan.setVisible(false);
            pengembalianKendaraan.setVisible(true);
        }else if(from.equals("DataKendaraan")&&to.equals("PenggunaanKendaraan")){
            dataKendaraan.setVisible(false);
            penggunaanKendaraan.setVisible(true);
        }else if(from.equals("FormKendaraan")&&to.equals("DataKendaraan")){
            formKendaraan.setVisible(false);
            dataKendaraan.setVisible(true);
        }else if(from.equals("FormKendaraan")&&to.equals("Login")){
            formKendaraan.setVisible(false);
            login.setVisible(true);
        }else if(from.equals("FormKendaraan")&&to.equals("MainMenu")){
            formKendaraan.setVisible(false);
            menuUtama.setVisible(true);
        }else if(from.equals("FormKendaraan")&&to.equals("PengembalianKendaraan")){
            formKendaraan.setVisible(false);
            pengembalianKendaraan.setVisible(true);
        }else if(from.equals("FormKendaraan")&&to.equals("PenggunaanKendaraan")){
            formKendaraan.setVisible(false);
            penggunaanKendaraan.setVisible(true);
        }else if(from.equals("PengembalianKendaraan")&&to.equals("DataKendaraan")){
            pengembalianKendaraan.setVisible(false);
            dataKendaraan.setVisible(true);
        }else if(from.equals("PengembalianKendaraan")&&to.equals("FormKendaraan")){
            pengembalianKendaraan.setVisible(false);
            formKendaraan.setVisible(true);
        }else if(from.equals("PengembalianKendaraan")&&to.equals("Login")){
            pengembalianKendaraan.setVisible(false);
            login.setVisible(true);
        }else if(from.equals("PengembalianKendaraan")&&to.equals("MainMenu")){
            pengembalianKendaraan.setVisible(false);
            menuUtama.setVisible(true);
        }else if(from.equals("PengembalianKendaraan")&&to.equals("PenggunaanKendaraan")){
            pengembalianKendaraan.setVisible(false);
            pengembalianKendaraan.setVisible(true);
        }else if(from.equals("PenggunaanKendaraan")&&to.equals("DataKendaraan")){
            penggunaanKendaraan.setVisible(false);
            dataKendaraan.setVisible(true);
        }else if(from.equals("PenggunaanKendaraan")&&to.equals("FormKendaraan")){
            penggunaanKendaraan.setVisible(false);
            formKendaraan.setVisible(true);
        }else if(from.equals("PenggunaanKendaraan")&&to.equals("Login")){
            penggunaanKendaraan.setVisible(false);
            login.setVisible(true);
        }else if(from.equals("PenggunaanKendaraan")&&to.equals("MainMenu")){
            penggunaanKendaraan.setVisible(false);
            menuUtama.setVisible(true);
        }else if(from.equals("PenggunaanKendaraan")&&to.equals("PengembalianKendaraan")){
            penggunaanKendaraan.setVisible(false);
            pengembalianKendaraan.setVisible(true);
        }
    }
}
