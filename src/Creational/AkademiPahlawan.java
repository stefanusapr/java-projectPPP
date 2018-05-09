/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational;

import MainPackage.*;


/**
 *
 * @author db2admin067
 */
public class AkademiPahlawan {
    
    private String[] listNama={"Eren","Mikasa","Armin","Sasha","Reiner",
        "Levi","Arnold","Natsu","Lucy","Gray","Erza","Laxus","Erwin","Wendy",
        "Happy","Carla","Lily"};
    public enum kelas{
        KESATRIA,PEMANAH,PENYEMBUH
    }
    
    public Pahlawan kirimPahlawan(AkademiPahlawan.kelas k){
        String name=listNama[(int)(Math.random()*listNama.length)];
        switch(k){
            case KESATRIA:
                return new Kesatria(name);
            case PEMANAH:
                return new Pemanah(name);
            case PENYEMBUH:
                return new Penyembuh(name);
        }
        return null;
    }
}
