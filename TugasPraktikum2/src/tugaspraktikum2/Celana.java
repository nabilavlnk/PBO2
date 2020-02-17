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
public class Celana extends Barang {
    int harga, harga_celana;
    
    void setHargacelana( int jumlah2){
        this.harga_celana = 100000 * jumlah2;
    }
    
    int gettotalharga(){
        return this.harga_celana;
    }
}
