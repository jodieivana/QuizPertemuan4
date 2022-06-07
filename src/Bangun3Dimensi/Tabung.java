package Bangun3Dimensi;

import java.util.Scanner;

public class Tabung {
    private double tinggi, jari;
    final double pi = (double) 22/7;
    double volume, luas;
    Scanner data = new Scanner(System.in);

    public Tabung(){
        this.jari = 0;
        this.tinggi = 0;
    }

    public Tabung(double jari, double tinggi){
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public double getJari(){
        return this.jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getTinggi(){
        return this.tinggi;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public double getVolume(){
        return this.volume;
    }

    public double getLuas(){
        return this.luas;
    }

    public double hitungVolumeTabung ()
    {
        volume = pi * Math.pow(jari,2) * tinggi;
        return volume;
    }

    public double hitungLuasTabung ()
    {
        luas = 2 * pi * jari * (jari + tinggi);
        return luas;
    }
    
    public void tampilLuasTabung ()
    {
        System.out.println ("--------------------------------");
        System.out.println ("Jari = " + jari + "cm");
        System.out.println ("Tinggi = " + tinggi + "cm");
        System.out.println ("================================");
        System.out.println ("Luas = " + hitungLuasTabung() + "cm2");
    }
    
    public void tampilVolumeTabung ()
    {
        System.out.println ("--------------------------------");
        System.out.println ("Jari = " + jari + "cm");
        System.out.println ("Tinggi = " + tinggi + "cm");
        System.out.println ("================================");
        System.out.println ("Volume = " + hitungVolumeTabung () + "cm3");
    }
}
