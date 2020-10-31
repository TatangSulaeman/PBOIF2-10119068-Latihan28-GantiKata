/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119068.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Program ganti Kata
 */
public class PBOIF210119068Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        
        String gantiKata,kalimat,kataHasil;
        System.out.println("----------Program Ganti Kata----------");
        
        System.out.print("Masukan Kalimat\t : ");
        kalimat = keyboard.nextLine();
        
        System.out.print("Ganti Kata\t : ");
        gantiKata = keyboard.nextLine();
        
        System.out.print("Menjadi Kata\t : ");
        kataHasil = keyboard.nextLine();
        
        System.out.println("-----------Hasil Formatting-----------");
        System.out.println("Kalimat Awal : " + kalimat);
        System.out.println("Kalimat Baru : " + kalimat.replace(gantiKata,kataHasil));
        System.out.println("DIBUAT OLEH TATANG SULAEMAN");
    }
    
}

