/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.thiagocordeiro2;

import java.util.Scanner;
//java.util|.*;
/**
 *
 * @author ALUNO
 */
public class Thiago {
    public static void main(String[] args) {
        
    
 Scanner thiago = new Scanner(System.in);
       double media, nota1, nota2;
        
        System.out.println("Informe a nota 1(Peso 2): ");
        nota1 = thiago.nextDouble();
        
        System.out.println("Informe a nota 2(Peso 3):");
        nota2 = thiago.nextDouble();
        media=(nota1+nota2)/2;
        
        System.out.println("Essa é a média do aluno: " + (nota1*2 + nota2*3)/5);
        
        
    }

   
}

