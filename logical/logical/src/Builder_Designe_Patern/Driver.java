package Builder_Designe_Patern;

public class Driver {

	public static void main(String[] args) {
		User user1=new User.UserBuilder()
				.firstName("Prakash")
				.lastName("Ranjan")
				.age(30)
				.phone("1234567")
				.address("Address 1234")
				.build();
System.out.println(user1);

User user2=new User.UserBuilder().firstName("ram").lastName("raja").build();
System.out.println(user2);
	}

}
