package br.com.cauequeiroz.mudi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.cauequeiroz.mudi.model.Product;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String test(Model model) {
		
		Product product = new Product();
		product.setName("Nintendo Switch");
		product.setDescription("Nintendo Switch is designed to fit your life, transforming from home console to portable system in a snap.");
		product.setPrice(298.95);
		product.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/61-PblYntsL.__AC_SY300_SX300_QL70_FMwebp_.jpg");
		
		List<Product> order = new ArrayList<>();
		order.add(product);
		order.add(product);
		order.add(product);
		
		model.addAttribute("order", order);
		
		return "home";
	}
}
