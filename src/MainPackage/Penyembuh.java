/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

/**
 *
 * @author db2admin067
 */
public class Penyembuh extends Pahlawan{

    
    public Penyembuh(String nama){
        this.nama=nama;
        this.setSenjata(null);
        this.setKepala(null);
        this.setBadan(null);
        this.setKaki(null);
    }
    @Override
    public void aksi() {
        if(this.getSenjata()==null){
            System.out.println(this.nama+" tidak dapat menyembuhkan");
        }else{
            System.out.println(this.nama+" menyembuhkan rekannya menggunakan "+this.getSenjata());
        }
    }
    
}
