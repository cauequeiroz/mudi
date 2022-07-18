package br.com.cauequeiroz.springadventure.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cauequeiroz.springadventure.dto.ProductDTO;
import br.com.cauequeiroz.springadventure.model.Product;
import br.com.cauequeiroz.springadventure.model.Status;
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
		product.setStatus(Status.WAITING);
		
		productRepository.save(product);		
		return "redirect:/home";
	}
	
	@GetMapping("update")
	public String updateView(HttpServletRequest request, Model model) {
		int id = Integer.valueOf(request.getParameter("id"));
		Product product = productRepository.findById(id).get();		
		
		model.addAttribute("product", product);
		return "update";
	}
	
	@PostMapping("processUpdate")	
	public String processUpdate(Product product) {
		productRepository.save(product);		
		return "redirect:/home";
	}
	
	@GetMapping("remove")
	public String processRemove(HttpServletRequest request) {
		int id = Integer.valueOf(request.getParameter("id"));
		
		productRepository.deleteById(id);		
		return "redirect:/home";
	}
}
