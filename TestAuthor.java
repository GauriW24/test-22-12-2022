
public class TestAuthor {

	public static void main(String[] args) {
		Author a=new Author();
		System.out.println(a);
		
		Author a1=new Author("Gauri","Wadekar"); 
		a1.setfirstName("Gauri");
		a1.setlastName("Wadekar");
		System.out.print("\nFirst name: " + a1.getfirstName());
		System.out.print("\nLast name: " + a1.getlastName());
		
		
		Author a2=new Author("Gauri","Wadekar","Radhey"); 
		
		System.out.println(a2.toString());
		

	}

}
