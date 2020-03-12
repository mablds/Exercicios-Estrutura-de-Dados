/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03_2020;

import Aula_02_2020.Ex_04_Inverter;

/**
 *
 * @author marcelo.ablsantos
 */
public class Ex_04_MaiorDifVetor {
    public static void main(String[] args) {
        int n = Ex_04_Inverter.leInteiroPositivo();
        int v[] = Ex_04_Inverter.leVetorAleatorio(n);
        int dif;
        Ex_04_Inverter.exibeVetor(v);
        
        dif = maiorDiferenca(v);
        
        System.out.println(dif);
        
    }

    public static int maiorDiferenca(int[] v) {
        int indices[] = Ex_03_TrocaPosMaiorMenorVetor.encontraMaiorMenor(v);
        return v[indices[1]] - v[indices[0]];
    }
}
