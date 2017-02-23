package net.academia;

public class OrderDetail extends Order {
	

	private String productCode;
	private int quantityOrder;
	private double priceEach;
	private int orderLineNumber;
	
	//CONSTRUCTOR
	public OrderDetail(){
		super();
		orderNumber=-1;
		productCode="";
		quantityOrder=-1;
		priceEach=-1.0;
		orderLineNumber=-1;	
	}
	
	

	public OrderDetail(Order order, int ordN, String prodCod, int quantOrd, double pricE, int ordLN ){
		super(order);
		orderNumber= ordN;
		productCode = prodCod;
		quantityOrder = quantOrd;
		priceEach = pricE;
		orderLineNumber = ordLN;
		
		
	}
	
	
	
	
	//GETS AND SETS


	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public int getQuantityOrder() {
		return quantityOrder;
	}

	public void setQuantityOrder(int quantityOrder) {
		this.quantityOrder = quantityOrder;
	}

	public double getPriceEach() {
		return priceEach;
	}

	public void setPriceEach(double priceEach) {
		this.priceEach = priceEach;
	}

	public int getOrderLineNumber() {
		return orderLineNumber;
	}

	public void setOrderLineNumber(int orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}
	
	
	
	

}
