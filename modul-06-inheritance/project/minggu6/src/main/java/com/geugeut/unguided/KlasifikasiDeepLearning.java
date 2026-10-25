package com.geugeut.unguided;

public class KlasifikasiDeepLearning extends Klasifikasi {
    private int jumlahLayer;

    public KlasifikasiDeepLearning(String nama, int jumlahDataLatih,
                                   int jumlahKelas, int jumlahLayer) {
        super(nama, jumlahDataLatih, jumlahKelas);
        this.jumlahLayer = jumlahLayer;
    }

    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Jumlah layer: " + this.jumlahLayer);
    }

    public int hitungBiayaKomputasi() {
        return super.hitungBiayaKomputasi() + (this.jumlahLayer * 200);
    }
}