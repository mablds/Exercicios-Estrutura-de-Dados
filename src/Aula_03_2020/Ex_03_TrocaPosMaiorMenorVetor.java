/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03_2020;

import static Aula_02_2020.Ex_04_Inverter.exibeVetor;
import static Aula_02_2020.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_2020.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author marcelo.ablsantos
 */
public class Ex_03_TrocaPosMaiorMenorVetor {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
    }
    
    public static void trocaPosMaiorMenorVetor(int[] v){
        int indices[] = encontraMaiorMenor(v);
        int iMaior = indices[1];
        int iMenor = indices[0];
        int aux;
        
        for(int i = 0; i < v.length; i++){
            if(v[i] > v[iMaior]) {
                iMaior = i;
            }
            if(v[i] < v[iMenor]) {
                iMenor = i;
            }
        }
        
        aux = v[iMenor];
        v[iMenor] = v[iMaior];
        v[iMaior] = aux;
    }
    
    public static int[] encontraMaiorMenor(int v[]){
        int indices[] = new int[2];
        
        for(int i = 0; i < v.length; i++) {
            if(v[i] < v[indices[0]]) {
                indices[0] = i;
            }
            if(v[i] > v[indices[1]]) {
                indices[1] = i;
            }
        }
        return indices;
    }
    
}
