package mochila;

import java.util.Scanner;
 
public class Mochila {
    int v[][];
    int conta;
    String Atributos[][];
    
    
    public int max(int n, int m){
        if (n>m){
            return n;
        }else {
        return m;
        }
    }
    
    public int[][] Mochila (int cantidad, int pesos , int peso[], int valores[]){
        int pes[] =peso;
        int valor[] = valores;
        int n = cantidad;
        int w= pesos;
        v = new int [cantidad+1][pesos+1];
        Atributos= new String [cantidad+1][pesos+1];
        //Llena de 0 la matriz de productos
        for(int i = 0; i<n+1; i++){
            for(int j = 0; j<w+1; j++){
                v[0][j] = 0;
                v[i][0] = 0;
                Atributos[i][j] = "0";
            }
        }
        
        //Calcula los valores
        
        for(int i = 1; i<n+1; i++){
            for(int j = 1; j<w+1; j++){
                if(j>=peso[i]){

                    v[i][j] = max(v[i-1][j],v[i-1][j-peso[i]]+valor[i]);
                    
                    if(v[i-1][j]>v[i-1][j-peso[i]]+valor[i]){
                        Atributos[i][j] = "0+"+v[i-1][j];
                    }else{
                        Atributos[i][j] = v[i-1][j-peso[i]]+"+"+valor[i];
                    }
                    
                }else{
                    v[i][j]=v[i-1][j];
                    Atributos[i][j] = "0+"+v[i-1][j];
                }
            }
        }
        
        return v;
    }
   
    public int[] ContaBur(int a[]){
        conta=0;
        int i,j;
        int N=a.length;
        int temp;
        //metodo de ordenamiendo burbuja
        conta=conta+4;
        for(i=0;i<N-1 ; i++) {
            conta=conta+6;
            for(j=i+1; j < N; j++) {
                conta=conta+5;
                if(a[i] > a[j]) {
                    conta=conta+7;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }         
        return a;
    }
    public String[][] atri(){
        return Atributos;
    }
    
    
    
}
