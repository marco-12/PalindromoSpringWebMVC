package it.dstech.formazione.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class ControlloPalindromi {


	@RequestMapping(value = "/palindromo", method = RequestMethod.POST)
	public ModelAndView Palindromo(@RequestParam("testo") String testo, Model model) {
		
		GestioneFrase gestione = new GestioneFrase();	
		
		model.addAttribute("contaParole", gestione.contaParole(testo));
		model.addAttribute("contatoreParolePalindrome", gestione.contaParolePalindrome(testo));
		model.addAttribute("parolePalindrome", gestione.parolePalindrome);
		
		return new ModelAndView("risultato", "testo", model);
	}

}
