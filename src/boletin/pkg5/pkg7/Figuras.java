/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg5.pkg7;

import java.util.Scanner;

/**
 *
 * @author slagogonzalez
 */
public class Figuras {
       private final double PI = 3.14;
    private double lado,base,altura,radio;
    private Scanner sc = new Scanner (System.in);
    
    // constructores
    public Figuras(){
        
    }
    public Figuras(double lado,double base,double altura,double radio){
        this.lado = lado;
        this.base = base;
        this.altura = altura;
        this.radio = radio;
    }
    
    //Metodos 
    
    public void triangulo(){
        System.out.print("Introduzca el base de su triangulo:");
        base = sc.nextFloat();
        System.out.print("Introduzca la altura de su triangulo:");
        altura = sc.nextFloat();
        System.out.println("El area de su triangulo es "+(base*altura/2)+" unidades cuadradas.");
        sc.nextLine();
    }
    public void cuadrado(){
        System.out.print("Introduzca la lado de su cuadrado:");
        lado = sc.nextFloat();
        System.out.println("El area de su cuadrado es "+Math.pow(lado,2)+" unidades cuadradas.");
        sc.nextLine();
    }
    
    public void circulo(){
        System.out.print("Introduzca el radio de su circunferencia:");
        radio=sc.nextFloat();
        System.out.println("El area de su circulo es "+(PI*Math.pow(radio, 2))+" unidades cuadradas");
        sc.nextLine();
    }
    
    
    
}

