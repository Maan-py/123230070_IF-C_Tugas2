/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123230070_if.c_tugas2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Maan
 */
    public class LoginPage extends JPanel implements ActionListener {

    // Deklarasi varibel
    JLabel usernameLabel;
    JLabel passwordLabel;
    JLabel result;
   
    JTextField usernameInput;
    JTextField passwordInput;
    
    JButton loginButton;
    
    boolean isLogin = false;
    public LoginPage() {
        // Layout
        setLayout(null);
        
        // Inisialisasi
        usernameLabel = new JLabel("Username : ");
        passwordLabel = new JLabel("Password : ");
        
        usernameInput = new JTextField(10);
        passwordInput = new JTextField(10);
        
        loginButton = new JButton("Masuk");
        
        // tambahkan action untuk tombol login
        loginButton.addActionListener(this);
        
        result = new JLabel("");
        
        // Atur posisi(x, y, width, height)
        usernameLabel.setBounds(10, 10, 80, 20);
        usernameInput.setBounds(90, 10, 120, 20);
        passwordLabel.setBounds(10, 60, 80, 20);
        passwordInput.setBounds(90, 60, 120, 20);
        
        loginButton.setBounds(10, 120, 80, 20);
        
        result.setBounds(10, 150, 250, 20);
        
        // Tambahkan tiap komponen ke frame
        add(usernameLabel);
        add(usernameInput);
        add(passwordLabel);
        add(passwordInput);
        add(loginButton);

        add(result);
    }
    
    public void actionPerformed(ActionEvent event) {
        // ketika tombol diklik
        if(event.getSource() == loginButton){
            // dapatkan input dari textfield kemudian masukkan ke variabel
            String username = usernameInput.getText().trim();
            String password = passwordInput.getText().trim();
            // cek apakah username atau password tidak kosong
            if(!username.isEmpty() && !password.isEmpty()) {
                // jika username dan password adalah tukang_070
                if(username.equals("tukang_070" )&& password.equals("tukang_070" )) {
                    // ganti tulisan result
                    result.setText("Berhasil login!");
                    // mendapatkan panel sebagai frame, karena panel tidak bisa di-setVisible
                    Window window = SwingUtilities.getWindowAncestor(this);
                    // kalau window sudah termasuk frame dan login berhasil
                    if (window instanceof JFrame) {
                        // hilangkan page login
                        window.setVisible(false);
                        
                        // buat page baru untuk menu hitung siku
                        HitungSikuPage hitungSikuPage = new HitungSikuPage();
                        // tampilkan page baru
                        hitungSikuPage.setVisible(true);
                    }
                } else {
                    // kalau username atau password bukan tukang_070
                    result.setText("Username atau password salah!");
                }
                // kalau username atau password kosong
            } else {
                result.setText("Masukkan username dan password!");
            }
        }
    }
}
