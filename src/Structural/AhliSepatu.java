package Structural;

import MainPackage.Pahlawan;

/**
 *
 * @author User
 */
public class AhliSepatu extends AhliPerlengkapan{
    
    private Pahlawan pahlawan;
    
    public AhliSepatu(Pahlawan pahlawan){
        this.pahlawan = pahlawan;
    }
    
    @Override
    public void buat(Creational.AkademiPahlawan.kelas k) {
        switch(k){
            case KESATRIA: this.pahlawan.kaki = "sepatu baja";break;
            case PEMANAH: this.pahlawan.kaki = "sepatu boot";break;
            case PENYEMBUH: this.pahlawan.kaki = "sepatu heels";break;
        }
        System.out.println("Pelindung kaki "+this.pahlawan.kaki+" telah dibuat untuk "+this.pahlawan.nama);
    }
    
}
