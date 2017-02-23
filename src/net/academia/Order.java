package net.academia;

public class Order {

	//ATRIB
	
	private int orderNumber;
	private String orderDate;
	private String requireDate;
	private String shippedDate;
	private enum Status {waiting, inProgress, finished}	
	private Status status;
	private String coments;
	private int custumerNumber;
	
	//CONSTRUCTOR
	public Order(){
		orderNumber=0;
		orderDate="";
		requireDate="";
		shippedDate="";
		status= Status.waiting;
		coments ="";
		custumerNumber=-1;
	}
	
	public Order(Order order){
		this.orderNumber=order.getOrderNumber();
		this.orderDate=order.getComents();
		this.requireDate=order.getComents();
		this.shippedDate=order.getShippedDate();
		this.status=order.getStatus();
		this.coments=order.getComents();
		this.custumerNumber=order.getCustumerNumber();				
	}
	
	
	public Order(int ordN, String ordD, String reqD, String shipD, Status stat, String com, int custN){
		orderNumber=ordN;
		orderDate= ordD;
		requireDate=reqD;
		shippedDate=shipD;
		status= stat;
		coments =com;
		custumerNumber=custN;
		
	}
	
	

	//SET AND GET
	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getRequireDate() {
		return requireDate;
	}

	public void setRequireDate(String requireDate) {
		this.requireDate = requireDate;
	}

	public String getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(String shippedDate) {
		this.shippedDate = shippedDate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getComents() {
		return coments;
	}

	public void setComents(String coments) {
		this.coments = coments;
	}

	public int getCustumerNumber() {
		return custumerNumber;
	}

	public void setCustumerNumber(int custumerNumber) {
		this.custumerNumber = custumerNumber;
	}

	
	
	//TO STRING
	@Override
	public String toString() {
		return "Order [orderNumber=" + orderNumber + ", orderDate=" + orderDate + ", requireDate=" + requireDate
				+ ", shippedDate=" + shippedDate + ", status=" + status + ", coments=" + coments + ", custumerNumber="
				+ custumerNumber + "]";
	}
	
	
	
	
}
