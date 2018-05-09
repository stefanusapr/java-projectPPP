package Structural;

import MainPackage.*;

/**
 *
 * @author User
 */
public class AhliPakaian extends AhliPerlengkapan{
    
    private Pahlawan pahlawan;
    
    public AhliPakaian(Pahlawan pahlawan){
        this.pahlawan = pahlawan;
    }
    
    @Override
    public void buat(Creational.AkademiPahlawan.kelas k) {
        switch(k){
            case KESATRIA: this.pahlawan.badan = "zirah";break;
            case PEMANAH: this.pahlawan.badan = "kostum pemanah";break;
            case PENYEMBUH: this.pahlawan.badan = "kostum penyihir";break;
        }
        System.out.println("pelindung badan "+this.pahlawan.badan+" telah dibuat untuk "+this.pahlawan.nama);
    }
    
}
