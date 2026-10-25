package com.geugeut.unguided;

public class Main {
    public static void main(String[] args) {
        Regresi regresi = new Regresi(
            "Regresi Linier", 500, 4
        );

        Klasifikasi klasifikasi = new Klasifikasi(
            "Decision Tree", 800, 3
        );

        KlasifikasiDeepLearning neuralNetwork =
            new KlasifikasiDeepLearning(
                "Neural Network", 1000, 5, 3
            );

        Model[] daftarModel = {
            regresi,
            klasifikasi,
            neuralNetwork
        };

        int totalBiaya = 0;

        for (Model model : daftarModel) {
            model.tampilkanInformasi();

            int biaya = model.hitungBiayaKomputasi();
            System.out.println("Biaya komputasi: " + biaya);
            System.out.println("--------------------");

            totalBiaya += biaya;
        }

        System.out.println("Total biaya: " + totalBiaya);

        Model modelNeuralNetwork = daftarModel[2];
        System.out.println(
            "Biaya 10 epoch (Neural Network): "
            + modelNeuralNetwork.hitungBiayaKomputasi(10)
        );

        Regresi modelRegresi = (Regresi) daftarModel[0];

        System.out.println(
            "Biaya 10 epoch (Regresi Linier): "
            + modelRegresi.hitungBiayaKomputasi(10)
        );

        System.out.println(
            "Biaya 10 epoch batch 50 (Regresi Linier): "
            + modelRegresi.hitungBiayaKomputasi(10, 50)
        );
    }
}