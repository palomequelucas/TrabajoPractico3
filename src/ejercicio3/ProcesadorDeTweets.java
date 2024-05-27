/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author USUARIO
 */
public class ProcesadorDeTweets {

    public static void main(String[] args) {
        String tweet1 = "Este es un ejemplo de tweet que vamos a procesar.";
        String tweet2 = "Este tweet es mucho más largo y probablemente necesitara verificación para asegurar que cumple con el limite de caracteres establecidos por Twitter.";
        String usuario = "@usuario";
        String hashtag = "#EjemploHashtag";

        procesarTweet(tweet1, usuario, hashtag);
        procesarTweet(tweet2, usuario, hashtag);
    }

    public static void procesarTweet(String tweet, String usuario, String hashtag) {
        int longitud = calcularLongitud(tweet);
        boolean esValido = verificarLimiteCaracteres(longitud);

        System.out.println("Tweet original: " + tweet);
        System.out.println("Longitud del tweet: " + longitud + " caracteres");
        System.out.println("¿Cumple con el limite de 280 caracteres?: " + (esValido ? "Si" : "No"));

        if (esValido) {
            String tweetConHashtag = concatenarHashtag(tweet, usuario, hashtag);
            System.out.println("Tweet con hashtag: " + tweetConHashtag);
        } else {
            System.out.println("El tweet no cumple con el limite de caracteres y no se le ha añadido el hashtag.");
        }
        System.out.println("-------------------------------------------------");
    }

    public static int calcularLongitud(String tweet) {
        return tweet.length();
    }

    public static boolean verificarLimiteCaracteres(int longitud) {
        return longitud <= 280;
    }

    public static String concatenarHashtag(String tweet, String usuario, String hashtag) {
        if (tweet.startsWith(usuario)) {
            return tweet + " " + hashtag;
        } else {
            return tweet;
        }
    }
}
