package Structural;

import MainPackage.*;

/**
 *
 * @author User
 */
public class AhliSenjata extends AhliPerlengkapan{

    private Pahlawan pahlawan;
    
    public AhliSenjata(Pahlawan pahlawan){
        this.pahlawan = pahlawan;
    }
    
    @Override
    public void buat(Creational.AkademiPahlawan.kelas k) {
        switch(k){
            case KESATRIA: this.pahlawan.senjata = "pedang";break;
            case PEMANAH: this.pahlawan.senjata = "busur panah";break;
            case PENYEMBUH: this.pahlawan.senjata = "tongkat";break;
        }
        System.out.println("Senjata "+this.pahlawan.senjata+" telah dibuat untuk "+this.pahlawan.nama);
    }
    
}
