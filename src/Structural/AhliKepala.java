package Structural;

import MainPackage.*;

/**
 *
 * @author User
 */
public class AhliKepala extends AhliPerlengkapan{

    private Pahlawan pahlawan;
    
    public AhliKepala(Pahlawan pahlawan){
        this.pahlawan = pahlawan;
    }
    
    @Override
    public void buat(Creational.AkademiPahlawan.kelas k) {
        switch(k){
            case KESATRIA: this.pahlawan.kepala = "helm";break;
            case PEMANAH: this.pahlawan.kepala = "topi pemanah";break;
            case PENYEMBUH: this.pahlawan.kepala = "topi penyihir";break;
        }
        System.out.println("Pelindung kepala "+this.pahlawan.kepala+" telah dibuat untuk "+this.pahlawan.nama);
    }
    
}
