package Aula_02_2020;

import static Aula_02_2020.Ex_04_Inverter.exibeVetor;
import static Aula_02_2020.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_2020.Ex_04_Inverter.leVetorAleatorio;
import java.util.Scanner;

public class Ex_08_Inters_Uniao {
    public static void main(String[] args) {
        int tamanho1 = leInteiroPositivo();
        int tamanho2 = leInteiroPositivo();
        int tamanho3 = tamanho1 > tamanho2 ? tamanho2 : tamanho1;
        
        int v1[] = leVetorAleatorio(tamanho1);
        int v2[] = leVetorAleatorio(tamanho2);
        int v3[] = new int[tamanho3];
        
        int intersecV1eV2[] = Intersec(v1, v2, v3);
        
        exibeVetor(v1);
        exibeVetor(v2);
        exibeVetor(intersecV1eV2);
    }
    public static int[] Intersec(int v1[], int v2[], int v3[]){
        int fimLoop = v3.length;
        int k = 0;
        for(int i = 0; i < fimLoop; i++) {
            for(int j = 0; j < fimLoop; j++)
            if(v1[i] == v2[j]){
                v3[k] = v1[i];
                k++;
            }
        }
        
        return v3;
    }
}
