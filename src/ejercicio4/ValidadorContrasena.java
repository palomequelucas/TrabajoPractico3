/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author USUARIO
 */
public class ValidadorContrasena {

    public static void main(String[] args) {
        String contrasena1 = "Password1!";
        String contrasena2 = "pass";
        String contrasena3 = "StrongPass!2";

        validarContrasena(contrasena1);
        validarContrasena(contrasena2);
        validarContrasena(contrasena3);
        
        String componente1 = "Secure";
        String componente2 = "123";
        String componente3 = "#$%";
        String contrasenaSegura = construirContrasenaSegura(componente1, componente2, componente3);
        System.out.println("Contraseña segura construida: " + contrasenaSegura);
    }

    // Metodo para validar una contraseña
    public static void validarContrasena(String contrasena) {
        System.out.println("Validando contraseña: " + contrasena);
        boolean tieneLongitudAdecuada = verificarLongitud(contrasena);
        boolean tieneDigitoNumerico = verificarDigitoNumerico(contrasena);
        boolean tieneCaracterEspecial = verificarCaracterEspecial(contrasena);

        System.out.println("Tiene al menos 8 caracteres: " + (tieneLongitudAdecuada ? "Sí" : "No"));
        System.out.println("Contiene al menos un digito numérico: " + (tieneDigitoNumerico ? "Sí" : "No"));
        System.out.println("Contiene al menos un caracter especial: " + (tieneCaracterEspecial ? "Sí" : "No"));
        System.out.println("-------------------------------------------------");
    }

    
    public static boolean verificarLongitud(String contrasena) {
        return contrasena.length() >= 8;
    }

    public static boolean verificarDigitoNumerico(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    // Método para verificar si una contraseña contiene al menos un carácter especial
    public static boolean verificarCaracterEspecial(String contrasena) {
        String caracteresEspeciales = "!@#$%^&*";
        for (char c : contrasena.toCharArray()) {
            if (caracteresEspeciales.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }

    // Método para construir una contraseña segura utilizando StringBuilder
    public static String construirContrasenaSegura(String componente1, String componente2, String componente3) {
        StringBuilder contrasenaSegura = new StringBuilder();
        contrasenaSegura.append(componente1);
        contrasenaSegura.append(componente2);
        contrasenaSegura.append(componente3);

        

        return contrasenaSegura.toString();
    }
}

