/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closing_the_tweets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author jaime
 */
public class Closing_The_tweets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        int num_tweets, num_acciones, click, contador;
        boolean tweets[];

        System.out.println("Introduce el número de tweets: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num_tweets = Integer.parseInt(br.readLine());
        tweets = new boolean[num_tweets];
        Arrays.fill(tweets, false);
        System.out.println("Numero de acciones: ");

        num_acciones = Integer.parseInt(br.readLine());

        for (int i = 0; i < num_acciones; i++) {

            contador = 0;

            System.out.println("Escribe tu acción: (CLICK NUM o CLOSEALL)");
            String accion = br.readLine();

            switch (accion.toUpperCase()) {

                case "CLOSEALL":
                    Arrays.fill(tweets, false);
                    break;
                default:
                    if (accion.length() > 6) {
                        click = Integer.parseInt(accion.substring(6));
                        if (click >= 0 && click < tweets.length) {
                            tweets[click] = true;
                        }
                    }
                    else{
                        System.err.println("Tamaño de acción incorrecto");
                    }
            }

            for (int j = 0; j < tweets.length; j++) {
                if (tweets[j]) {
                    contador++;
                }
            }

            System.out.println("Número de tweets abiertos: " + contador);

        }

    }

}
