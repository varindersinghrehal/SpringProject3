package base;

public class Employee {

	private int id;
	private String name;
	private Address address;

	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Employee() {
		System.out.println("......");
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Employee: id=" + this.id + ", name=" + this.name
				+ ", address=" + this.address;
	}


}
