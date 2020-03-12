/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_05_2020;

import Aula_02_2020.Ex_04_Inverter;

/**
 *
 * @author marcelo.ablsantos
 */
public class Ex_06_SomaDigitos {
    public static void main(String[] args) {
        int n = Ex_04_Inverter.leInteiroPositivo();
        System.out.println(somaDigitos(n));
    }

    public static int somaDigitos(int n) {
        if(n < 100) {
            return n;
        }
        return (n % 10) + somaDigitos(n / 10);
    }
}
