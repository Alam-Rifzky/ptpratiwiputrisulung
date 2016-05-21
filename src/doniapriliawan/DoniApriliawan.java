
package doniapriliawan;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.Datas;
import view.*;


public class DoniApriliawan {

    public static void main(String[] args) {
        //MyLogin login = new MyLogin();
        
        //MainMenu myMenu = new MainMenu();
        try {
           UIManager.setLookAndFeel(new com.sun.java.swing.plaf.windows.WindowsLookAndFeel());
           Login.showForm("buka");
           //MyMenu menuCoba = new MyMenu(); 
            //Penggunaan penggunaan = new Penggunaan();
            //Pengembalian pengembalian = new Pengembalian();
            //SearchKendaraan searchKendaraan = new SearchKendaraan();
            //InputData inputData = new InputData();
            //Coba cb = new Coba();
        } catch (Exception e) {
        
        }
        
        
        //myMenu.Jalankan();
        
        //login.jalankan();
        //login.jalankan();
        //atas data = new Datas();
        //System.out.println(data.coba());
        //Messagebox.jalankan();
        //JOptionPane.showMessageDialog(null, "working !!", "Title", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
