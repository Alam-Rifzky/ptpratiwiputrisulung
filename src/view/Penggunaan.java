
package view;

import classes.Pengguna;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import model.ModelTransaksi;


public class Penggunaan extends JFrame{
    ModelTransaksi mdlTrans;
    JLabel logo,lblUsername,lblNama;
    File currentDirectory = new File(new File(".").getAbsolutePath());
    String myForm = "Penggunaan";
    
    public Penggunaan() {
        this.setSize(850, 550);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel root = pRoot();
        root.add(pNorthPanel(),BorderLayout.NORTH);
        root.add(pBody(),BorderLayout.CENTER);
        
        this.add(root);
        
        this.setJMenuBar(this.myMenu());
        this.setDefaultLookAndFeelDecorated(true);
        //this.setVisible(true);
    }
    
    public static void showForm(){
        new Penggunaan().setVisible(true);
    }
    
    JPanel pRoot(){
        JPanel panel = new JPanel(new BorderLayout());
        
        return panel;
    }
    
    JPanel pNorthPanel(){
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        //panel.setLayout(null);
        
        try {
            ImageIcon iconz = new ImageIcon("images/logo.png");
            logo = new JLabel(iconz);
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
        //declarations
        JPanel panel = new JPanel();
        JLabel header,subHeader1,subHeader2;
        JLabel lblNoTransaksi,lblTanggal,lblNoKendaraan,lblNamaKendaraan,
                lblThnKendaraan,lblWarna,lblKmBerangkat,lblKmKembali,
                lblNamaPengguna,lblTujuan,lblDataKerusakan;
        final JTextField txtNoTransaksi,txtNoKendaraan,txtNamaKendaraan,txtThnKendaraan, txtWarna,
                txtKmBerangkat,txtKmKembali,txtNamaPengguna,txtTujuan,txtDataKerusakan;
        JButton btnSubmit;
        
        
        
        //setting layout
        panel.setLayout(null);
        
        header = new JLabel("FORM PENGGUNAAN KENDARAAN");
        header.setFont(new Font("Tahoma", Font.BOLD, 16));
        header.setBounds(10, -10, 380, 50);
        panel.add(header);
        
        lblTanggal = new JLabel(new Date().toString());
        lblTanggal.setBounds(10, 10, 200, 50);
        lblTanggal.setFont(new Font("Tahoma", Font.PLAIN, 12));
        panel.add(lblTanggal);
        
        subHeader1 = new JLabel("Data Kendaraan");
        subHeader1.setBounds(10, 50, 150, 50);
        subHeader1.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(subHeader1);
        
        subHeader1 = new JLabel("Data Pengguna/Sopir");
        subHeader1.setBounds(400, 50, 150, 50);
        subHeader1.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(subHeader1);
        
        subHeader1 = new JLabel("No Transaksi");
        subHeader1.setBounds(10, 90, 150, 50);
        subHeader1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        panel.add(subHeader1);
        
        //textField No_Transaksi
        txtNoTransaksi = new JTextField();
        txtNoTransaksi.setBounds(150, 103, 190, 25);
        panel.add(txtNoTransaksi);
        
        subHeader1 = new JLabel("No Kendaraan");
        subHeader1.setBounds(10, 130, 150, 50);
        subHeader1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        panel.add(subHeader1);    
        
        //textField No_Kendaraan
        txtNoKendaraan = new JTextField();
        txtNoKendaraan.setBounds(150, 143, 190, 25);
        panel.add(txtNoKendaraan);
        
        subHeader1 = new JLabel("Nama Kendaraan");
        subHeader1.setBounds(10, 170, 150, 50);
        subHeader1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        panel.add(subHeader1);
        
        //textField Nama_Kendaraan
        txtNamaKendaraan = new JTextField();
        txtNamaKendaraan.setBounds(150, 183, 190, 25);
        panel.add(txtNamaKendaraan);
        
        subHeader1 = new JLabel("Tahun Kendaraan");
        subHeader1.setBounds(10, 210, 150, 50);
        subHeader1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        panel.add(subHeader1);  
        
        //textField Tahun_Kendaraan
        txtThnKendaraan = new JTextField();
        txtThnKendaraan.setBounds(150, 223, 190, 25);
        panel.add(txtThnKendaraan);
        
        subHeader1 = new JLabel("Warna Kendaraan");
        subHeader1.setBounds(10, 250, 150, 50);
        subHeader1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        panel.add(subHeader1);  
        
        //textField Warna_Kendaraan
        txtWarna = new JTextField();
        txtWarna.setBounds(150, 263, 190, 25);
        panel.add(txtWarna);
        
        subHeader1 = new JLabel("KM Berangkat");
        subHeader1.setBounds(10, 290, 150, 50);
        subHeader1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        panel.add(subHeader1);  
        
        //textField KM_Berangkat
        txtKmBerangkat = new JTextField();
        txtKmBerangkat.setBounds(150, 303, 190, 25);
        panel.add(txtKmBerangkat);
        
        subHeader1 = new JLabel("KM Kembali");
        subHeader1.setBounds(10, 330, 150, 50);
        subHeader1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        panel.add(subHeader1);  
        
        //textField KM_Kembali
        txtKmKembali = new JTextField();
        txtKmKembali.setBounds(150, 343, 190, 25);
        panel.add(txtKmKembali);
        
        lblNamaPengguna = new JLabel("Nama Pengguna/Sopir");
        lblNamaPengguna.setBounds(400, 90, 150, 50);
        lblNamaPengguna.setFont(new Font("Tahoma", Font.PLAIN, 12));
        panel.add(lblNamaPengguna);
        
        //textField KM_Kembali
        txtNamaPengguna = new JTextField();
        txtNamaPengguna.setBounds(550, 103, 190, 25);
        panel.add(txtNamaPengguna);
        
        lblTujuan = new JLabel("Tujuan/Trayek");
        lblTujuan.setBounds(400, 130, 150, 50);
        lblTujuan.setFont(new Font("Tahoma", Font.PLAIN, 12));
        panel.add(lblTujuan);
        
        //textField KM_Kembali
        txtTujuan = new JTextField();
        txtTujuan.setBounds(550, 143, 250, 25);
        panel.add(txtTujuan);
        
        lblDataKerusakan = new JLabel("Data Kerusakan");
        lblDataKerusakan.setBounds(400, 170, 150, 50);
        lblDataKerusakan.setFont(new Font("Tahoma", Font.PLAIN, 12));
        panel.add(lblDataKerusakan);
        
        //textField KM_Kembali
        txtDataKerusakan = new JTextField();
        txtDataKerusakan.setBounds(550, 183, 250, 25);
        panel.add(txtDataKerusakan);
        
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(400, 220, 135, 50);
        panel.add(btnSubmit);
        
        btnSubmit.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                mdlTrans = new ModelTransaksi();
                if (mdlTrans.peminjamanKendaraan(new Pengguna(txtNoTransaksi.getText(), txtNoTransaksi.getText(), txtNoKendaraan.getText(), txtTujuan.getText(), Integer.parseInt(txtKmBerangkat.getText()), txtNamaKendaraan.getText(), txtWarna.getText(), txtThnKendaraan.getText(), txtNamaPengguna.getText(), txtDataKerusakan.getText(),Integer.parseInt(txtKmKembali.getText())))){
                    JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan", "Info", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Data Gagal Disimpan", "Info", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        
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
                JOptionPane.showMessageDialog(null, "Anda Sudah Berada Di Form Tersebut", "Info", JOptionPane.INFORMATION_MESSAGE);
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
                InputData.showForm();
                sembunyi();
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
    
    void sembunyi(){
        this.setVisible(false);
        this.dispose();
    }
    
}
