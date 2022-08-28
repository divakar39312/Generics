package com.Bridgelabz;

public class MaximumGenerics {
	/**
	 * @param str1 taking first value
	 * @param str2 taking second value
	 * @param str3 taking third value
	 * @return returning the result which is maximum
	 */
	public static String findStringMax(String str1, String str2, String str3) {
		String max = str1;
		
		if (str2.compareTo(max) > 0 && str2.compareTo(str3) > 0)
			max = str2;
		
		else if (str3.compareTo(max) > 0)
			max = str3;
		return max;
	}
}
