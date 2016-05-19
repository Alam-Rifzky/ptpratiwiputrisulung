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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import sun.swing.table.DefaultTableCellHeaderRenderer;


public class SearchKendaraan extends JFrame{
    
    
    JLabel subTitle1;
    JLabel lblBerdasarkan,lblKataKunci;
    JButton btnSearch;
    JTextField txtBerdasarkan, txtKataKunci;
    JTable gridView;
    String myForm = "SearchKendaraan";
    
    public SearchKendaraan() {
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
        new SearchKendaraan().setVisible(true);
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
        //panel.setLayout(null);
        
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
        
        subTitle1 = new JLabel("Data Kendaraan");
        subTitle1.setFont(new Font("Tahoma", Font.BOLD, 14));
        subTitle1.setBounds(10, -20, 150, 80);
        panel.add(subTitle1);
        
        lblBerdasarkan = new JLabel("Berdasarkan");
        lblBerdasarkan.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblBerdasarkan.setBounds(10, 30, 100, 50);
        panel.add(lblBerdasarkan);
        
        lblBerdasarkan = new JLabel("Kata Kunci");
        lblBerdasarkan.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblBerdasarkan.setBounds(400, 30, 100, 50);
        panel.add(lblBerdasarkan);
        
        //textBox
        txtBerdasarkan = new JTextField();
        txtBerdasarkan.setBounds(10, 70, 310, 25);
        panel.add(txtBerdasarkan);
        
        txtKataKunci = new JTextField();
        txtKataKunci.setBounds(400, 70, 310, 25);
        panel.add(txtKataKunci);
        
        btnSearch = new JButton("Cari Kendaraan");
        btnSearch.setBounds(10, 120, 150, 50);
        panel.add(btnSearch);
        
        //start table
        String [] columnNames = {"No","No Kendaraan", "Nama Kendaraan", "No. Plat Polisi", "Tahun Beli", "Warna"};
        Object [][] rows = {
                             {"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"}
                            };
        //DefaultTableModel tableModel = new DefaultTableModel(columnNames, 6);
        gridView = new JTable(rows, columnNames);
        
        gridView.getColumnModel().getColumn(0).setPreferredWidth(25);
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        gridView.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        //gridView.setBounds(10, 120, 700, 300);
        //gridView.getColumn(0).setPreferredWidth(30);
        JScrollPane scrollPane = new JScrollPane(gridView);
        scrollPane.setBounds(10, 190, 700, 300);
        panel.add(scrollPane);
        //panel.add(gridView);
        
        //end tabel
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
                InputData.showForm();
                sembunyi();
            }
        });
        
        JMenuItem cari = new JMenuItem("Cari");
        menuCar.add(cari);
        cari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Anda Sudah Berada Di Form Tersebut", "Info", JOptionPane.INFORMATION_MESSAGE);
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
