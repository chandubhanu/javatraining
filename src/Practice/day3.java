package Practice;

import java.util.Collections;

public class day3 {
	public static String reverseWord(String str)
    {
		if(str.isEmpty())
		{
			return str;
		}
		return reverseWord(str.substring(1))+str.charAt(0);
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(reverseWord("Prakash"));
	}

}
