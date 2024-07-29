package Practice;

public class palindrome {
	public static String reverseString(String S) {
		if (S.isEmpty()) {
			return S;
		}
		return reverseString(S.substring(1)) + S.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aba";
		String name = reverseString(s);
		if (s.equals(name)) {
			System.out.println(0);

		} else {
			System.out.println(1);
		}

	}
}
