package com.geugeut.unguided;

public class Regresi extends Model {
    private int jumlahFitur;

    public Regresi(String nama, int jumlahDataLatih, int jumlahFitur) {
        super(nama, jumlahDataLatih);
        this.jumlahFitur = jumlahFitur;
    }

    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Jumlah fitur: " + this.jumlahFitur);
    }

    public int hitungBiayaKomputasi() {
        return super.hitungBiayaKomputasi() + (this.jumlahFitur * 10);
    }

    public int hitungBiayaKomputasi(int epoch, int ukuranBatch) {
        return getJumlahDataLatih() * epoch / ukuranBatch;
    }
}