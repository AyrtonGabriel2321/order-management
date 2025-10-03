package entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	private Productn productn;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Double price, Productn productn) {
		this.quantity = quantity;
		this.price = price;
		this.productn = productn;
	}

	public Productn getProductn() {
		return productn;
	}

	public void setProduct(Product product) {
		this.productn = productn;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double subTotal() {
		return price * quantity;
	}
	@Override
	public String toString() {
		return getProductn().getName()+", $"
	+String.format("%.2f", price)+", Quantity"+
				quantity+
				", Subtotal: $"+
				String.format("%.2f", subTotal());
	}
	
}