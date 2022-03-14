/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author katoa
 */
public class Lingkaran implements MenghitungBidang {
    float jari;

    public float getJari() {
        return jari;
    }

    public void setJari(float jari) {
        this.jari = jari;
    }
    
    public Lingkaran(float jari) {
        this.jari = jari;
    }

    @Override
    public float luas() {
        return (float) (Math.PI*jari*jari);
    }

    @Override
    public float keliling() {
        return (float) (2*Math.PI*jari);
    }
}