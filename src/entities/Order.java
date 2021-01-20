package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	
	private List<OrderItem> orderItem = new ArrayList<>();		
	
	public double totalOrderValue(int quantidade, double preco) {
		double soma = 0;
		
		for(OrderItem x: orderItem) {
			
			soma = quantidade * preco;
		}
				
		return soma;
	}
	
	public Order() {
		
	}
	
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		orderItem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderItem.remove(item);
	}	

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}
}
