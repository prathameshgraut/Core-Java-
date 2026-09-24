package OOP;

public class Test {

	public static void main(String[] args) {

		Voter vObj = new Voter();
		
		vObj.setId(11);
		vObj.setName("Prathamesh");
		vObj.setAddress("Pune");
		vObj.setAge(24);

		votingForm vf = new votingForm();
		String Msg= vf.Person(vObj);
		System.out.println(Msg);
		
		getDetails gd = new getDetails();
		gd.data(vObj);
	}

}

//Encapsulation 
class Voter {
	private int id;
	private String name;
	private String address;
	private int age;

	// Set Values
	void setId(int id) {
		id = id;
	}

	void setName(String nam) {
		name = nam;
	}

	void setAddress(String ads) {
		address = ads;
	}

	void setAge(int ag) {
		age = ag;
	}

	// Retrive values
	int getId() {
		return id;
	}

	String getName() {
		return name;
	}

	String getAddress() {
		return address;
	}

	int getAge() {
		return age;
	}
}


//Check eligiblity
class votingForm {
	String Person(Voter v) {
		if (v.getAge() > 18) {
			return "Your Are Eligiable For Voting";
		}
		return "Your Are Not Eligiable For Voting";
	}
}

//Retrive All Data
class getDetails {
	void data(Voter v) {
		System.out.println("Id:"+v.getId()+" "+" Name:"+v.getName()+" "+" Address:"+v.getAddress()+" "+" Age:"+v.getAge());
	}
}
