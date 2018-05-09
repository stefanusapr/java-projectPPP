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
public abstract class Pahlawan {
    
    public String nama;
    public String senjata;
    public String kepala;
    public String badan;
    public String kaki;
    
    
    public abstract void aksi();
    public void tampilkanIdentitas(){
        String kelas=this.getClass().getName();
        String editKelas=kelas.substring(12, kelas.length());
        System.out.println("Nama pahlawan: "+nama);
        System.out.println("Kelas: "+editKelas);
    }
    public void setSenjata(String s){this.senjata=s;}
    public void setKepala(String k){this.kepala=k;}
    public void setBadan(String b){this.badan=b;}
    public void setKaki(String k){this.kaki=k;}
    public String getSenjata(){return this.senjata;}
    public String getKepala(){return this.kepala;}
    public String getBadan(){return this.badan;}
    public String getKaki(){return this.kaki;}
}
