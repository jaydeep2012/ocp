package que7;

public final class Immutable1 implements Cloneable{
	private Address address;
	public Immutable1(Address address){
		this.address=new Address();
		this.address.setCity(address.getCity());
		this.address.setState(address.getState());
		
	}
	public Address getAddress(){
		Address address = new Address();
		address.setCity(this.address.getCity());
		address.setState(this.address.getState());
		return address;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("you can not clone");
	}
	public static void main(String[] args) {
		Address address=new Address();
		address.setCity("Lewisville");
		address.setState("TX");
		Immutable1 ima=new Immutable1(address);
		address.setCity("Irving");
		System.out.println(ima.getAddress().getCity());
		
	}
}