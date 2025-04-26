/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5602;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class Pertemuan5602 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek SegiTiga
        LuasSegiTiga SegiTiga01 = new LuasSegiTiga();

        // Meminta input dari pengguna untuk alas dan tinggi
        System.out.print("Masukkan nilai alas segitiga: ");
        SegiTiga01.alas = scanner.nextInt();

        System.out.print("Masukkan nilai tinggi segitiga: ");
        SegiTiga01.tinggi = scanner.nextInt();

        // Menampilkan hasil perhitungan luas segitiga
        System.out.println("Luas Segitiga: " + SegiTiga01.HitungLuas());

        // Menutup scanner
        scanner.close();
    }
    
}
