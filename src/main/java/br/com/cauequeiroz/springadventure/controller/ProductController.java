package br.com.cauequeiroz.springadventure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cauequeiroz.springadventure.dto.ProductDTO;
import br.com.cauequeiroz.springadventure.model.Product;
import br.com.cauequeiroz.springadventure.repository.ProductRepository;

@Controller
@RequestMapping("product")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("create")
	public String createView() {
		return "create";
	}
	
	@PostMapping("processCreate")
	public String processCreate(ProductDTO productDTO) {
		Product product = productDTO.toProduct();
		productRepository.save(product);
		
		return "redirect:/home";
	}
}
