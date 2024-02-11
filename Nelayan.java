/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gd4_11360;

/**
 *
 * @author edward
 */
public class Nelayan extends Manusia{
    private int jumlahBeratIkan;
    private int lamaLayar;

    public Nelayan(String nama, int umur, String noTelp, int jumlahBeratIkan, int lamaLayar){
        super(nama, umur, noTelp);
        this.jumlahBeratIkan = jumlahBeratIkan;
        this.lamaLayar = lamaLayar;
    }
    
    public double totalPendapatanNelayan(){
        return (jumlahBeratIkan * 10000) - (lamaLayar * 1000);
    }

    public void showDataNelayan(){
        showDataManusia();
        System.out.println("Jumlah Berat Ikan : " + jumlahBeratIkan);
        System.out.println("Lama Layar        : " + lamaLayar);
        System.out.println("Total Gaji        : " + totalPendapatanNelayan());
    }

}

