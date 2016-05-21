package view;

import classes.Kendaraan;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import model.ModelKendaraan;


public class SearchKendaraan extends JFrame{
    ModelKendaraan mdKend;
    
    JLabel subTitle1;
    JLabel lblBerdasarkan,lblKataKunci;
    JButton btnSearch;
    JTextField txtBerdasarkan, txtKataKunci;
    String [] isiComboBox = {"Pilih opsi cari","No Kendaraan","Nama Kendaraan","No Polisi", "No Mesin","Warna","Tahun Kendaraan"};
    JComboBox cbBerdasarkan = new JComboBox(isiComboBox);
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
        this.setDefaultLookAndFeelDecorated(true);
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
            ImageIcon iconz = new ImageIcon("images/logo.png");
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
        mdKend = new ModelKendaraan();
        final JPanel panel = new JPanel();
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
        
        cbBerdasarkan.setBounds(10, 70, 310, 25);
        panel.add(cbBerdasarkan);
        
        txtKataKunci = new JTextField();
        txtKataKunci.setBounds(400, 70, 310, 25);
        panel.add(txtKataKunci);
        
        btnSearch = new JButton("Cari Kendaraan");
        btnSearch.setBounds(10, 120, 150, 50);
        panel.add(btnSearch);
        
        final DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        
        //btn action listener
        btnSearch.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String atrSearch;
                if (cbBerdasarkan.getSelectedItem().equals("No Kendaraan")) {
                    atrSearch = "no_kendaraan";
                    //System.out.println(atrSearch);
                }else if(cbBerdasarkan.getSelectedItem().equals("Nama Kendaraan")){
                    atrSearch = "nama_kendaraan";
                    //System.out.println(atrSearch);
                }else if(cbBerdasarkan.getSelectedItem().equals("No Polisi")){
                    atrSearch = "no_polisi";
                    //System.out.println(atrSearch);
                }else if(cbBerdasarkan.getSelectedItem().equals("No Mesin")){
                    atrSearch = "no_mesin";
                    //System.out.println(atrSearch);
                }else if(cbBerdasarkan.getSelectedItem().equals("Warna")){
                    atrSearch = "warna";
                    //System.out.println(atrSearch);
                }else if(cbBerdasarkan.getSelectedItem().equals("Tahun Kendaraan")){
                    atrSearch = "tahun_kendaraan";
                    //System.out.println(atrSearch);
                }else{
                    atrSearch = "";
                }
                String [] newColumnNames = {"No","No Kendaraan", "Nama Kendaraan", "No. Plat Polisi", "Tahun Beli", "Warna"};
                Kendaraan [] kend = mdKend.fetchByAttr(atrSearch, txtKataKunci.getText());
                
                
                String [][] iseng = new String[kend.length][6];
                
                for (int i = 0; i < iseng.length; i++) {
                    iseng[i][0] = Integer.toString(i);
                    iseng[i][1] = kend[i].getNoKendaraan();
                    iseng[i][2] = kend[i].getNamaKendaraan();
                    iseng[i][3] = kend[i].getPlatNomor();
                    iseng[i][4] = kend[i].getThnKendaraan();
                    iseng[i][5] = kend[i].getWarna();
                }
  
                DefaultTableModel model = new DefaultTableModel(iseng, newColumnNames);
                gridView.setModel(model);
                centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
                gridView.getColumnModel().getColumn(0).setPreferredWidth(25);
                gridView.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                model.fireTableDataChanged();
                
            }
        });
        
        
        //start table
        String [] columnNames = {"No","No Kendaraan", "Nama Kendaraan", "No. Plat Polisi", "Tahun Beli", "Warna"};
        Kendaraan [] kend = mdKend.fetchAll();

                String [][] iseng = new String[kend.length][6];
                
                for (int i = 0; i < iseng.length; i++) {
                    iseng[i][0] = Integer.toString(i);
                    iseng[i][1] = kend[i].getNoKendaraan();
                    iseng[i][2] = kend[i].getNamaKendaraan();
                    iseng[i][3] = kend[i].getPlatNomor();
                    iseng[i][4] = kend[i].getThnKendaraan();
                    iseng[i][5] = kend[i].getWarna();
                }
        
        //DefaultTableModel tableModel = new DefaultTableModel(columnNames, 6);
        gridView = new JTable(iseng, columnNames);
        
        gridView.getColumnModel().getColumn(0).setPreferredWidth(25);
        

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
