package kr.co.informationhiding;

public class Customer {
	private String FirstName;
	private String LastName;
	private int Age;
	String Address;
	String Description;
	public int getAge() {
		return Age;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setAge(int age) {
		Age = age;
	}	
	
	
	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Customer(String firstname, String lastname) {
		this.FirstName=firstname;
		this.LastName=lastname;
	}


}
