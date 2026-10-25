package com.geugeut.unguided;

public class Klasifikasi extends Model {
    private int jumlahKelas;

    public Klasifikasi(String nama, int jumlahDataLatih, int jumlahKelas) {
        super(nama, jumlahDataLatih);
        this.jumlahKelas = jumlahKelas;
    }

    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Jumlah kelas: " + this.jumlahKelas);
    }

    public int hitungBiayaKomputasi() {
        return super.hitungBiayaKomputasi() * this.jumlahKelas;
    }
}