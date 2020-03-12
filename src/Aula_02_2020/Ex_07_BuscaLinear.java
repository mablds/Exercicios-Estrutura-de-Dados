package Aula_02_2020;

import static Aula_02_2020.Ex_04_Inverter.exibeVetor;
import static Aula_02_2020.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_2020.Ex_04_Inverter.leVetorAleatorio;
import java.util.Scanner;

public class Ex_07_BuscaLinear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = leInteiroPositivo();
        int v[] = leVetorAleatorio(t);
        int n;
        int i;
        exibeVetor(v);
        
        System.out.println("\nValor que deseja buscar: ");
        n = input.nextInt();
        
        i = buscaLinear(v, n);
        
        if(i >= 0) {
            System.out.printf("Valor encontrado na posição: %d\n", i);
        } else {
            System.out.println("Valor não encontrado");
        }
    }
    
    public static int buscaLinear(int v[], int n){
        for(int i = 0; i < v.length; i++) {
            if(v[i] == n){
                return i;
            }
        }
        return -1;
    }
}
