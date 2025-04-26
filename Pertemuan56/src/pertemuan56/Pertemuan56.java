/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan56;

/**
 *
 * @author M.Roji Taufiqul Hakim
 * 26-04-2025
 */
public class Pertemuan56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        manusia johan = new manusia("L");
        johan.warnakulit="kuning langsat";
        johan.SetWarnaRambut("Hitam");
        
        manusia yani = new manusia("P");
        yani.warnakulit="sawo matang";
        yani.SetWarnaRambut("Hitam");
        yani.tinggibadan="165cm";
        
    }
    
}
class manusia{
    public String warnakulit="";
    private String warnarambut="";
    private String jeniskelamin="";

    public manusia(String jkel){
        this.jeniskelamin = jkel;
    }
            
    public void SetWarnaRambut(String warna){
        this.warnarambut= warna;
    }
    public String tinggibadan="";
}
