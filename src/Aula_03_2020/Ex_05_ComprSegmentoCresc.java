/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03_2020;

import static Aula_02_2020.Ex_04_Inverter.exibeVetor;
import static Aula_02_2020.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_2020.Ex_04_Inverter.leVetor;

/**
 *
 * @author marcelo.ablsantos
 */
public class Ex_05_ComprSegmentoCresc {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetor(n);
        int tamanho = 1;
        exibeVetor(v);
        
        tamanho = maiorSegCrescente(v);
        System.out.println(tamanho);
    }

    public static int maiorSegCrescente(int[] v) {
        int max = 1;
        int count = 1;
        
        for(int i = 0; i < v.length - 1; i++){
            if(v[i] < v[i + 1]) {
                count++;
            } else if (count > max) {
                max = count;
                count = 1;
            }
        }
        if(count > max) {
            max = count;
        }
        return max;
    }
}
