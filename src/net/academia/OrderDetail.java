package net.academia;

public class OrderDetail extends Order {
	
	private int orderNumber;
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
	
	public OrderDetail(OrderDetail orderDetail){
		
	}
	

}
