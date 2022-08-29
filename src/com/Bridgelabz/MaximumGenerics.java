package com.Bridgelabz;

public class MaximumGenerics<T extends Comparable<T>> {
	/**
	 * 
	 * @param <T>
	 * @param x   - Taking the first value
	 * @param y   - Taking the second value
	 * @param z   - Taking the third value
	 * @return maximum of 3 values
	 */
	public static <T extends Comparable<T>> T toPrintMax(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0 && y.compareTo(z) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
}