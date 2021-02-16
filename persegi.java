import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ardha Nur Fajri
 */
public class persegi {
    static void hitung(){
        Scanner input=new Scanner(System.in);
        double luas;
        System.out.println("____________");
        System.out.println("Luas Persegi");
        System.out.println("____________");
        System.out.print("Masukkan nilai sisi: ");
        int sisi=input.nextInt();
        luas=sisi*sisi;
        System.out.println("Luas Persegi adalah "+luas);
    }
}
