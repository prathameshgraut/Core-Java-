package Exception_Handling;

public class Test {
	
	
	
	void add(String name ,int a,int b) {
		try {
		System.out.println(name+(a/b));
		}catch(Exception e ) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Test t =new Test();
		t.add(null,10, 1);
	}
	
}


