/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;
import jdk.nashorn.internal.ir.SplitNode;
import parcial.calculos.Calcular;
import parcial.calculos.Calculo;
import parcial.operaciones.Operaciones;
import parcial.operaciones.OperacionesBasicas;
import parcial.operaciones.OperacionesAvanza;
/**
 *
 * @author juanes
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculo calc = new Calculo();
        pruebaCalcular(calc,new OperacionesBasicas(calc));
        
        
       
    }
    
    public static void pruebaCalcular(Calcular calcul, OperacionesBasicas hol){
        System.out.println("Vamos a traducir los numeros de letras a enteros, asi que ingresa las palabras a continuacion");
        System.out.println("escrbe cuantos numeros quieras con un espacio entre las palabras y luego presiona enter");
        System.out.print("inserta tu operacion:");
        Scanner entradaEscaner = new Scanner (System.in);
        
        //hol.llenar(entradaEscaner.nextInt());
        String separacion = entradaEscaner.nextLine();
        
        System.out.println("-----Traduccion de numeros-----");
        String[] arbol = separacion.split(" ");
        System.out.println(Arrays.toString(arbol));
        System.out.println(separacion);
        
        int x=0;
        int[] guarda = null;
        for(int i=0;i<arbol.length;i++){
            
            switch(arbol[i]){
                case "cero":{
                    x=0;
                    break;
                }
                case "uno":{
                    x=1;
                    break;
                }
                case "dos":{
                    x=2;
                    break;
                }
                case "tres":{
                    x=3;
                    break;
                }
                case "cuatro":{
                    x=4;
                    break;
                }
                case "cinco":{
                    x=5;
                    break;
                }
                case "seis":{
                    x=6;
                    break;
                }
                case "siete":{
                    x=7;
                    break;
                }
                case "ocho":{
                    x=8;
                    break;
                }
                case "nueve":{
                    x=9;
                    break;
                }
                   
        
        }
                System.out.println("el numero que usted inserto fue:" + x);
                hol.llenar(x);
                System.out.println(hol.gethola());
}
        
        System.out.println("------Calculadora-------" + hol.gethola());
        
        hol.sumar();
        calcul.imprimir();
        
        for(String cadena :arbol) {
            System.out.println(cadena);
        }
    }
    
}
