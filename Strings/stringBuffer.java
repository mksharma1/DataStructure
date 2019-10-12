

public class stringBuffer {
	// 987bv68a667
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "987bv+++==68a667";
		str = convert(str);
		System.out.println(str);

	}

	public static String convert(String str) {
		StringBuffer sb = new StringBuffer(str);
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) < 48 || sb.charAt(i) > 57) {
				sb.deleteCharAt(i);
				i--;
			}
		}
		
		return sb.toString();
	}

}
