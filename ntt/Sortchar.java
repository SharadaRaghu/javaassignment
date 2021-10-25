package ntt;

import java.util.Arrays;

public class Sortchar {
	static void sortmyString(String string)
	{
		char[] arr = string.toCharArray();
		Arrays.sort(arr);
		System.out.print(String.valueOf(arr));
		
	}

	
	public static void main (String[] args)
	{
		String x = "goodeveningindia";
		sortmyString(x);
	}
}
