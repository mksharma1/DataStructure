
public class PatternMatching {

	public static void main(String[] args) {
		String name="Mohit Sharma";
		String fname="Mohit";
		boolean b = name.contains(fname);
		if(b) {
			System.out.println("pattern found");
		}
		else {
			System.out.println("Pattern not found");
			
		}
	}
}
