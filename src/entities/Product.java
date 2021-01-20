package entities;

public class Product {

	private String nameProduct;
	private Double priceProduct;
	
	public Product() {
		
	}
	
	public Product(String nameP, double priceP) {
		this.nameProduct = nameP;
		this.priceProduct = priceP;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public Double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(Double priceProduct) {
		this.priceProduct = priceProduct;
	}
	
	
	
	
}
