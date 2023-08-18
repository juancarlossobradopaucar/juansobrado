/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_java;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Proyecto_java {

    public static void main(String[] args) {
        System.out.println("CALCULADORA");
        
        System.out.println("SUMA");
        //INSERTADOS UNA LIBERA PARA USA LA CONSOLA
        Scanner entrada = new Scanner( System.in);
        //CREAMOS LAS VARIABLES A USAR PARA LOS DATOS
        int a,b,suma;
        //INGRESAMOS EL PRIMER NUMERO A SUMAR
        System.out.println("Digite el primer numero:");
        a=entrada.nextInt();
        //INGRESAMO EL SEGUNDO NUMERO A SUMAR
        System.out.println("Digite el segundo numero:");
        b=entrada.nextInt();
        //CREAMOS LA VARIABLE QUE SUMARA LOS DATOS
        suma = a+b;
        //SALIDA DE LOS DATOS INGRESADOS Y SU RESULTADO
        System.out.println("EL RESULTADO DE ESTA SUMA ES: "+ suma);
       
        System.out.println("RESTA");
        //CREAMOS LAS  VARIABLES A USAR PARA LOS DATOS
        int c,d,resta;
        //INGRESAMOS EL PRIMER NUMERO A RESTA
        System.out.println("Digite el primer numero:");
        c=entrada.nextInt();
        //INGRESAMO EL SEGUNDO NUMERO A RESTA
        System.out.println("Digite el segundo numero:");
        d=entrada.nextInt();
        //CREAMOS LA VARIABLE QUE SUMARA LOS DATOS
        resta = c-d;
        //SALIDA DE LOS DATOS INGRESADOS Y SU RESULTADO
        System.out.println("EL RESULTADO DE ESTA RESTA ES: "+ resta);
        
         System.out.println("DIVICION");
        //CREAMOS LAS  VARIABLES A USAR PARA LOS DATOS
        int e,f,divicion;
        //INGRESAMOS EL PRIMER NUMERO A RESTA
        System.out.println("Digite el primer numero:");
        e=entrada.nextInt();
        //INGRESAMO EL SEGUNDO NUMERO A RESTA
        System.out.println("Digite el segundo numero:");
        f=entrada.nextInt();
        //CREAMOS LA VARIABLE QUE SUMARA LOS DATOS
        divicion = e/f;
        //SALIDA DE LOS DATOS INGRESADOS Y SU RESULTADO
        System.out.println("EL RESULTADO DE ESTA DIVICION ES: "+ divicion);
        
         System.out.println("MULTIPLICACION");
        //CREAMOS LAS  VARIABLES A USAR PARA LOS DATOS
        int g,h,multiplicacion;
        //INGRESAMOS EL PRIMER NUMERO A RESTA
        System.out.println("Digite el primer numero:");
        g=entrada.nextInt();
        //INGRESAMO EL SEGUNDO NUMERO A RESTA
        System.out.println("Digite el segundo numero:");
        h=entrada.nextInt();
        //CREAMOS LA VARIABLE QUE SUMARA LOS DATOS
        multiplicacion = g*h;
        //SALIDA DE LOS DATOS INGRESADOS Y SU RESULTADO
        System.out.println("EL RESULTADO DE ESTA MULTIPLICACION ES: "+ multiplicacion);
       
        
    }    
}

