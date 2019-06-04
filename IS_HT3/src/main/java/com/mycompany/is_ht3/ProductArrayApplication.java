/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.is_ht3;

import java.util.Arrays;

/**
 *
 * @author mariajose
 */
public class ProductArrayApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        System.out.println("Probando: {1,2,3,4,5}  el resultado es: " + Arrays.toString(calculateProductArrayBasic(new long[]{1,2,3,4,5})));
        System.out.println("Probando: {}  el resultado es: " + Arrays.toString(calculateProductArrayBasic(new long[]{})));
        System.out.println("Probando: {0}  el resultado es: " + Arrays.toString(calculateProductArrayBasic(new long[]{0})));
        System.out.println("Probando: {1}  el resultado es: " + Arrays.toString(calculateProductArrayBasic(new long[]{1})));
        System.out.println("Probando: {1,2}  el resultado es: " + Arrays.toString(calculateProductArrayBasic(new long[]{1,2})));
        System.out.println("Probando: {null}  el resultado es: " + Arrays.toString(calculateProductArrayBasic(new long[]{})));
        System.out.println("Probando: {0}  el resultado es: " + Arrays.toString(calculateProductArrayBasic(new long[]{0})));
        System.out.println("Probando: {1,0,3,0,5}  el resultado es: " + Arrays.toString(calculateProductArrayBasic(new long[]{1,0,3,0,5})));
        System.out.println("Probando: {1,2,3,0,5}  el resultado es: " + Arrays.toString(calculateProductArrayBasic(new long[]{1,2,3,0,5})));
       
    }
    
    public static long[] calculateProductArrayBasic(long[] input){
        
        if(input!=null){       
        long[] Array1 = new long[input.length];
        long[] Array2 = new long[input.length];
        
        long[] Resultados =new long[input.length];
        
        for (int i=0; i<input.length;i++){
            Array1 = Arrays.copyOfRange(input, 0, i);
            Array2 = Arrays.copyOfRange(input, i+1, input.length);

            long[] ArrayFinal = new long[Array1.length+Array2.length];
            System.arraycopy( Array1, 0, ArrayFinal, 0, Array1.length );
            System.arraycopy( Array2, 0, ArrayFinal, Array1.length, Array2.length );


            long total = Arrays.stream(ArrayFinal).reduce((a, b) -> a * b).orElse(1);
            Resultados[i]=total;
                }
                    return Resultados ;
             }
                return null;
        
        }
    
}
