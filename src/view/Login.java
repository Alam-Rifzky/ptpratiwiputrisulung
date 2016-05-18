package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Login extends JFrame {
    JLabel logo,lblUsername,lblPassword;
    JTextField txtUsername;
    JPasswordField txtPassword;
    JButton btnSubmit,btnReset;
    
    File currentDirectory = new File(new File(".").getAbsolutePath());
    
    public Login() {
        try {
            
            this.setSize(350, 250);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel root = this.pRoot();

            root.add(pNorth(),BorderLayout.NORTH);
            root.add(pCenter(),BorderLayout.CENTER);
            //root.add(pSouth(),BorderLayout.SOUTH);
            
            this.add(root);
            //this.add(coba);
            //this.setVisible(true);          
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    

    JPanel pRoot(){
        JPanel panel = new JPanel(new BorderLayout(5, 5));
        
        return panel;
    }
    
    JPanel pNorth(){
        JPanel panel = new JPanel(new GridLayout(1, 1));
        try {
            ImageIcon iconz = new ImageIcon(currentDirectory.getCanonicalPath()+"\\src\\images\\logo.png");
            logo = new JLabel(iconz,JLabel.CENTER);
            panel.add(logo);
            return panel;
        } catch (Exception e) {
            return panel;
        }
    }
    
    JPanel pCenter(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        lblUsername = new JLabel("Username: ");
        lblPassword = new JLabel("Password: ");
        txtUsername = new JTextField();
        txtPassword = new JPasswordField();
        btnSubmit = new JButton("Login");
        btnReset = new JButton("Reset");
        
        lblUsername.setBounds(10, 10, 80, 25);
        panel.add(lblUsername);
        
        lblPassword.setBounds(10, 50, 80, 25);
        panel.add(lblPassword);
        
        txtUsername.setBounds(120, 10, 180, 25);
        panel.add(txtUsername);
        
        txtPassword.setBounds(120, 50, 180, 25);
        panel.add(txtPassword);
        
        btnSubmit.setBounds(120, 90, 70, 30);
        panel.add(btnSubmit);
        
        btnReset.setBounds(200, 90, 70, 30);
        panel.add(btnReset);
        
        //action listener
        
        btnSubmit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtUsername.getText().equals("rifzky")&&txtPassword.getText().equals("alam")) {
                    Login.showForm("tutup");
                    MyMenu.showForm("buka");
                    destroyMe();
                }else{
                    JOptionPane.showMessageDialog(null, "Anda tidak terdaftar dalam sistem", "Error Message", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        return panel;
    }
    
    void destroyMe(){
        this.setVisible(false);
        this.dispose();
    }
    
    public static void showForm(String jenis){
        Login cb = new Login();
        if (jenis.equals("buka")) {
            cb.setVisible(true);
        }else if(jenis.equals("tutup")){
            cb.setVisible(false);
            cb = null;
        }
    }
    
    public static void hideForm(){
        
    }
    
}
