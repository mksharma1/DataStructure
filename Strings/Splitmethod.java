
public class Splitmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names="Mohit,Gunjan,Sharma,Ahuja";
		String name[]= names.split(",");
		for(String n:name) {
			System.out.println(n);
		}
	}

}
