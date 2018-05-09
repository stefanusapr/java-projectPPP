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
public class Kesatria extends Pahlawan{

    public Kesatria(String nama){
        this.nama=nama;
        this.setSenjata(null);
        this.setKepala(null);
        this.setBadan(null);
        this.setKaki(null);
    }
    @Override
    public void aksi() {
        if(this.getSenjata()==null){
            System.out.println(this.nama+" tidak dapat menyerang");
        }else{
            System.out.println(this.nama+" menghenuskan musuh menggunakan senjata "+this.getSenjata());
        }
    }
    
}
