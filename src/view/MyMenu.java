package view;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class MyMenu extends JFrame {
    JLabel logo,lblUsername,lblNama;
    
    File currentDirectory = new File(new File(".").getAbsolutePath());
    
    
    public MyMenu() {
        this.setSize(350, 250);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel root = pRoot();
        root.add(pNorthPanel(),BorderLayout.NORTH);
        root.add(pbody(),BorderLayout.CENTER);
        
        this.add(root);
        
        this.setJMenuBar(this.myMenu());
        this.add(root);
        
        //this.setVisible(true);
    }
    
    public static void showForm(String jenis){
        MyMenu menu = new MyMenu();
        if (jenis.equals("buka")) {
            menu.setVisible(true);
        }else if(jenis.equals("tutup")){
            menu.setVisible(false);
            menu.dispose();
        }
        
    }
    
    JPanel pRoot(){
        JPanel panel = new JPanel(new BorderLayout(5, 5));
        
        return panel;
    }
    
    JPanel pNorthPanel(){
        JPanel panel = new JPanel();
        //panel.setLayout(null);
        
        try {
            ImageIcon iconz = new ImageIcon(currentDirectory.getCanonicalPath()+"\\src\\images\\logo.png");
            logo = new JLabel(iconz,JLabel.CENTER);
            panel.add(logo);
            panel.setBorder(new EmptyBorder(0, 5, 0, 0));
            return panel;
        }catch (Exception e) {
            return panel;
        }
        
    }
    
    JPanel pbody(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        lblUsername = new JLabel("Username:");
        lblUsername.setBounds(10, -20, 80, 50);
        panel.add(lblUsername);
        
        lblNama = new JLabel("Rifzky Alam");
        lblNama.setBounds(90, -20, 80, 50);
        panel.add(lblNama);
        
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
