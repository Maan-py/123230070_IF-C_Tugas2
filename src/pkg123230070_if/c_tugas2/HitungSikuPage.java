/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123230070_if.c_tugas2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author Maan
 */
public class HitungSikuPage extends JFrame implements ActionListener{
    
    // deklarasi
    JTextField inputAlas, inputTinggi;
    JLabel labelAlas, labelTinggi, resultLabel;
    JButton resultButton;
    public HitungSikuPage() {
        setTitle("Halaman Hitung Siku");
        setLayout(null);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        
        // inisialisasi
        labelAlas = new JLabel("Masukkan alas : ");
        inputAlas = new JTextField();
        labelTinggi = new JLabel("Masukkan tinggi : ");
        inputTinggi = new JTextField();
        resultButton = new JButton("Hitung");
        
        resultLabel = new JLabel("");
        
        // menambahkan ke frame
        add(labelAlas);
        add(inputAlas);
        add(labelTinggi);
        add(inputTinggi);
        add(resultButton);
        add(resultLabel);
        
        // tambahkan action ke button
        resultButton.addActionListener(this);
        
        // atur posisi
        labelAlas.setBounds(10, 10, 120, 20);
        inputAlas.setBounds(130, 10, 120, 20);
        labelTinggi.setBounds(10, 60, 120, 20);
        inputTinggi.setBounds(130, 60, 120, 20);
        resultButton.setBounds(10, 100, 120, 20);
        resultLabel.setBounds(10, 140, 200, 20);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        // ketika tombol result diklik
       if(event.getSource() == resultButton) {
           try {
               // ambil input dan konversi ke double
               double alas = Double.parseDouble(inputAlas.getText().trim());
               double tinggi = Double.parseDouble(inputTinggi.getText().trim());

               // pangkatkan kedua input
               double alasKuadrat = Math.pow(alas, 2);
               double tinggiKuadrat = Math.pow(tinggi, 2);

               // kemudian tambahkan input yang sudah dikuadratkan, lalu akarkan
               double result = Math.sqrt(alasKuadrat + tinggiKuadrat);
               
               // tampilkan hasil
               resultLabel.setText("Hasil hitung siku-siku : " + result);
               
               // lempar error ketika input tidak sesuai
           } catch(Exception Error) {
               // tampilkan pesan jadi label
               resultLabel.setText("Input harus berupa angka!");
               
                // tampilkan error di terminal
               System.out.println(Error.getMessage());
           }
       }
    }
}
