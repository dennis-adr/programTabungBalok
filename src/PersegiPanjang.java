/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author katoa
 */
public class PersegiPanjang implements MenghitungBidang {
    float panjang;
    float lebar;

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public PersegiPanjang(float panjang, float lebar) {
        this.lebar = lebar;
        this.panjang = panjang;
    }

    @Override
    public float luas() {
        return panjang*lebar;
    }

    @Override
    public float keliling() {
        return 2*(panjang+lebar);
    }
}
