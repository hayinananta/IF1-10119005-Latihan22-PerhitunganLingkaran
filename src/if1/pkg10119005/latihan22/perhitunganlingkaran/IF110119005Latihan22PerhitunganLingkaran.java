/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan22.perhitunganlingkaran;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Perhitungan Lingkaran
 */
public class IF110119005Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double luasLingkaran, jariJariLingkaran, keliling;
        String diameter = null;
        boolean valid=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Perhitungan Lingkaran======");
        while (valid==false){
            System.out.print("Masukkan nilai diameter lingkaran : ");
             diameter = scanner.next();
            try{
            Double.parseDouble(diameter);
            valid=true;
            }catch(NumberFormatException e){
                System.out.println("Nilai Diameter Tidak Sesuai");
            valid=false;
         }    
        }
        System.out.println("");
        luasLingkaran = Math.PI * Math.pow(Double.parseDouble(diameter), 2);
        jariJariLingkaran = Math.sqrt(luasLingkaran / Math.PI);
        keliling = 2 * Math.PI * jariJariLingkaran;
        System.out.println("=====Hasil Perhitungan Lingkaran======");
        System.out.println("Jari-jari lingkaran = " + jariJariLingkaran);
        
        System.out.println("Luas lingkaran = " + luasLingkaran);
        System.out.println("Keliling lingkaran = " + keliling);
        
        
    }
    
}
