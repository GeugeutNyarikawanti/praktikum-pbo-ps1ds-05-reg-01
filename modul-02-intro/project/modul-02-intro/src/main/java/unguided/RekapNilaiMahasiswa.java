package unguided;

public class RekapNilaiMahasiswa {
    public static void main(String[] args){
        final Double KKM = 75.0; 
        String[] NamaMahasiswa = {"Andi", "Budi", "Citra"};
        Double[][] NilaiModul = {{80.0, 70.0, 90.0}, {85.0, 65.0, 90.0}, {0.0, 0.0, 0.0}};
        
        int k, b;
        for (k = 0; k <= 2; k++) {
            for (b = 0; b <=1; b++){
                NilaiModul[2][k] += NilaiModul[b][k];
            }
            NilaiModul[2][k] /= 2;
        }
        
        k = 0;
        b = 0;
        System.out.println("REKAP NILAI PRAKTIKUM");
        System.out.println("KKM: " + KKM);
        while (k<=2){
            System.out.println("\nMahasiswa " + (k+1) + ": " + NamaMahasiswa[k]);
            System.out.println("Nilai Modul 1   : " + NilaiModul[b][k]);
            System.out.println("Nilai Modul 2   : " + NilaiModul[b+1][k]);
            System.out.println("Rata-rata       : " + NilaiModul[b+2][k]);
            
            if (NilaiModul[b+2][k] > KKM){
                System.out.println("Status          : LULUS");
            } else {
                System.out.println("Status          : REMEDIAL");
            }
            
            k++;
        }
    }
}
