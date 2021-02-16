/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ardha Nur Fajri
 */
import java.util.Scanner;
public class main{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("__________________");
        System.out.println("Program Aritmatika");
        System.out.println("__________________");
        System.out.println("1. Luas Lingkaran");
        System.out.println("2. Luas Persegi");
        System.out.print("Masukkan pilihan: ");
        int i=input.nextInt();
        switch (i) {
            case 1:
                lingkaran.hitung();
                break;
            case 2:
                persegi.hitung();
                break;
            default:
                System.exit(0);
        }
  }
}