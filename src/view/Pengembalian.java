package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
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
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Pengembalian extends JFrame{
    
    
    JLabel subTitle1,subTitle2,subTitle3;
    JLabel lblWelcome,lblNoTransaksi,lblTanggal,lblNoKend,lblNamaKend,lblThnKend,lblWarna,lblKMBerangkat,lblNamaSupir,
           lblTujuan,lblPassengger,lblKmLimit,lblKmLimitValue,lblSisaKm,lblSisaKmValue;
    JTextField txtNoKendaraan,txtNamaKendaraan,txtThnKendaraan,txtWarna,txtKmBerangkat,txtNamaSupir,
                txtTujuan,txtPassengger;
    JButton btnProses;
    
    public Pengembalian() {
        this.setSize(750, 700);
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
        new Pengembalian().setVisible(true);
    }
    
    void sembunyi(){
        this.setVisible(false);
        this.dispose();
    }
    
    public void hideForm(){
        this.setVisible(false);
    }
    
    JPanel pRoot(){
        JPanel panel = new JPanel(new BorderLayout(5, 5));
        
        return panel;
    }
    
    JPanel pNorthPanel(){
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        //panel.setLayout(null);
        JLabel logo;
        File currentDirectory = new File(new File(".").getAbsolutePath());
        try {
            ImageIcon iconz = new ImageIcon(currentDirectory.getCanonicalPath()+"\\src\\images\\logo.png");
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
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        lblWelcome = new JLabel("Selamat Datang");
        lblWelcome.setBounds(10, -30, 100, 100);
        panel.add(lblWelcome);
        
        subTitle1 = new JLabel("Form Pengembalian Barang");
        subTitle1.setFont(new Font("Tahoma", Font.BOLD, 14));
        subTitle1.setBounds(10, 0, 200, 100);
        panel.add(subTitle1);
        
        lblNoTransaksi = new JLabel("No Transaksi");
        lblNoTransaksi.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblNoTransaksi.setBounds(10, 30, 200, 100);
        panel.add(lblNoTransaksi);
        
        lblTanggal = new JLabel("Tanggal");
        lblTanggal.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblTanggal.setBounds(10, 60, 200, 100);
        panel.add(lblTanggal); 
        
        subTitle2 = new JLabel("Data Kendaraan");
        subTitle2.setFont(new Font("Tahoma", Font.BOLD, 12));
        subTitle2.setBounds(10, 90, 200, 100);
        panel.add(subTitle2);
        
        lblNoKend = new JLabel("No Kendaraan");
        lblNoKend.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblNoKend.setBounds(10, 120, 200, 100);
        panel.add(lblNoKend);
        
        //textField No_Kendaraan
        txtNoKendaraan = new JTextField();
        txtNoKendaraan.setBounds(150, 157, 270, 25);
        panel.add(txtNoKendaraan);
        
        lblNamaKend = new JLabel("Nama Kendaraan");
        lblNamaKend.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblNamaKend.setBounds(10, 160, 200, 100);
        panel.add(lblNamaKend);
        
        //textField namaKendaraan
        txtNamaKendaraan = new JTextField();
        txtNamaKendaraan.setBounds(150, 197, 270, 25);
        panel.add(txtNamaKendaraan);
        
        lblThnKend = new JLabel("Tahun Kendaraan");
        lblThnKend.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblThnKend.setBounds(10, 200, 200, 100);
        panel.add(lblThnKend);
        
        //textField tahunKendaraan
        txtThnKendaraan = new JTextField();
        txtThnKendaraan.setBounds(150, 237, 270, 25);
        panel.add(txtThnKendaraan);
        
        lblWarna = new JLabel("Warna Kendaraan");
        lblWarna.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblWarna.setBounds(10, 240, 200, 100);
        panel.add(lblWarna);  
        
        //textField warna
        txtWarna = new JTextField();
        txtWarna.setBounds(150, 277, 270, 25);
        panel.add(txtWarna);
        
        lblKMBerangkat = new JLabel("KM Berangkat");
        lblKMBerangkat.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblKMBerangkat.setBounds(10, 280, 200, 100);
        panel.add(lblKMBerangkat); 
        
        //textField warna
        txtKmBerangkat = new JTextField();
        txtKmBerangkat.setBounds(150, 317, 270, 25);
        panel.add(txtKmBerangkat);
        
        subTitle3 = new JLabel("Data Pengguna");
        subTitle3.setFont(new Font("Tahoma", Font.BOLD, 12));
        subTitle3.setBounds(10, 320, 200, 100);
        panel.add(subTitle3);   
        
        lblNamaSupir = new JLabel("Nama Pengguna");
        lblNamaSupir.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblNamaSupir.setBounds(10, 350, 200, 100);
        panel.add(lblNamaSupir); 
        
        //textField NamaSopir
        txtNamaSupir = new JTextField();
        txtNamaSupir.setBounds(150, 387, 270, 25);
        panel.add(txtNamaSupir);        
        
        lblTujuan = new JLabel("Tujuan/Trayek");
        lblTujuan.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblTujuan.setBounds(10, 390, 200, 100);
        panel.add(lblTujuan); 
        
        //textField tujuan
        txtTujuan = new JTextField();
        txtTujuan.setBounds(150, 427, 270, 25);
        panel.add(txtTujuan);

        lblPassengger = new JLabel("Passenger");
        lblPassengger.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblPassengger.setBounds(10, 430, 200, 100);
        panel.add(lblPassengger); 
        
        //textField tujuan
        txtPassengger = new JTextField();
        txtPassengger.setBounds(150, 467, 270, 25);
        panel.add(txtPassengger);
        
        btnProses = new JButton("Proses");
        btnProses.setBounds(10, 500, 410, 50);
        panel.add(btnProses);

        lblSisaKm = new JLabel("KM Limit");
        lblSisaKm.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblSisaKm.setBounds(550, 130, 200, 100);
        panel.add(lblSisaKm);
        
        lblSisaKmValue = new JLabel("0");
        lblSisaKmValue.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblSisaKmValue.setBounds(580, 160, 200, 100);
        panel.add(lblSisaKmValue);
        
        lblSisaKm = new JLabel("KM Sisa");
        lblSisaKm.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblSisaKm.setBounds(550, 220, 200, 100);
        panel.add(lblSisaKm);
        
        lblSisaKmValue = new JLabel("0");
        lblSisaKmValue.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblSisaKmValue.setBounds(580, 250, 200, 100);
        panel.add(lblSisaKmValue);
        
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
                Pengembalian.showForm();
                sembunyi();
            }
        });
        
        JMenuItem pengembalian = new JMenuItem("Pengembalian");
        transactionMenu.add(pengembalian);
        pengembalian.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Anda Sudah Berada Di Form Tersebut", "Info", JOptionPane.INFORMATION_MESSAGE);
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
    
}
