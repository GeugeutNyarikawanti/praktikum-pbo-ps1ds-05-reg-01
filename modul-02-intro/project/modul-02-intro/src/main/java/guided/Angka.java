/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided;

/**
 *
 * @author Geugeut
 */
public class Angka {

    public static void main(String[] args) {
        int i;
        System.out.println("Hasil For: ");
        for (i = 1; i <= 10; i++) {
            System.out.println(Integer.toString(i));
        }
        i = 1;
        System.out.println("Hasil While: ");
        while (i <= 0) {
            System.out.println(Integer.toString(i));
            i++;
        }
        i = 1;
        System.out.println("Hasil Do While: ");
        do {
            System.out.println(Integer.toString(i));
            i++;
        } while (i <= 0);
    }
}
