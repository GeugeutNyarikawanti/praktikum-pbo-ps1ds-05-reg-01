/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided;

/**
 *
 * @author Geugeut
 */
public class Manusia {
    //Ga ada public static main karena classnya cuma akan jadi blue print, kaya struct gitu lah kalau di GO
    private String nama;
    private int tinggi;
    
    void setInfo(String nama, int tinggi) {
        this.nama = nama;
        this.tinggi = tinggi;
    }
    
    void info(){
        System.out.println(this.nama+ " Memiliki tinggi " + this.tinggi+ "cm");
    }
}
