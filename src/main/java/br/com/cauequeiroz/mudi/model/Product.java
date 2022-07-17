package br.com.cauequeiroz.mudi.model;

public class Product {
	private String name;
	private String description;
	private String url;
	private String imageUrl;
	private double price;
	private String date;

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getUrl() {
		return url;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public double getPrice() {
		return price;
	}

	public String getDate() {
		return date;
	}
}
