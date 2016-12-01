public class Contact {

	private String name;
	private Tel[] tels = new Tel[50];
	private Address address;

	public Contact() {}
	public Contact(String name, Tel[] tels, Address address) {
		this.name = name;
		this.tels = tels;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Tel[] getTels() {
		return tels;
	}

	public void addTel(Tel tel) {
		this.tels = tels;
	}


	public void setTels(Tel[] tels) {
		this.tels = tels;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}