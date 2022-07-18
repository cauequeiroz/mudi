package br.com.cauequeiroz.springadventure.dto;

import br.com.cauequeiroz.springadventure.model.Product;

public class ProductDTO {

	private String name;

	private String description;

	private String imageUrl;

	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product toProduct() {
		Product product = new Product();
		product.setName(name);
		product.setDescription(description);
		product.setImageUrl(imageUrl);
		product.setPrice(price);
		
		return product;
	}
}
