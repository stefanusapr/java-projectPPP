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
public class Pemanah extends Pahlawan{

    public Pemanah(String nama){
        this.nama=nama;
        this.setSenjata(null);
        this.setKepala(null);
        this.setBadan(null);
        this.setKaki(null);
    }
    @Override
    public void aksi() {
        if(this.getSenjata()==null){
            System.out.println(this.nama+" tidak dapat membidik");
        }else{
            System.out.println(this.nama+" mengenai sasaran menggunakan senjata "+this.getSenjata());
        }
    }
    
}
