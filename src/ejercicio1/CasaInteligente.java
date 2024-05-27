/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author USUARIO
 */
public class CasaInteligente {

    public static void main(String[] args) {
        
        double consumoInicial = 1200.0; 
        double reduccionPorcentaje = 15.0;

        double reduccionConsumo = consumoInicial * (reduccionPorcentaje / 100);
        double ahorroAnual = Math.sqrt(reduccionConsumo);
        System.out.println("Ahorro de energia anual: " + ahorroAnual + " kWh");

        double[] consumosElectrodomesticos = {150.5, 200.0, 75.3, 120.7, 160.9};

        double maxConsumo = Double.MIN_VALUE;
        double minConsumo = Double.MAX_VALUE;

        for (double consumo : consumosElectrodomesticos) {
            if (consumo > maxConsumo) {
                maxConsumo = consumo;
            }
            if (consumo < minConsumo) {
                minConsumo = consumo;
            }
        }

        System.out.println("Maximo consumo de energia: " + maxConsumo + " kWh");
        System.out.println("Minimo consumo de energia: " + minConsumo + " kWh");
    }
}
