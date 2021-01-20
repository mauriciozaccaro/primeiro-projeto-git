package entities;

public class OrderItem {

	private Integer quantityItem;
	private double priceItem;
	
	//private Product product;
	
	public OrderItem() {
		
	}
	
	public double subTotal(int quantItem, double priItem) {
		return quantItem * priItem;
	}
	
	
	public OrderItem(int quantityI, double priceI) {
		this.quantityItem = quantityI;
		this.priceItem = priceI;
	}

	public Integer getQuantityItem() {
		return quantityItem;
	}

	public void setQuantityItem(Integer quantityItem) {
		this.quantityItem = quantityItem;
	}

	public double getPriceItem() {
		return priceItem;
	}

	public void setPriceItem(double priceItem) {
		this.priceItem = priceItem;
	}
	
	
	
	
	
}
