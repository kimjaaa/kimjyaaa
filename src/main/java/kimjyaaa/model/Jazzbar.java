package kimjyaaa.model;

public class Jazzbar {

	String name;
	String address;
	String phone;

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Jazzbar [jazzbar=" + name + ", address=" + address + ", phone=" + phone + "]";
	}

}
