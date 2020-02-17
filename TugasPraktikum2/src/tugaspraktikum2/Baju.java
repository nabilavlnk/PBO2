/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum2;

/**
 *
 * @author Asus
 */
public class Baju extends Barang{
    int harga, harga_baju;
    
    void setHargabaju( int jumlah){
        this.harga_baju = 120000 * jumlah;
    }
    
    int gettotalharga(){
        return this.harga_baju;
    }
}
