package que5;



public class Order {
	private Status orderStatus=Status.NEW;

	public Status getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Status orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
	public static void main(String[] args) {
		Order order = new Order();
		order.setOrderStatus(Status.PLACED);
		System.out.println(Status.NEW.ordinal());
		for(Status status:Status.values()){
			System.out.println(status.name()+status.ordinal());
		}
		Status shipped = Status.valueOf("SHIPPED");
		System.out.println(shipped);
		System.out.println(Season.FALL.getLevel());
	}


}
