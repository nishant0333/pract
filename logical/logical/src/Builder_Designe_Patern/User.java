package Builder_Designe_Patern;

//Builder Design Pattern is a type of creational design pattern

//it separate the construction of a complex object from its representation 
//so that the same construction process can create different representations

//Builder pattern helps us in creating immutable classes
//with large set of state attributes

public class User {
	
	//All final attributes
private final String firstName;
private final String LastName;
private final int age;
private final String phone;
private final String address;


private User(UserBuilder builder) {
	
	this.firstName = builder.firstName;
	this.LastName=builder.lastName;
	this.age=builder.age;
	this.phone=builder.phone;
	this.address=builder.address;
}

//All Getter no Setter to provide immutability
public String getFirstName() {
	return firstName;
}


public String getLastName() {
	return LastName;
}


public int getAge() {
	return age;
}


public String getPhone() {
	return phone;
}


public String getAddress() {
	return address;
}

public static class UserBuilder{
	
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;
	
	//Default Constructor of UserBuilder
	public UserBuilder() {}
	
	
	//First name method of UserBuilder whose return type is UserBuilder type 
	public UserBuilder firstName(String firstName) {
		this.firstName=firstName;
		return this;
	}
	
	public UserBuilder lastName(String lastName) {
		this.lastName=lastName;
		return this;
		}
	
	
	public UserBuilder age(int age) {
		this.age=age;
		return this;
		}
	public UserBuilder phone(String phone) {
		this.phone=phone;
		return this;
		}
	public UserBuilder address(String address) {
		this.address=address;
		return this;
		}
	//return the finally constructed user object
	public User build() {
		User user=new User(this);
		return user;
	}
}

@Override
public String toString() {
	return "User [firstName=" + firstName + ", LastName=" + LastName + ", age=" + age + ", phone=" + phone
			+ ", address=" + address + "]";
}

}
