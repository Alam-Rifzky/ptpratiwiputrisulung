package controller;
import classes.Petugas;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.*;
import view.*;


public class Core {
    ModelPetugas mdPetugas;
    Petugas petugas;
    
    public boolean login(String username, String password){
        try {
            mdPetugas = new ModelPetugas();
            petugas = new Petugas(username, "", "", password, "", "");
            //if (!mdPetugas.) {
                
            //}
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
    
    
    /*
    Datas myData = new Datas();
    //DataKendaraan dataKendaraan = new DataKendaraan();
    InputData formKendaraan = new InputData();
    //Login login = new Login();
    Pengembalian pengembalianKendaraan = new Pengembalian();
    //PenggunaanKendaraan penggunaanKendaraan = new PenggunaanKendaraan();
    MyMenu menuUtama = new MyMenu();
    
    
    public void loginPetugas(String username, String password){
        
        try {
            
            Petugas petugas = new Petugas();
            petugas.setNoUser(username);
            petugas.setPassword(password);
            
            petugas = myData.login(petugas);
            
            if (!petugas.getNama().equals("")) {
                JOptionPane.showMessageDialog(null, "Selamat Datang " + petugas.getNama(), "Welcome",JOptionPane.INFORMATION_MESSAGE);
                //login.setVisible(false);
                menuUtama.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"Anda Tidak Terdaftar di Dalam Sistem", "Login Error", JOptionPane.ERROR_MESSAGE);
            }
            
            //System.out.println("Selamat Datang " + petugas.getNama());
            //return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            
        }

    }*/

    public void routeForm(String from, String to){
        if (from.equals("Main Menu")&&to.equals("Pengembalian")) {
            MyMenu main = new MyMenu();
            Pengembalian pengembalian = new Pengembalian();
            //main.hideForm();
            pengembalian.showForm();
        }
    
    }
    

}
