
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author katoa
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("+--------------------------+");
        System.out.println("| Program Balok dan Tabung |");
        System.out.println("+--------------------------+");
        do {
            System.out.println("");
            System.out.println("--- Menu Utama ---");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih : ");
            int Menu=in.nextInt();
            int ulang;
            switch(Menu){
                case 0:
                    System.exit(0);
                    break;
                case 1: 
                    do {
                        System.out.println("");
                        System.out.println("--- Menu Hitung Balok ---");
                        System.out.printf("Input Panjang: ");
                        float panjang = in.nextFloat();
                        System.out.printf("Input Lebar: ");
                        float lebar = in.nextFloat();
                        System.out.printf("Input Tinggi: ");
                        float tinggi = in.nextFloat();
                        Balok balokk = new Balok(tinggi, panjang, lebar);
                        System.out.println("--- HASIL PERHITUNGAN ---");
                        System.out.println("Luas Persegi Panjang     = " + balokk.luas());
                        System.out.println("Keliling Persegi Panjang = " + balokk.keliling());
                        System.out.println("Volume Balok             = " + balokk.volume());
                        System.out.println("Luas Permukaan Balok     = " + balokk.luasPermukaan());
                        System.out.println("");
                        System.out.println("Ulangi? (Ya:1 || Tidak: 0)");
                        System.out.print("Pilih : ");
                        ulang = in.nextInt();
                    } while (ulang!=0);
                    break;
                case 2:
                    do{
                        System.out.println("");
                        System.out.println("--- Menu Hitung Tabung ---");
                        System.out.printf("Input Tinggi   : ");
                        float tinggi = in.nextFloat();
                        System.out.printf("Input Jari-jari: ");
                        float jari = in.nextFloat();
                        Tabung tabungg = new Tabung(tinggi, jari);
                        System.out.println("--- HASIL PERHITUNGAN ---");
                        System.out.println("Luas Lingkaran        = " + tabungg.luas());
                        System.out.println("Keliling Lingkaran    = " + tabungg.keliling());
                        System.out.println("Volume Tabung         = " + tabungg.volume());
                        System.out.println("Luas Permukaan Tabung = " + tabungg.luasPermukaan());
                        System.out.println("");
                        System.out.println("Ulangi Menu 2 (Ya:1 || Tidak: 0)? ");
                        System.out.print("Pilih : ");
                        ulang = in.nextInt();
                    }while(ulang!=0);
                    break;
                default:
                    System.out.println("Mohon masukkan Opsi dengan Benar!");
            }
        } while (true);
        

    }
}
