
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
public class lingkaran {
    static void hitung(){
        Scanner input=new Scanner(System.in);
        double luas;
        System.out.println("______________");
        System.out.println("Luas Lingkaran");
        System.out.println("______________");
        System.out.print("Masukkan Jari - Jari: ");
        int jariJari=input.nextInt();
        luas=22*jariJari*jariJari/7;
        System.out.println("Luas Lingkaran adalah "+luas);
    }
}
