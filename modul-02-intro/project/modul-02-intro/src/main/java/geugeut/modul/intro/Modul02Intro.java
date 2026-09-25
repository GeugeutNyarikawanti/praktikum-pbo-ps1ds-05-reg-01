package geugeut.modul.intro;

public class Modul02Intro {

    public static void main(String[] args) {
        //cara mendeklarasikan variabel (1)
        int[] VarArray1;
        VarArray1 = new int[5];
        VarArray1 [0] = 11;
        
        //Cara mendeklarasikan variabel (2)
        int[] VarArray2 = new int[5];
        
        //Cara mendeklarasikan variabel (3)
        int[] VarArray3 = {1, 2, 3, 4, 5};
        
        System.out.println("Nih di sini: " + VarArray3[3]);
        
        //ARRAY 2 DIMENSI
        int[][] Arr2d = new int [2][2];
        Arr2d[0][0] = 10;
        Arr2d[0][1] = 20;
        Arr2d[1][0] = 30;
        Arr2d[1][1] = 40;
        
        System.out.println("Nilai Baris 1 Kolom 2: " + Arr2d[0][1]);
    }
}