/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg17_4;

import java.util.Scanner;

/**
 *
 * @author slagogonzalez
 */
public class DNI {
    private int DNI;
    private final char[] letras={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
    private final int[] numeros={3,20,11,9,22,7,4,18,13,21,19,5,12,8,16,1,15,0,17,2,10,6,14};
    
    public void pedirDNI(){
        Scanner obx = new Scanner(System.in);
        System.out.println("Introduce el numero de su DNI : ");
        DNI=obx.nextInt();
    }
    public void calcularLetra(){
        int numero = DNI%23;
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]==numero){
                System.out.println("Tu letra es " + letras[i]);
        
    }
}
    }
}

