/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_2020;

import static Aula_02_2020.Ex_04_Inverter.exibeVetor;
import static Aula_02_2020.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_2020.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author marcelo.ablsantos
 */
public class Ex_09_2020_Intercalacao {
    public static void main(String[] args) {
       int n1=leInteiroPositivo();
       int v1[];
       v1=leVetorAleatorio(n1);
       exibeVetor(v1);
       bubbleSort(v1);
       exibeVetor(v1);
       int n2=leInteiroPositivo();
       int v2[];
       v2=leVetorAleatorio(n2);
       exibeVetor(v2);
       bubbleSort(v2);
       exibeVetor(v2);
       int intercala[]=new int[v1.length+v2.length];
       intercalar2Vetores(v1,v2,intercala);
       exibeVetor(intercala);
    }
    public static void bubbleSort(int []v){
        for(int i=0;i<v.length-1;i++){ //n-1 vezes
            for (int j=0;j<v.length-1-i;j++){
                if(v[j]>v[j+1]){
                    //trocar
                    int aux=v[j];
                    v[j]=v[j+1];
                    v[j+1]=aux;
                }
            }
        }
    }

    public static void intercalar2Vetores(int[] v1, int[] v2, int[] intercala) {
       int i=0,j=0,k=0;
       //Enquanto houver elementos em um dos vetores
       while (i<v1.length && j<v2.length){
           if(v1[i]<v2[j]){
               intercala[k]=v1[i];
               i++; k++;
           }
            else {
               intercala[k]=v2[j];
               j++; k++;    
            }
        }
       //Analisar as sobras de v1
       while (i<v1.length){
           intercala[k]=v1[i];
           i++; k++;
       }
       //Analisar as sobras de v2
       while (j<v2.length){
           intercala[k]=v2[j];
           j++; k++;
       }
    }       
}
