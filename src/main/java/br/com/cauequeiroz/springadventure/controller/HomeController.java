package br.com.cauequeiroz.springadventure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.cauequeiroz.springadventure.repository.ProductRepository;

@Controller
public class HomeController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/home")
	public String test(Model model) {
		
		model.addAttribute("products", productRepository.findAll());		
		return "home";
	}
}
