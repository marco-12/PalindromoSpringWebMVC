package it.dstech.formazione.controller;

import java.util.ArrayList;
import java.util.List;

public class GestioneFrase {

	List<String> parolePalindrome = new ArrayList<String>();

	public int contaParole(String testo) {
		String[] frase = testo.split(" ");
		return frase.length;

	}

	public int contaParolePalindrome(String testo) {
		int contatoreParolePalindrome = 0;
		String[] frase = testo.split(" ");

		for (int i = 0; i < frase.length; i++) {
			if (checkPalindromo(frase[i])) {
				parolePalindrome.add(frase[i]);
				contatoreParolePalindrome++;
			}
		}
		return contatoreParolePalindrome;
	}

	public boolean checkPalindromo(String testo) {
		String[] parola = testo.split("");
		for (int i = 0; i < parola.length / 2; i++) {
			int contrario = parola.length - i - 1;
			if (!parola[i].equalsIgnoreCase(parola[contrario])) {
				return false;
			}
		}
		return true;
	}

}
