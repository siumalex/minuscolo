/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _20241119_4id_campos_minuscoloapp.java;

import java.util.Scanner;

/**
 *
 * @author ospite
 */
public class Minuscolo {

    static final int TANTI = 30;
    private String parola;
    char[] minuscolo = new char[TANTI];

    public void Scan() {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci una parola : ");
        parola = in.next();

    }

    public void trasfromaMinuscolo() {
        // trasforma la stringa letta in un array di caratteri
        for (int x = 0; x < parola.length(); x++) {
            minuscolo[x] = parola.charAt(x);
        }

        // trasforma la parola in minuscolo
        for (int x = 0; x < parola.length(); x++) {
            minuscolo[x] = Character.toLowerCase(minuscolo[x]); // in minuscolo  
        }
    }

    public void StampaRisultato() {
        System.out.print("La parola in minuscolo (array) : ");
        // visualizza la parola carattere per carattere
        for (int x = 0; x < minuscolo.length; x++) {
            System.out.print(minuscolo[x]);
        }

        // trasformo da array di caratterI a stringa
        String parolaMinu = new String(minuscolo);
        System.out.print("\nLa parola in minuscolo (oggetto): ");
        System.out.println(parolaMinu);
    }

}
