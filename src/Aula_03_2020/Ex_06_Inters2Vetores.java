/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03_2020;

import Aula_02_2020.Ex_04_Inverter;
import static Aula_02_2020.Ex_04_Inverter.exibeVetor;
import static Aula_02_2020.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_2020.Ex_04_Inverter.leVetor;

/**
 *
 * @author marcelo.ablsantos
 */
public class Ex_06_Inters2Vetores {
    public static void main(String[] args) {
        int n1 = leInteiroPositivo();
        int v1[] = leVetor(n1);
        exibeVetor(v1);
        int n2 = leInteiroPositivo();
        int v2[] = leVetor(n2);
        exibeVetor(v2);
        
        inter2Vetores(v1, v2);
    }
    
    public static void inter2Vetores(int[] v1, int[] v2){
        int i = 0;
        int j = 0;
        while(i < v1.length && j < v2.length){
            if(v1[i] == v2[j]){
                System.out.print(v1[i] + " ");
                i++;
                j++;
            } else {
                if(v1[i] < v2[j]){
                    i++;
                } else {
                    j++;
                }
                System.out.println("}");
            }
        }
    }
}
