package com.geugeut.unguided;

public class Model {
    private String nama;
    private int jumlahDataLatih;

    public Model(String nama, int jumlahDataLatih) {
        this.nama = nama;
        this.jumlahDataLatih = jumlahDataLatih;
    }

    public String getNama() {
        return this.nama;
    }

    public int getJumlahDataLatih() {
        return this.jumlahDataLatih;
    }

    public void tampilkanInformasi() {
        System.out.println(
            "Model: " + this.nama
            + " | Data latih: " + this.jumlahDataLatih
        );
    }

    // Overloading tanpa parameter
    public int hitungBiayaKomputasi() {
        return this.jumlahDataLatih * 2;
    }

    // Overloading dengan parameter epoch
    public int hitungBiayaKomputasi(int epoch) {
        return this.jumlahDataLatih * epoch;
    }
}