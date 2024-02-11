/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gd4_11360;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author edward
 */
public class GD4_11360 {

    /**
     * @param args the command line arguments
     */

     public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        
        int jmlhPanen, waktPanen, jmlhBeratIkat, lamaLayar, usia;
        String nama, noTelp;

        Petani ptn[] = new Petani[2];
        Nelayan nlyn[] = new Nelayan[2];

        try{

            
            for(int i=0; i<2; i++){
                System.out.println("\n");
                System.out.println("Nama              : "); nama = br.readLine();
                System.out.println("Umur              : "); usia = Integer.parseInt(br.readLine());
                System.out.println("No Telp           : "); noTelp = br.readLine();
                System.out.println("Jumlah Panen      : "); jmlhPanen = Integer.parseInt(br.readLine());
                System.out.println("Waktu Panen       : "); waktPanen = Integer.parseInt(br.readLine());

                ptn[i] = new Petani(nama, usia, noTelp, jmlhPanen, waktPanen);
            }

            for(int i=0; i<2; i++){
                System.out.println("\n");
                System.out.println("Nama              : "); nama = br.readLine();
                System.out.println("Umur              : "); usia = Integer.parseInt(br.readLine());
                System.out.println("No Telp           : "); noTelp = br.readLine();
                System.out.println("Jumlah Berat Ikan : "); jmlhBeratIkat = Integer.parseInt(br.readLine());
                System.out.println("Lama Layar        : "); lamaLayar = Integer.parseInt(br.readLine());
                nlyn[i] = new Nelayan(nama, usia, noTelp, jmlhBeratIkat, lamaLayar);
            }

            System.out.println("\n");
            System.out.println("\t Data Petani");
            for(int i=0; i<2; i++){
                ptn[i].showDataPetani();
                System.out.println("\n");
            }

            System.out.println("\t Data Nelayan");
            for(int i=0; i<2; i++){
                nlyn[i].showDataNelayan();
                System.out.println("\n");
            }

            System.out.println("************************************************************");
            
        }catch(Exception e) {}
    }
}

