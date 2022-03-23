/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KalkulatorBalok;

/**
 *
 * @author HP
 */
import java.awt.event.*;
import javax.swing.*;


public class Tampilan extends JFrame implements ActionListener {

    JLabel ljudul = new JLabel("PROGRAM KALKULATOR BALOK");
    JLabel nama = new JLabel("037_HartantaSembiring");
    JLabel lpanjang = new JLabel("Masukkan Panjang");
    JTextField tfpanjang = new JTextField(15);
    JLabel llebar = new JLabel("Masukkan Lebar");
    JTextField tflebar = new JTextField(15);
    JLabel ltinggi = new JLabel("Masukkan Tinggi");
    JTextField tftinggi = new JTextField(15);
    JLabel lhasil = new JLabel("Hasil");
    JLabel lluas = new JLabel();
    JLabel lkeliling = new JLabel();
    JLabel lluaspermukaan = new JLabel();
    JLabel lvolume = new JLabel();
    JButton btnhitung = new JButton("Hitung");
    JButton btnreset = new JButton("Reset");

    public Tampilan() {
        
        setTitle("Program Kalkulator Balok");
        setSize(600, 600);
        setLayout(null);
        add(nama);
        add(ljudul);
        add(lpanjang);
        add(tfpanjang);
        add(llebar);
        add(tflebar);
        add(ltinggi);
        add(tftinggi);
        add(lhasil);
        add(lluas);
        add(lkeliling);
        add(lluaspermukaan);
        add(lvolume);
        add(btnhitung);
        add(btnreset);

        ljudul.setBounds(214,20,200,25);
        nama.setBounds(250, 40, 200, 20);
        lpanjang.setBounds(40,67,150,25);   
        tfpanjang.setBounds(180,70,270,25);
        
        llebar.setBounds(40,118,150,25);
        tflebar.setBounds(180,120,270,25);

        ltinggi.setBounds(40,167,150,25);
        tftinggi.setBounds(180,170,270,25);

        lhasil.setBounds(298,210,200,25);

        lluas.setBounds(50,240,300,25);
        lkeliling.setBounds(50,280,300,25);
        lvolume.setBounds(50,320,300,25);
        lluaspermukaan.setBounds(50,360,300,25);

        btnhitung.setBounds(150,450,100,50);
        btnreset.setBounds(350,450,100,50);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnhitung.addActionListener(this);
        btnreset.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    double panjang, lebar, tinggi;
    if (e.getSource() == btnhitung) {
            if (tfpanjang.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Harap Masukkan Panjang !!");
            }
            else if (tflebar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Harap Masukkan Lebar !!");
            }
            else if (tftinggi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Harap Masukkan Tinggi !!");
            }
            else {
                try {
                    panjang = Double.parseDouble(tfpanjang.getText());
                    lebar = Double.parseDouble(tflebar.getText());
                    tinggi = Double.parseDouble(tftinggi.getText());

                    Balok balok = new Balok(panjang, lebar, tinggi);
                    lluas.setText("Luas Persegi Panjang             : " + balok.luas());
                    lkeliling.setText("Keliling Persegi Panjang        : " + balok.keliling());
                    lluaspermukaan.setText("Luas Permukaan Balok           : " + balok.luaspermukaan());
                    lvolume.setText("Volume Balok                           : " + balok.volume());
                }
                catch(NumberFormatException err){
                    JOptionPane.showMessageDialog(this, "Harap Masukkan angka !!");
                }
            }
        }

        if (e.getSource() == btnreset) {
            lluas.setText("");
            lkeliling.setText("");
            lluaspermukaan.setText("");
            lvolume.setText("");
            tfpanjang.setText("");
            tflebar.setText("");
            tftinggi.setText("");
        }
    
    }
    
}
