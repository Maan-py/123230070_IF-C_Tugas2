/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg123230070_if.c_tugas2;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Maan
 */
public class Main extends JFrame {
    public Main() {
        setTitle("Halaman Login");
        add(new LoginPage());
        
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Main();
    }
    
}
