package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class InputData extends JFrame{
    
    JLabel myLabel;
    String myForm = "inputDanEdit";
    
    public InputData(){
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setJMenuBar(this.myMenu());
        JPanel root = pRoot();
        root.add(pNorthPanel(),BorderLayout.NORTH);
        root.add(pBody(),BorderLayout.CENTER);
        this.add(root);        
        //this.setVisible(true);
    }
    
    public static void showForm(){
        new InputData().setVisible(true);
    }
    
    public void sembunyi(){
        this.setVisible(false);
        this.dispose();
    }
    
    JPanel pRoot(){
        JPanel panel = new JPanel(new BorderLayout(5, 5));
        
        
        
        return panel;
    }
    
    JPanel pNorthPanel(){
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        try {
            File currentDirectory = new File(new File(".").getAbsolutePath());
            ImageIcon iconz = new ImageIcon(currentDirectory.getCanonicalPath()+"\\src\\images\\logo.png");
            JLabel logo = new JLabel(iconz);
            
            //logo.setBounds(50, 50, 300, 300);
            panel.add(logo);
            //panel.setBorder(new EmptyBorder(0, 0, 0, 0));
            return panel;
        }catch (Exception e) {
            System.out.println(e);
            return panel;
        }
    }
    
    JPanel pBody(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JTabbedPane tabPanel = new JTabbedPane();
        
        tabPanel.add("add data",addData());
        tabPanel.add("Edit data",editData());
        tabPanel.setBounds(10, 0, 450, 350);
        
        panel.add(tabPanel);
        
        return panel;
    }
    

    

    
    JPanel addData(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        myLabel = new JLabel("No Kendaraan");
        myLabel.setBounds(10, 0, 125, 50);
        panel.add(myLabel);
        
        JTextField txtNoKendaraan = new JTextField();
        txtNoKendaraan.setBounds(150, 15, 240, 23);
        panel.add(txtNoKendaraan);
        
        myLabel = new JLabel("Nama Kendaraan");
        myLabel.setBounds(10, 40, 125, 50);
        panel.add(myLabel);
        
        JTextField txtNamaKend = new JTextField();
        txtNamaKend.setBounds(150, 53, 240, 23);
        panel.add(txtNamaKend);
        
        myLabel = new JLabel("No Plat Polisi");
        myLabel.setBounds(10, 80, 125, 50);
        panel.add(myLabel);        

        JTextField txtPlatPolisi = new JTextField();
        txtPlatPolisi.setBounds(150, 93, 240, 23);
        panel.add(txtPlatPolisi);
        
        myLabel = new JLabel("Tahun Beli");
        myLabel.setBounds(10, 120, 125, 50);
        panel.add(myLabel);            
        
        JTextField txtTahunBeli = new JTextField();
        txtTahunBeli.setBounds(150, 133, 240, 23);
        panel.add(txtTahunBeli);        
        
        
        myLabel = new JLabel("Warna");
        myLabel.setBounds(10, 160, 125, 50);
        panel.add(myLabel);            
        
        JTextField txtWarnaMobil = new JTextField();
        txtWarnaMobil.setBounds(150, 173, 240, 23);
        panel.add(txtWarnaMobil); 
                
        myLabel = new JLabel("Limit KM");
        myLabel.setBounds(10, 200, 125, 50);
        panel.add(myLabel);            

        JTextField txtLimitKM = new JTextField();
        txtLimitKM.setBounds(150, 213, 240, 23);
        panel.add(txtLimitKM); 
        
        JButton btnInput = new JButton("Input Data");
        btnInput.setBounds(150, 250, 115, 30);
        panel.add(btnInput);
        
        JButton btnReset = new JButton("Reset Data");
        btnReset.setBounds(275, 250, 115, 30);
        panel.add(btnReset);
        
        return panel;
    }
    
    JPanel editData(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        myLabel = new JLabel("No Polisi");
        myLabel.setBounds(10, 0, 125, 50);
        panel.add(myLabel);
        
        String [] contentsForCb = {"","coba","jajal","iseng","ikan"}; 
        
        JComboBox cbEditKend = new JComboBox(contentsForCb);
        cbEditKend.setBounds(150, 15, 240, 23);
        panel.add(cbEditKend);
        
        myLabel = new JLabel("Nama Kendaraan");
        myLabel.setBounds(10, 40, 125, 50);
        panel.add(myLabel);
        
        JTextField txtEditNamaKend = new JTextField();
        txtEditNamaKend.setBounds(150, 53, 240, 23);
        panel.add(txtEditNamaKend);        
        
        myLabel = new JLabel("No Kendaraan");
        myLabel.setBounds(10, 80, 125, 50);
        panel.add(myLabel);
        
        JTextField txtEditNoKend = new JTextField();
        txtEditNoKend.setBounds(150, 93, 240, 23);
        panel.add(txtEditNoKend);        
        
        myLabel = new JLabel("Tahun Beli");
        myLabel.setBounds(10, 120, 125, 50);        
        panel.add(myLabel);
        
        JTextField txtEditTahunBeli = new JTextField();
        txtEditTahunBeli.setBounds(150, 133, 240, 23);
        panel.add(txtEditTahunBeli);         
        
        myLabel = new JLabel("Warna");
        myLabel.setBounds(10, 160, 125, 50);
        panel.add(myLabel);
        
        JTextField txtEditWarnaMobil = new JTextField();
        txtEditWarnaMobil.setBounds(150, 173, 240, 23);
        panel.add(txtEditWarnaMobil);         
        
        myLabel = new JLabel("Limit KM");
        myLabel.setBounds(10, 200, 125, 50);
        panel.add(myLabel);  
        
        JTextField txtEditLimitKM = new JTextField();
        txtEditLimitKM.setBounds(150, 213, 240, 23);
        panel.add(txtEditLimitKM);         

        JButton btnEdit = new JButton("Edit Data");
        btnEdit.setBounds(150, 250, 115, 30);
        panel.add(btnEdit);
        
        JButton btnEditReset = new JButton("Reset Data");
        btnEditReset.setBounds(275, 250, 115, 30);
        panel.add(btnEditReset);
        
        return panel;
    }
    
    JMenuBar myMenu(){
        
        JMenuBar menubar = new JMenuBar();
                
        JMenu transactionMenu = new JMenu("Transaksi");
     
        JMenuItem peminjaman = new JMenuItem("Peminjaman");
        transactionMenu.add(peminjaman);
        peminjaman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Penggunaan.showForm();
                sembunyi();
            }
        });
        
        JMenuItem pengembalian = new JMenuItem("Pengembalian");
        transactionMenu.add(pengembalian);
        pengembalian.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pengembalian.showForm();
                sembunyi();
            }
        });
        
        JMenu menuCar = new JMenu("Kendaraan");
        
        JMenuItem inputOrEdit = new JMenuItem("Input/Edit");
        menuCar.add(inputOrEdit);
        inputOrEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Anda Sudah Berada Di Form Tersebut", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        JMenuItem cari = new JMenuItem("Cari");
        menuCar.add(cari);
        cari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SearchKendaraan.showForm();
                sembunyi();
            }
        });
        
        JMenu menuLogOut = new JMenu("Logout");
        menuLogOut.addMenuListener(new MenuListener() {

            @Override
            public void menuSelected(MenuEvent e) {
                sembunyi(); //To change body of generated methods, choose Tools | Templates.
                Login.showForm("buka");
            }

            @Override
            public void menuDeselected(MenuEvent e) {
                //System.out.println("Menu deselected!"); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void menuCanceled(MenuEvent e) {
                //System.out.println("Menu canceled"); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        //add to menu bar
        menubar.add(transactionMenu);
        menubar.add(menuCar);
        menubar.add(menuLogOut);
        
        return menubar;
    }
    
    
}
