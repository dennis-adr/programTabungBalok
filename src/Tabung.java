/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author katoa
 */
public class Tabung extends Lingkaran implements MenghitungRuang {
    float tinggi;

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public Tabung(float tinggi, float jari) {
        super(jari);
        this.tinggi = tinggi;
    }

    @Override
    public float volume() {
         return (float) (this.luas()*tinggi);
    }    

    @Override
    public float luasPermukaan() {
        return (float) (2*Math.PI*jari*(jari+tinggi));
    }
    
}