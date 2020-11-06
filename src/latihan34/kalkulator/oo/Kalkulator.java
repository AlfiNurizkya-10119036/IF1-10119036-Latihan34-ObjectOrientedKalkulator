/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan34.kalkulator.oo;

/**
 *
 * @author Alfi Nurizkya
 * NAMA     : ALFI NURIZKYA
 * KELAS    : IF-1
 * NIM      : 10119036
 * DESKRIPSI PROGRAM : Membuat Program Kalkulator Berbasis Object Oriented
 */

import java.util.Scanner;
public class Kalkulator {

      public static void main(String[] args) {
	    Latihan34KalkulatorOO kalkulator = new Latihan34KalkulatorOO();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("====Aplikasi Kalkulator Bilangan===");
	    System.out.print("Masukkan Angka ke-1 : ");
	    kalkulator.value1 = scan.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kalkulator.value2 = scan.nextDouble();
        System.out.println("\nHasil Pertambahan : " + kalkulator.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + kalkulator.kurangBilangan());
        System.out.println("Hasil Perkalian : " + kalkulator.kaliBilangan());
        System.out.println("Hasil Pembagian : " + kalkulator.bagiBilangan());
        System.out.println("Hasil Sisa : " + kalkulator.sisaBilangan());
    }
}