/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gd4_11360;

/**
 *
 * @author edward
 */
public class Manusia {
    protected String nama;
    protected int umur;
    protected String noTlp;

    public Manusia(String nama, int umur, String noTlp){
        this.nama = nama;
        this.umur = umur;
        this.noTlp = noTlp;
    }

    public void showDataManusia(){
        System.out.println("Nama              : " + nama);
        System.out.println("Umur              : " + umur);
        System.out.println("No Telp           : " + noTlp);
    }

}

