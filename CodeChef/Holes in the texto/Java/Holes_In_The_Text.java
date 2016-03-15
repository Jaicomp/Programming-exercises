/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holes_in_the_text;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ENGLISH:
 *
 * Explain: Chef wrote some text on a piece of paper and now he wants to know
 * how many holes are in the text. What is a hole? If you think of the paper as
 * the plane and a letter as a curve on the plane, then each letter divides the
 * plane into regions. For example letters "A", "D", "O", "P", "R" divide the
 * plane into two regions so we say these letters each have one hole. Similarly,
 * letter "B" has two holes and letters such as "C", "E", "F", "K" have no
 * holes. We say that the number of holes in the text is equal to the total
 * number of holes in the letters of the text. Help Chef to determine how many
 * holes are in the text.
 *
 * INPUT: The first line contains a single integer T <= 40, the number of test
 * cases. T test cases follow. The only line of each test case contains a
 * non-empty text composed only of uppercase letters of English alphabet. The
 * length of the text is less then 100. There are no any spaces in the input.
 *
 * OUTPUT:
 *
 * For each test case, output a single line containing the number of holes in
 * the corresponding text.
 *
 * SPANISH:
 *
 * Se trata de pedir de un número de palabras, que después por entrada Standard
 * de teclado vamos a introducir y a procesar. Las restricciones es que las
 * palabras siempre tendrán como máximo una longitud de 100 caracteres y estarán
 * siempre en mayúsculas. La idea es tratar las palabras de manera que contamos
 * el numero de agujeros que tienen en total. Por ejemplo: A = 1 agujero, B = 2
 * agujeros, E = 0 agujeros
 *
 *
 *
 * @author jaime
 */
public class Holes_In_The_Text {

    /**
     * @param args the command line arguments
     */
    public static char one_hole[] = {'A', 'D', 'G', 'O', 'P', 'Q', 'R'};
    public static char two_holes[] = {'B'};

    /*
    * I use Standard Input to get the number of words
    * @return int
     */
    public static int get_number_words() {
        BufferedReader br;
        int number_words = -1;
        do {
            try {
                System.out.println("How many words you want to try? (Remember Uppercase) (Maximum 40 words)");
                br = new BufferedReader(new InputStreamReader(System.in));
                number_words = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.err.println("Error: Incorrect number.");
                number_words = -1;
            }

        } while (number_words < 0 || number_words > 40);
        return number_words;
    }

    /*
    * I use Standard Input to get a word
    * @return String
     */
    public static String get_word() {
        BufferedReader br;
        String word = "";
        try {

            System.out.println("Introduce your word: (Maximum 100 characters)");
            br = new BufferedReader(new InputStreamReader(System.in));
            word = br.readLine();
            word = word.toUpperCase();

        } catch (Exception e) {
            System.err.println("Error: Incorrect word.");
        }
        return word;
    }

    /*
    * I process a word and then I return the number of holes of this word
    * @parameter String
    * @return int
     */
    public static int hole_processing(String word) {
        int counter = 0;
        if (word.length() != 100) {
            for (int j = 0; j < word.length(); j++) {

                for (int k = 0; k < one_hole.length; k++) {
                    if (word.charAt(j) == one_hole[k]) {
                        counter++;
                    }
                }

                for (int k = 0; k < two_holes.length; k++) {
                    if (word.charAt(j) == two_holes[k]) {
                        counter+=2;
                    }
                }

            }

        }
        return counter;

    }

    /*
    * Main
     */
    public static void main(String[] args) {

        BufferedReader br;

        int counter_holes = 0;
        int number_words;

        String word = "";

        number_words = get_number_words();

        for (int i = 0; i < number_words; i++) {
            counter_holes = 0;

            word = get_word();
            counter_holes = hole_processing(word);
            System.out.println("Number of holes: " + counter_holes);
        }

    }

}
