package MainPackage;

import Creational.*;
import Structural.*;
/**
 *
 * @author db2admin067
 */
public class WalikotaWallington {
    public static void main(String[] args) {
        AkademiPahlawan ap=new AkademiPahlawan();
        Pahlawan a=ap.kirimPahlawan(AkademiPahlawan.kelas.KESATRIA);
        a.tampilkanIdentitas();
        AhliSenjata as=new AhliSenjata(a);
        AhliKepala ak=new AhliKepala(a);
        AhliPakaian apk=new AhliPakaian(a);
        AhliSepatu asp=new AhliSepatu(a);
        a.aksi();
        as.buat(AkademiPahlawan.kelas.KESATRIA);
        ak.buat(AkademiPahlawan.kelas.KESATRIA);
        apk.buat(AkademiPahlawan.kelas.KESATRIA);
        asp.buat(AkademiPahlawan.kelas.KESATRIA);
        a.aksi();
        
        Pahlawan b=ap.kirimPahlawan(AkademiPahlawan.kelas.PEMANAH);
        b.tampilkanIdentitas();
        b.aksi();
        as = new AhliSenjata(b);
        as.buat(AkademiPahlawan.kelas.PEMANAH);
        b.aksi();
        
        Pahlawan c=ap.kirimPahlawan(AkademiPahlawan.kelas.PENYEMBUH);
        c.tampilkanIdentitas();
        c.aksi();
        as = new AhliSenjata(c);
        as.buat(AkademiPahlawan.kelas.PENYEMBUH);
        c.aksi();
    }
}
