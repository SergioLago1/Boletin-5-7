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
public class Boletin57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Figuras obxFiguras = new Figuras();
        Scanner sc = new Scanner(System.in);
        System.out.println("Figura de la cual desea saber su area:\n1) Triangulo.\n2) Cuadrado.\n3) Circulo.");
        int selector = sc.nextInt();
        sc.nextLine();
        switch(selector){
            case 1: obxFiguras.triangulo();
                break;
            case 2: obxFiguras.cuadrado();
                break;
            case 3: obxFiguras.circulo();
                break;
            default:System.out.println("Opcion incorrecta.");
        }
        
        
    }
    
}
    

