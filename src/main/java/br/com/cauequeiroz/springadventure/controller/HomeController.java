package br.com.cauequeiroz.springadventure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cauequeiroz.springadventure.model.Status;
import br.com.cauequeiroz.springadventure.repository.ProductRepository;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public String allProducts(Model model) {
		model.addAttribute("products", productRepository.findAll());		
		return "home";
	}
	
	@GetMapping("/{status}")
	public String productsByStatus(@PathVariable(name = "status") String status, Model model) {
		status = status.toUpperCase();
		
		model.addAttribute("products", productRepository.findByStatus(Status.valueOf(status)));
		model.addAttribute("status", status);
		return "home";
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public String onError() {
		return "redirect:/home";
	}
}
