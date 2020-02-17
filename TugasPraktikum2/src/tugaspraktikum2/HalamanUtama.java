/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum2;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class HalamanUtama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baju baju = new Baju();
        Celana celana = new Celana();
        
        System.out.println("KASIR");
        System.out.println("PILIHAN MENU");
        System.out.println("1. Baju");
        System.out.println("2. Celana");
        System.out.println("Pilih = ");
        Scanner myObj = new Scanner(System.in);
        double pilih;
        pilih = myObj.nextDouble();
        
        if(pilih == 1){
            System.out.println("BAJU");
            System.out.println("Harga 1 Baju = 120.000 ");
            System.out.println("==================");
            System.out.println("Jumlah Baju = ");
            int jumlah;
            jumlah = myObj.nextInt();
            baju.setHargabaju(jumlah);
            System.out.println("Total bayar = " + baju.gettotalharga());
        }
        else if(pilih == 2){
            System.out.println("CELANA");
            System.out.println("Harga 1 Celana = 100.000 ");
            System.out.println("==================");
            System.out.println("Jumlah Celana = ");
            int jumlah2;
            jumlah2 = myObj.nextInt();
            celana.setHargacelana(jumlah2);
            System.out.println("Total bayar = " + celana.gettotalharga());
        }
    }
    
}
