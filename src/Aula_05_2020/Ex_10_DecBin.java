/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_05_2020;

/**
 *
 * @author marcelo.ablsantos
 */
public class Ex_10_DecBin {
    public static void main(String[] args) {
        int bin;
        int dec;
    
        bin = decToBin(18);
        dec = binToDec(10010);
        
        System.out.println(bin);
        System.out.println(dec);
    }
    
    public static int decToBin(int dec){
        int bin = 0;
        int count = 0;
        while(dec > 0) {
            int resto = dec % 2;
            bin += resto * (int) Math.pow(10, count);
            count++;
            dec = dec / 2;
        }
        return bin;
    }
    
    public static int decToBinR(int dec) {
        if (dec < 2) {
            return dec;
        }
        return dec % 2 + 10 * decToBinR(dec / 2);
    }
    
    public static int binToDec(int bin) {
        int dec = 0;
        int count = 0;
        while(bin > 0) {
            int resto = dec % 10;
            dec += resto * (int) Math.pow(2, count);
            count++;
            bin = bin / 10;
        }
        return dec;
    }
    
    public static int binToDecR(int bin) {
        if(bin < 10) {
            return bin;
        }
        return bin % 10 + 2 * binToDecR(bin / 10);
    }
}
