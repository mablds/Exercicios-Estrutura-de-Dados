package Aula_02_2020;

import java.util.Scanner;

public class Ex_04_Inverter {
    public static void main(String[] args) {
       int n = leInteiroPositivo();
       int v[] = leVetorAleatorio(n);
       exibeVetor(v);
       inverteVetor(v);
       exibeVetor(v);
    }
    
    public static int leInteiroPositivo() {
        int n;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Informe o tamanho do vetor: ");
            n = input.nextInt();
        } while(n <= 0 && n > 100);
        return n;
    }
    
    public static int[] leVetor(int n){
        int v[] = new int[n];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < v.length; i++){
            System.out.printf("v[%d]= \n", i);
            v[i] = input.nextInt();
        }
        return v;
    }
    
    public static int[] leVetorAleatorio(int n){
        int v[] = new int[n];
        for(int i = 0; i < v.length; i++){
            v[i] = (int)(Math.random() * 50);
        }
        return v;
    }
    
    public static void exibeVetor(int[] v) {
        System.out.println("Os elementos do vetor são: \n");
        for(int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }
    
    public static void exibeVetorTam(int[] v, int tamanho) {
        System.out.println("Os elementos do vetor são: \n");
        for(int i = 0; i < tamanho; i++) {
            System.out.print(v[i] + " ");
        }
    }
    
    public static void inverteVetor(int[] v) {
        int temp;
        for(int i = 0; i < v.length / 2; i++){
            temp = v[i];
            v[i] = v[v.length - 1 - i];
            v[v.length - 1 - i] = temp;
        }
    }
}
