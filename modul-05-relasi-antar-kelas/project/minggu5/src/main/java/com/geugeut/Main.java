package com.geugeut;

import com.geugeut.guided.agregasi.*;
import com.geugeut.guided.asosiasi.*;
import com.geugeut.guided.komposisi.*;

public class Main {
    public static void main(String[] args) {
        runAsosiasi();
    }

    public static void runAsosiasi(){
        Mahasiswa2 m = new Mahasiswa2();

        m.setNim("130118383");
        m.setNama("Budi");

        Dosen d = new Dosen();
        d.giveScore(m, 90);

        System.out.println("Nim :" + m.getNim());
        System.out.println("Nama :" + m.getNama());
        System.out.println("Nilai :" + d.getScore(m));

    }

    public static void runAgregasi(){
        Mahasiswa m1 = new Mahasiswa("130118383", "Caca");
        Mahasiswa m2 = new Mahasiswa("130118384", "Al");

        Jurusan j1 = new Jurusan("SD", "Sains Data");
        j1.tambahMahasiswa(m1);
        j1.tambahMahasiswa(m2);

        j1.displayMahasiswa();
    }


    public static void runKomposisi(){
        Komputer pc = new Komputer("Intel Core i7", 3200, "LG UltraGear", "Logitech", "Wireless");
        
        pc.displaySpecKomputer();
    }
}