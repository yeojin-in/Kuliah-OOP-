/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan303;

/**
 *
 * @author M. Roji. T.H
 * Tgl 22 Maret 2025
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Pertemuan303 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String pilih = "a";
       
       System.out.println("Menu Pilihan");
       System.out.println("~~~~~~~~~~~~");
       System.out.println("A. Menu A");
       System.out.println("B. Menu B");
       System.out.println("C. Menu C");
       System.out.print("Silhakan Pilih menu:");
       //pilih = JOptionPane.showInputDialog("Pilih Menu");
       Scanner inp = new Scanner(System.in);
       pilih = inp.nextLine();
        switch (pilih) {
            case "A":
                System.out.println("Memilih Menu A");
                break;
            case "B":
                System.out.println("Memilih Menu B");
                break;
            case "C":
                System.out.println("Memilih Menu c");
                break;
            default:
                System.out.println("Pilihan Menu Tidak ada");               
        }
       // TODO code application logic here
    }
    
}
