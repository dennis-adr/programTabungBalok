/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author katoa
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    float tinggi;

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public Balok(float tinggi, float panjang, float lebar) {
        super(lebar, panjang);
        this.tinggi = tinggi;
    }

    @Override
    public float volume() {
        return this.luas()*tinggi;
    }    

    @Override
    public float luasPermukaan() {
         return 2*(this.luas()+lebar*tinggi+panjang*tinggi);
    }

}