/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gd4_11360;

/**
 *
 * @author edward
 */
public class Petani extends Manusia{
    private int jumlahPanen;
    private int waktuPanen;

    public Petani(String nama, int umur, String noTelp, int jumlahPanen, int waktuPanen){
        super(nama, umur, noTelp);
        this.jumlahPanen = jumlahPanen;
        this.waktuPanen = waktuPanen;
    }

    public double totalPendapatan(){
        return (jumlahPanen*3000) - (waktuPanen*1000);
    }

    public void showDataPetani(){
        showDataManusia();
        System.out.println("Jumlah Panen      : " + jumlahPanen);
        System.out.println("Waktu panen       : " + waktuPanen);
        System.out.println("Total Gaji        : Rp." + totalPendapatan());
    }
    
}

