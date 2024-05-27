/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author USUARIO
 */
public class Inversion {

    public static void main(String[] args) {
        
        double inversionInicial = 10000.0; 
        double tasaInteresAnual = 0.06; 
        int anos = 5; 

        double valorFuturo = inversionInicial * Math.pow(1 + tasaInteresAnual, anos);
        double valorFuturoRedondeado = Math.round(valorFuturo);
        double valorFuturoRedondeoHaciaArriba = Math.ceil(valorFuturo);
        double valorFuturoRedondeoHaciaAbajo = Math.floor(valorFuturo);

        System.out.println("Valor futuro de la inversion: " + valorFuturo);
        System.out.println("Valor futuro redondeado: " + valorFuturoRedondeado);
        System.out.println("Valor futuro redondeado hacia arriba: " + valorFuturoRedondeoHaciaArriba);
        System.out.println("Valor futuro redondeado hacia abajo: " + valorFuturoRedondeoHaciaAbajo);
    }
}
