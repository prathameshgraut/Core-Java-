package Exception_Handling;

public class Test2 {

	static String m1() {
		
		//System.exit(0); This Method Use to Stop The Code  
		System.exit(0);
		try {
			System.out.println(10 / 1);
			return "return try block";

		} catch (Exception e) {
			System.out.println("Arthematic Error");

			return "return catch Block";

		}

		finally {

			System.out.println("Always Be Excuted Block");
			return "return Finally Block";
		}

		//So Return Only Finally Block Value bcoz Finally Block Always Be Excuted 
		
	}

	public static void main(String[] args) {
		System.out.println(m1());
	}
}
