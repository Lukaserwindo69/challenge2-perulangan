/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;

import java.util.Scanner;

/**
 *
 * @author KANG_SNAKE
 */
public class Challenge2 {

    /**
     * @param args the command line arguments
     */
    public class challenge2 {

        /**
         *
         * @param args
         */
           public static void main (String [] args) {
        int harian,laporan,ujian,akhir;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("masukkan nilai harian: ");
        harian = scanner.nextInt();
        harian = harian * 30 / 100;
        System.out.println("nilai harian:" + harian);
        System.out.println("masukkan nilai laporan: ");
        laporan = scanner.nextInt();
        laporan = laporan * 20 / 100 ;
        System.out.println("nilai laporan: "+ laporan);
        System.out.println("masukkan nilai ujian: ");
        ujian = scanner.nextInt();
        ujian = ujian * 50 / 100;
         System.out.println("nilai ujian: "+ ujian );
         akhir = harian + laporan + ujian;
         System.out.println("nilai akhir:" + akhir ) ;
         if (akhir <= 40) {
             System.out.println("anda mendapat predikat F");
             System.out.println("Anda tidak lulus , tingkatkan belajar anda");
             
         }
         
 }
             
         
        
        
 
        
        
        
        
    
