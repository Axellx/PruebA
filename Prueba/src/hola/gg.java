/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola;

import java.util.Scanner;

/**
 *
 * @author Usser
 */
public class gg {

   static Scanner entrada = new Scanner(System.in);
    static int pregunta1(int[] vec, int n, int mayornum)
    {
        if(n==0 && vec[n]>mayornum)
            return vec[n];
        else if (n==0 )
            return mayornum;
        
        else{
            if(vec [n] > mayornum)
                mayornum = vec[n];
            return pregunta1(vec, n-1, mayornum);       
        }
       }
  
    public static void main(String[] args) {
        int n;
        System.out.println("Ingresa el valor de n");
        n=entrada.nextInt();
        int [] vec = new int[n];
        for(int i=0; i <n; i++){
            vec[i]= (int)(Math.random()*1001);
            System.out.println(vec[i]+"\t");
            
        }
        
        System.out.println("El mayor numero es: "+pregunta1(vec,n-1,vec[0]));
    }
    
}
